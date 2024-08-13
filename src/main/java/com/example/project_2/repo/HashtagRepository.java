package com.example.project_2.repo;

import com.example.project_2.model.Hashtag;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface HashtagRepository extends JpaRepository<Hashtag, Long> {
    Optional<Hashtag> findByTagName(String tagName);
    List<Hashtag> findByArticlesId(Long articleId);

}
