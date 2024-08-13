//package com.example.project_2.model;
//
//import jakarta.persistence.*;
//import lombok.Data;
//
//import java.util.List;
//
//@Data
//@Entity
//public class Hashtag {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//    private String tagName;
//    @ManyToMany(mappedBy = "hashtags")
//    private List<Article> articles;
//
//    public Hashtag() {
//    }
//    public Hashtag(String tagName) {
//        this.tagName = tagName;
//    }
//
//}
