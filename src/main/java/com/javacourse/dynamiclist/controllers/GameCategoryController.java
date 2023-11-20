package com.javacourse.dynamiclist.controllers;

import com.javacourse.dynamiclist.dto.GameCategoryDTO;
import com.javacourse.dynamiclist.dto.GameDTO;
import com.javacourse.dynamiclist.services.GameCategoryService;
import com.javacourse.dynamiclist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/categories")
public class GameCategoryController {

    @Autowired
    private GameCategoryService gameCategoryService;

    @Autowired
    private GameService gameService;

    @GetMapping
    public List<GameCategoryDTO> findAllCategory() {
        return gameCategoryService.findAll();
    }

    @GetMapping(value = "/{categoryId}/games")
    public List<GameDTO> findByCategory(@PathVariable Long categoryId) {
        return gameService.findByCategory(categoryId);
    }
}
