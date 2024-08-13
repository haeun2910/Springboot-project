package com.example.project_2.model;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@EntityListeners(AuditingEntityListener.class)
@Table(name = "articles")
public class Article {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String title;
    @Column
    private String content;
    @Column
    private String password;
//    @CreatedDate
//    @Column
//    private LocalDateTime createdDate;

    @ManyToOne
    @JoinColumn(name = "board_id")
    private Board board;
    @OneToMany(mappedBy = "article")
    private List<Comment> comments = new ArrayList<>();
//    @ManyToMany
//    @JoinTable(
//            name = "article_hastag",
//            joinColumns = @JoinColumn(name = "article-id"),
//            inverseJoinColumns = @JoinColumn(name = "hashtag_id")
//    )
//    private List<Hashtag> hashtags;
    public Article() {
    }

    public Article(String title, String content, String password) {
        this.title = title;
        this.content = content;
        this.password = password;
    }
}
