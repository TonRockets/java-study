package com.javacourse.dynamiclist.dto;

import com.javacourse.dynamiclist.entities.GameCategory;
import com.javacourse.dynamiclist.projectios.GameProjection;

public class GameCategoryDTO {
    private Long id;
    private String name;

    public GameCategoryDTO(){}
    public GameCategoryDTO(GameCategory categoryEntity) {
        this.id = categoryEntity.getId();
        this.name = categoryEntity.getName();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
