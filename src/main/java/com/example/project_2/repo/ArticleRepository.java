package com.example.project_2.repo;

import com.example.project_2.model.Article;
import com.example.project_2.model.Board;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

public interface ArticleRepository extends JpaRepository<Article, Long> {

    List<Article> findByBoardId(Long boardId);
//    @Query("SELECT a FROM Article a WHERE a.board.id = :boardId AND a.createdDate > :createdDate ORDER BY a.createdDate ASC")
//    Optional<Article> findPreviousArticleInBoard(@Param("boardId") Long boardId, @Param("createdDate") LocalDateTime createdDate);
//
//    // Find the next article in the same board
//    @Query("SELECT a FROM Article a WHERE a.board.id = :boardId AND a.createdDate < :createdDate ORDER BY a.createdDate DESC")
//    Optional<Article> findNextArticleInBoard(@Param("boardId") Long boardId, @Param("createdDate") LocalDateTime createdDate);
//
//    // Find the previous article across all boards
//    @Query("SELECT a FROM Article a WHERE a.createdDate > :createdDate ORDER BY a.createdDate ASC")
//    Optional<Article> findPreviousArticleInAllBoards(@Param("createdDate") LocalDateTime createdDate);
//
//    // Find the next article across all boards
//    @Query("SELECT a FROM Article a WHERE a.createdDate < :createdDate ORDER BY a.createdDate DESC")
//    Optional<Article> findNextArticleInAllBoards(@Param("createdDate") LocalDateTime createdDate);


}
