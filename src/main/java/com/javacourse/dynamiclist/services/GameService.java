package com.javacourse.dynamiclist.services;

import com.javacourse.dynamiclist.dto.CompletedGameDTO;
import com.javacourse.dynamiclist.dto.GameDTO;
import com.javacourse.dynamiclist.entities.Game;
import com.javacourse.dynamiclist.projectios.GameProjection;
import com.javacourse.dynamiclist.repositories.GameCategoryRepository;
import com.javacourse.dynamiclist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    @Autowired
    private GameCategoryRepository gameCategoryRepository;

    @Transactional(readOnly = true)
    public List<GameDTO> findAll() {
      List<Game> result = gameRepository.findAll();
      return result.stream().map(GameDTO::new).toList();
    };

    @Transactional(readOnly = true)
    public CompletedGameDTO findById(Long id) {
        Game result = gameRepository.findById(id).get();
        return new CompletedGameDTO(result);
    }

    @Transactional(readOnly = true)
    public List<GameDTO> findByCategory(Long categoryId) {
        List<GameProjection> result = gameRepository.searchByCategory(categoryId);
        return result.stream().map(GameDTO::new).toList();
    };
}
