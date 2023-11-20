package com.javacourse.dynamiclist.entities;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.util.Objects;

@Entity
@Table(name = "game_category_assoc")
public class GameCategoryAssoc {

    @EmbeddedId
    private GameCategoryPK id = new GameCategoryPK();
    private Integer position;

    public GameCategoryAssoc() {}
    public GameCategoryAssoc(Game game, GameCategory gameCategory, Integer position) {
        this.id.setGame(game);
        this.id.setGameCategory(gameCategory);
        this.position = position;
    }

    public GameCategoryPK getId() {
        return id;
    }

    public void setId(GameCategoryPK id) {
        this.id = id;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GameCategoryAssoc that = (GameCategoryAssoc) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
