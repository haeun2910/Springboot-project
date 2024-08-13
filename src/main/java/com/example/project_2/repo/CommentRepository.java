package com.example.project_2.repo;

import com.example.project_2.model.Article;
import com.example.project_2.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface CommentRepository extends JpaRepository<Comment, Long> {


    List<Comment> findByArticleId(Long articleId);
    List<Comment> findByArticleIdIn(List<Long> articleIds);
}
