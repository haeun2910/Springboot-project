package com.example.project_2.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "boards")
public class Board {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @OneToMany(mappedBy = "board")
    private List<Article> articles = new ArrayList<>();

    public Board() {
    }

    public Board(String name) {
        this.name = name;
    }
}
