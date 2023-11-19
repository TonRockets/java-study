package com.javacourse.dynamiclist.dto;

import com.javacourse.dynamiclist.entities.Game;
import jakarta.persistence.Column;

public class GameDTO {
    private Long id;
    private String title;
    private Integer createdYear;
    private String imgUrl;
    private String shortDescription;

    public GameDTO(){}

    public GameDTO(Game gameEntity){
        this.id = gameEntity.getId();
        this.title = gameEntity.getTitle();
        this.createdYear = gameEntity.getCreatedYear();
        this.imgUrl = gameEntity.getImgUrl();
        this.shortDescription = gameEntity.getShortDescription();
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Integer getCreatedYear() {
        return createdYear;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public String getShortDescription() {
        return shortDescription;
    }
}
