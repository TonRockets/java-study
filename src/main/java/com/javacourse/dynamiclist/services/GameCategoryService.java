package com.javacourse.dynamiclist.services;

import com.javacourse.dynamiclist.dto.GameCategoryDTO;
import com.javacourse.dynamiclist.entities.GameCategory;
import com.javacourse.dynamiclist.repositories.GameCategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameCategoryService {

    @Autowired
    private GameCategoryRepository gameCategoryRepository;

    @Transactional(readOnly = true)
    public List<GameCategoryDTO> findAll() {
        List<GameCategory> result = gameCategoryRepository.findAll();
        return result.stream().map(GameCategoryDTO::new).toList();
    };
}
