//package com.example.project_2.model;
//
//import jakarta.persistence.*;
//import lombok.Data;
//
//import java.util.HashSet;
//import java.util.List;
//import java.util.Set;
//
//@Data
//@Entity
//public class Hashtag {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//    private String tag;
//    @ManyToMany(mappedBy = "hashtags")
//    private Set<Article> articles = new HashSet<>();
//
//    public Hashtag() {
//    }
//    public Hashtag(String tagName) {
//        this.tag = tag;
//    }
//
//}
