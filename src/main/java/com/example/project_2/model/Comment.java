package com.example.project_2.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "comments")
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String content;
    @Column(nullable = false)
    private String password;


    @ManyToOne
    @JoinColumn(name = "article_id")
    private Article article;

    public Comment(String content, String password, Article article) {
        this.content = content;
        this.password = password;

        this.article = article;

    }

    public Comment() {

    }
}
