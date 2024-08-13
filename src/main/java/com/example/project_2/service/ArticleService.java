package com.example.project_2.service;

import com.example.project_2.model.Article;
import com.example.project_2.model.Board;
import com.example.project_2.repo.ArticleRepository;
import com.example.project_2.repo.BoardRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Optional;

@Service
public class ArticleService {
    private final ArticleRepository articleRepository;
    private final BoardRepository boardRepository;
    public ArticleService(ArticleRepository articleRepository, BoardRepository boardRepository) {
        this.articleRepository = articleRepository;
        this.boardRepository = boardRepository;
    }
    public Article createArticle(Long boardId, String title, String content, String password){
        Board board = boardRepository.findById(boardId).get();
        Article article = new Article(title, content, password);
        article.setBoard(board);
        return articleRepository.save(article);
    }
    public boolean verifyPassword(Long articleId, String password) {
        // Fetch the article from the database
        Article article = articleRepository.findById(articleId)
                .orElseThrow(() -> new IllegalArgumentException("Invalid article Id:" + articleId));

        // Check if the provided password matches the stored password
        return article.getPassword().equals(password);
    }
    public void updateArticle(Long articleId, String title, String content) {
        Article article = articleRepository.findById(articleId)
                .orElseThrow(() -> new IllegalArgumentException("Invalid article ID"));

        article.setTitle(title);
        article.setContent(content);

        articleRepository.save(article);
    }

    public void deleteArticle(Long articleId) {
        articleRepository.deleteById(articleId);
    }
    public Article getArticleById(Long articleId) {
        return articleRepository.findById(articleId)
                .orElseThrow(() -> new IllegalArgumentException("Invalid article Id:" + articleId));
    }
    public Long getBoardIdByArticleId(Long articleId) {
        Article article = articleRepository.findById(articleId)
                .orElseThrow(() -> new IllegalArgumentException("Invalid article Id:" + articleId));
        return article.getBoard().getId(); // Assuming your Article entity has a `getBoard()` method that returns the associated Board entity.
    }
//    public Optional<Article> getPreviousArticleInBoard(Long boardId, LocalDateTime createdDate) {
//        return articleRepository.findPreviousArticleInBoard(boardId, createdDate);
//    }
//
//    public Optional<Article> getNextArticleInBoard(Long boardId, LocalDateTime createdDate) {
//        return articleRepository.findNextArticleInBoard(boardId, createdDate);
//    }
//
//    public Optional<Article> getPreviousArticleInAllBoards(LocalDateTime createdDate) {
//        return articleRepository.findPreviousArticleInAllBoards(createdDate);
//    }
//
//    public Optional<Article> getNextArticleInAllBoards(LocalDateTime createdDate) {
//        return articleRepository.findNextArticleInAllBoards(createdDate);
//    }

}
