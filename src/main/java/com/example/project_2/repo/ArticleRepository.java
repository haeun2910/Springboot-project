package com.example.project_2.repo;

import com.example.project_2.model.Article;
import com.example.project_2.model.Board;
//import com.example.project_2.model.Hashtag;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

public interface ArticleRepository extends JpaRepository<Article, Long> {

    List<Article> findByBoardId(Long boardId);
    @Query("SELECT a FROM Article a WHERE a.board.id = :boardId AND a.createdDate > :createdDate ORDER BY a.createdDate ASC")
    Optional<Article> findNextArticleInBoard(Long boardId, LocalDateTime createdDate);

    @Query("SELECT a FROM Article a WHERE a.board.id = :boardId AND a.createdDate < :createdDate ORDER BY a.createdDate DESC")
    Optional<Article> findPreviousArticleInBoard(Long boardId, LocalDateTime createdDate);

    @Query("SELECT a FROM Article a WHERE a.createdDate > :createdDate ORDER BY a.createdDate ASC")
    Optional<Article> findNextArticleInAllBoards(LocalDateTime createdDate);

    @Query("SELECT a FROM Article a WHERE a.createdDate < :createdDate ORDER BY a.createdDate DESC")
    Optional<Article> findPreviousArticleInAllBoards(LocalDateTime createdDate);
//    List<Article> findByHashtagsContaining(String hashtag);
//    List<Article> findByHashtags(Hashtag hashtag);
// Search within a specific board
    List<Article> findByBoardIdAndTitleContainingIgnoreCase(Long boardId, String title);
    List<Article> findByBoardIdAndContentContainingIgnoreCase(Long boardId, String content);

}



