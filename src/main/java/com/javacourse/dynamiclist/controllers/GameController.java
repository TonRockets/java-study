package com.javacourse.dynamiclist.controllers;

import com.javacourse.dynamiclist.dto.GameDTO;
import com.javacourse.dynamiclist.entities.Game;
import com.javacourse.dynamiclist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/games")
public class GameController {

    @Autowired
    private GameService gameService;

    @GetMapping
    public List<GameDTO> findAll() {
        return gameService.findAll();
    }
}
