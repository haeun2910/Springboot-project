package com.example.project_2.controller;

import com.example.project_2.model.Comment;
import com.example.project_2.service.ArticleService;
import com.example.project_2.service.BoardService;
import com.example.project_2.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("comments")
public class CommentController {
    private final CommentService commentService;
    private final ArticleService articleService;
    private final BoardService boardService;
    public CommentController(CommentService commentService, ArticleService articleService, BoardService boardService) {
        this.commentService = commentService;
        this.articleService = articleService;
        this.boardService = boardService;
    }

    @PostMapping("/create")
    public String createComment(@RequestParam Long articleId, @RequestParam String content, @RequestParam String password) {
        commentService.createComment(articleId, content, password);
        return "redirect:/articles/" + articleId;
    }

    @GetMapping("/{articleId}")
    public String getCommentsByArticle(@PathVariable Long articleId, Model model) {
        List<Comment> comments = commentService.getCommentsByArticleId(articleId);
        model.addAttribute("comments", comments);
        return "comments/comment-list";
    }

    @PostMapping("/{commentId}/delete")
    public String deleteComment(@PathVariable Long commentId, @RequestParam String password) {
        commentService.deleteComment(commentId, password);
        return "redirect:/articles/" + commentId; // Redirect to the relevant article or board
    }

}

