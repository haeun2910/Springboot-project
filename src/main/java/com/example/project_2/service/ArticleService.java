package com.example.project_2.service;

import com.example.project_2.model.Article;
import com.example.project_2.model.Board;
//import com.example.project_2.model.Hashtag;
import com.example.project_2.repo.ArticleRepository;
import com.example.project_2.repo.BoardRepository;
//import com.example.project_2.repo.HashtagRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Service
public class ArticleService {
    private final ArticleRepository articleRepository;
    private final BoardRepository boardRepository;
//    private final HashtagRepository hashtagRepository;
    public ArticleService(ArticleRepository articleRepository, BoardRepository boardRepository) {
        this.articleRepository = articleRepository;
        this.boardRepository = boardRepository;
//        this.hashtagRepository = hashtagRepository;
    }
    public Article createArticle(Long boardId, String title, String content, String password){
        Board board = boardRepository.findById(boardId).get();
        Article article = new Article(title, content, password);
//        Set<Hashtag> hashtags = new HashSet<>();
//
//        for (String tag : tags) {
//            // Find existing hashtag or create a new one
//            Hashtag hashtag = hashtagRepository.findByTag(tag)
//                    .orElseGet(() -> new Hashtag(tag));
//
//            // Add the hashtag to the Set
//            hashtags.add(hashtag);
//
//            // Add the article to the hashtag's articles set (bidirectional relationship)
//            hashtag.getArticles().add(article);
//        }
//
//        // Set the hashtags to the article
//        article.setHashtags(hashtags);
        article.setBoard(board);
        return articleRepository.save(article);
    }
//    private List<String> extractHashtags(String content) {
//        Pattern pattern = Pattern.compile("#(\\w+)");
//        Matcher matcher = pattern.matcher(content);
//        List<String> hashtags = new ArrayList<>();
//
//        while (matcher.find()) {
//            hashtags.add(matcher.group(1));
//        }
//
//        return hashtags;
//    }
//    public List<Article> findArticlesByHashtag(String tag) {
//        Hashtag hashtag = hashtagRepository.findByTag(tag)
//                .orElseThrow(() -> new IllegalArgumentException("Hashtag not found"));
//        return articleRepository.findByHashtags(hashtag);
//    }
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
    public Optional<Article> getNextArticle(Long boardId, LocalDateTime createdDate) {
        if (boardId != null) {
            return articleRepository.findNextArticleInBoard(boardId, createdDate);
        } else {
            return articleRepository.findNextArticleInAllBoards(createdDate);
        }
    }

    public Optional<Article> getPreviousArticle(Long boardId, LocalDateTime createdDate) {
        if (boardId != null) {
            return articleRepository.findPreviousArticleInBoard(boardId, createdDate);
        } else {
            return articleRepository.findPreviousArticleInAllBoards(createdDate);
        }
    }
    public List<Article> searchByTitle(Long boardId, String title) {
        return articleRepository.findByBoardIdAndTitleContainingIgnoreCase(boardId, title);
    }

    public List<Article> searchByContent(Long boardId, String content) {
        return articleRepository.findByBoardIdAndContentContainingIgnoreCase(boardId, content);
    }

}
