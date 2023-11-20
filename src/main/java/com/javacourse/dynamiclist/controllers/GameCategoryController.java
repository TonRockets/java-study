package com.javacourse.dynamiclist.controllers;

import com.javacourse.dynamiclist.dto.GameCategoryDTO;
import com.javacourse.dynamiclist.services.GameCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/categories")
public class GameCategoryController {

    @Autowired
    private GameCategoryService gameCategoryService;

    @GetMapping
    public List<GameCategoryDTO> findAllCategory() {
        return gameCategoryService.findAll();
    }
}
