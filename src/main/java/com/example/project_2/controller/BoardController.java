package com.example.project_2.controller;

import com.example.project_2.model.Article;
import com.example.project_2.model.Board;
import com.example.project_2.service.ArticleService;
import com.example.project_2.service.BoardService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("boards")
public class BoardController {
    private final BoardService boardService;
    private final ArticleService articleService;
    public BoardController(BoardService boardService, ArticleService articleService) {
        this.boardService = boardService;
        this.articleService = articleService;
    }
    @GetMapping
    public String readAllBoards(Model model) {
        model.addAttribute("boards", boardService.readAllBoards());
        return "boards/boards.html";
    }
    @GetMapping("{boardId}")
    public String readBoard(@PathVariable Long boardId, Model model) {
        Board board = boardService.readBoard(boardId);
        List<Article> articles = boardService.getArticlesByBoardId(boardId);
        model.addAttribute("board", board);
        model.addAttribute("articles", articles);
        return "boards/board-articles.html";
    }
}
