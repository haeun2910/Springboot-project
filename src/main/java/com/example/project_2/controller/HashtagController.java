//package com.example.project_2.controller;
//
//import com.example.project_2.model.Article;
//import com.example.project_2.service.ArticleService;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//
//import java.util.List;
//
//@Controller
//@RequestMapping("/hashtags")
//public class HashtagController {
//
//    private final ArticleService articleService;
//
//    public HashtagController(ArticleService articleService) {
//        this.articleService = articleService;
//    }
//
//    @GetMapping("/articles/hashtag/{tag}")
//    public String getArticlesByHashtag(@PathVariable String tag, Model model) {
//        List<Article> articles = articleService.findArticlesByHashtag(tag);
//        model.addAttribute("articles", articles);
//        return "comments/comments";  // or whatever your template is
//    }
//}
//
