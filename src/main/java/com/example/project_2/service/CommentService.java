package com.example.project_2.service;

import com.example.project_2.model.Article;
import com.example.project_2.model.Comment;
import com.example.project_2.repo.ArticleRepository;
import com.example.project_2.repo.BoardRepository;
import com.example.project_2.repo.CommentRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CommentService {
    private final CommentRepository commentRepository;
    private final ArticleRepository articleRepository;
    private final BoardRepository boardRepository;
    public CommentService(CommentRepository commentRepository, ArticleRepository articleRepository, BoardRepository boardRepository) {
        this.commentRepository = commentRepository;
        this.articleRepository = articleRepository;
        this.boardRepository = boardRepository;
    }

    public void createComment(Long articleId, String content, String password) {
        Optional<Article> articleOptional = articleRepository.findById(articleId);
        if (articleOptional.isPresent()) {
            Article article = articleOptional.get();
            Comment comment = new Comment(content, password, article);
            commentRepository.save(comment);
        } else {
            throw new RuntimeException("Article not found");
        }

    }

    public List<Comment> getCommentsByArticleId(Long articleId) {
        return commentRepository.findByArticleId(articleId);
    }

    public void deleteComment(Long commentId, String password) {
        Optional<Comment> commentOptional = commentRepository.findById(commentId);
        if (commentOptional.isPresent()) {
            Comment comment = commentOptional.get();
            if (comment.getPassword().equals(password)) {
                commentRepository.delete(comment);
            } else {
                throw new RuntimeException("Password is incorrect");
            }
        } else {
            throw new RuntimeException("Comment not found");
        }
    }

    public List<Comment> getCommentsByBoardId(Long boardId) {
        List<Article> articles = articleRepository.findByBoardId(boardId);
        return commentRepository.findByArticleIdIn(articles.stream().map(Article::getId).toList());
    }

}
