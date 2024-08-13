package com.example.project_2.controller;

import com.example.project_2.model.Article;
import com.example.project_2.service.ArticleService;
import com.example.project_2.service.BoardService;
import com.example.project_2.service.CommentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/boards")
public class ArticleController {


    private final ArticleService articleService;

    private final CommentService commentService;
    private final BoardService boardService;

    public ArticleController(ArticleService articleService, CommentService commentService, BoardService boardService) {
        this.articleService = articleService;
        this.commentService = commentService;
        this.boardService = boardService;
    }
    @GetMapping("/articles/create")
    public String createView(
            Model model
    ) {
        model.addAttribute("boards", boardService.readAllBoards());
        model.addAttribute("article", new Article());

        return "articles/create-article.html";
    }
    @PostMapping("/articles/create")
    public String createArticle(
            @RequestParam("board-id")
            Long boardId,
            @RequestParam("title")
            String title,
            @RequestParam("content")
            String content,
            @RequestParam("password")
            String password,
            Model model
            ){
        model.addAttribute("boardId", boardId);
        Article created = articleService.createArticle(boardId,title, content, password);


        return "redirect:/boards/" + boardId ;
    }
    @GetMapping("/{boardId}/articles/{articleId}/update")
    public String updateArticleView(Model model, @PathVariable("articleId") Long articleId,@PathVariable Long boardId) {
        Article article = articleService.getArticleById(articleId);
        if (article == null) {
            // Handle the case where the article doesn't exist
            return "error"; // Assuming you have an error page
        }
        model.addAttribute("article", article);
        model.addAttribute("boardId", boardId);
        return "articles/update-article";
    }
    @PostMapping("/articles/{articleId}/update")
    public String updateArticle(
            @PathVariable Long articleId,
            @RequestParam String title,
            @RequestParam String content,
            @RequestParam String password,
            Model model) {

        // Verify the password
        if (!articleService.verifyPassword(articleId, password)) {
            // Fetch the article to repopulate the form
            Article article = articleService.getArticleById(articleId);
            if (article == null) {
                return "error"; // Handle the case where the article doesn't exist
            }

            // Fetch the boardId to return to the correct board
            Long boardId = articleService.getBoardIdByArticleId(articleId);

            // Add necessary attributes back to the model
            model.addAttribute("error", "Incorrect password");
            model.addAttribute("article", article);
            model.addAttribute("boardId", boardId);

            return "articles/update-article"; // Return the same update form with an error
        }

        // Perform the update
        articleService.updateArticle(articleId, title, content);

        // Redirect to the updated article view
        Long boardId = articleService.getBoardIdByArticleId(articleId);
        return "redirect:/boards/" + boardId ;
    }
    @GetMapping("{boardId}/articles/{articleId}/delete")
    public String deleteArticleView(
            @PathVariable("articleId") Long articleId,
            @PathVariable Long boardId,
            Model model) {
        model.addAttribute("articleId", articleId);
        model.addAttribute("boardId", boardId);
        return "articles/confirm-delete"; // This should be the Thymeleaf template for confirmation
    }

    @PostMapping("/articles/{articleId}/delete")
    public String deleteArticle(
            @PathVariable("articleId") Long articleId,
            @RequestParam("password") String password,
            Model model) {
        Long boardId = articleService.getBoardIdByArticleId(articleId);

        if (articleService.verifyPassword(articleId, password)) {
            articleService.deleteArticle(articleId);
            return "redirect:/boards/" + boardId;
        } else {
            model.addAttribute("error", "Incorrect password");
            return "articles/confirm-delete"; // Redirect back to the confirmation page with an error
        }
    }


}





