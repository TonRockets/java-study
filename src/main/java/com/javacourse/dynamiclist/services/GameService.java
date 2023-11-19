package com.javacourse.dynamiclist.services;

import com.javacourse.dynamiclist.dto.GameDTO;
import com.javacourse.dynamiclist.entities.Game;
import com.javacourse.dynamiclist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;
    public List<GameDTO> findAll() {
      List<Game> result = gameRepository.findAll();
      return result.stream().map(GameDTO::new).toList();
    };
}
