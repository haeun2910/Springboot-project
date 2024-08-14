package com.example.project_2.controller;

import com.example.project_2.model.Article;
import com.example.project_2.model.Comment;
import com.example.project_2.service.ArticleService;
import com.example.project_2.service.BoardService;
import com.example.project_2.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("boards/{boardId}/articles")
public class CommentController {
    private final CommentService commentService;
    private final ArticleService articleService;
    private final BoardService boardService;
    public CommentController(CommentService commentService, ArticleService articleService, BoardService boardService) {
        this.commentService = commentService;
        this.articleService = articleService;
        this.boardService = boardService;
    }
    @GetMapping("/{articleId}/read")
    public String getCommentsByArticle(
            @PathVariable Long boardId,
            @PathVariable Long articleId,
            Model model) {
        Article article = articleService.getArticleById(articleId);
        if (article == null) {
            return "error";
        }
        List<Comment> comments = commentService.getCommentsByArticleId(articleId);
        Optional<Article> previousArticle = articleService.getPreviousArticle(boardId, article.getCreatedDate());
        Optional<Article> nextArticle = articleService.getNextArticle(boardId, article.getCreatedDate());

        model.addAttribute("comments", comments);
        model.addAttribute("article", article);
        model.addAttribute("previousArticle", previousArticle.orElse(null));
        model.addAttribute("nextArticle", nextArticle.orElse(null));

        return "comments/comments";
    }
    @GetMapping("{articleId}/comments/create")
    public String createCommentForm(@PathVariable("articleId") Long articleId, Model model) {
        // Fetch the article to associate with the comment
        Article article = articleService.getArticleById(articleId);
        if (article == null) {
            return "error"; // Handle the case where the article is not found
        }
        Comment comment = new Comment();
        model.addAttribute("comment", comment);
        model.addAttribute("article", article);

        return "comments/create-comment"; // This is the HTML view for creating a comment
    }
    @PostMapping("/{articleId}/comments/create")
    public String createComment(@PathVariable("articleId") Long articleId,
                                @RequestParam("content") String content,
                                @RequestParam("password") String password) {
        commentService.createComment(articleId, content, password);
        return "redirect:/boards/{boardId}/articles/" + articleId + "/read";
    }
    @GetMapping("/{articleId}/comments/{commentId}/delete")
    public String showDeleteConfirmation(@PathVariable("commentId") Long commentId,
                                         @PathVariable("boardId") Long boardId,
                                         @PathVariable("articleId") Long articleId,
                                         Model model) {
        model.addAttribute("commentId", commentId);
        model.addAttribute("articleId", articleId);
        model.addAttribute("boardId", boardId);
        return "comments/confirm-delete";
    }

    @PostMapping("/{articleId}/comments/{commentId}/confirm-delete")
    public String deleteComment(@PathVariable("commentId") Long commentId,
                                @RequestParam("password") String password,
                                @PathVariable("boardId") Long boardId,
                                @PathVariable("articleId") Long articleId,
                                Model model) {
        try {
            commentService.deleteComment(commentId, password);
            return "redirect:/boards/" + boardId + "/articles/" + articleId + "/read";
        } catch (RuntimeException e) {
            model.addAttribute("error", "Incorrect password, please try again.");
            model.addAttribute("commentId", commentId);
            model.addAttribute("articleId", articleId);
            model.addAttribute("boardId", boardId);
            return "comments/confirm-delete"; // Return to the confirmation page with an error message
        }
    }
}





