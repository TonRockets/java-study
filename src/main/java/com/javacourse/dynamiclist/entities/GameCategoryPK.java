package com.javacourse.dynamiclist.entities;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import org.hibernate.annotations.ManyToAny;

import java.util.Objects;

@Embeddable
public class GameCategoryPK {

    @ManyToOne
    @JoinColumn(name = "game_id")
    private Game game;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private GameCategory gameCategory;

    public GameCategoryPK() {}
    public GameCategoryPK(Game game, GameCategory gameCategory) {
        this.game = game;
        this.gameCategory = gameCategory;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public GameCategory getGameCategory() {
        return gameCategory;
    }

    public void setGameCategory(GameCategory gameCategory) {
        this.gameCategory = gameCategory;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GameCategoryPK that = (GameCategoryPK) o;
        return Objects.equals(game, that.game) && Objects.equals(gameCategory, that.gameCategory);
    }

    @Override
    public int hashCode() {
        return Objects.hash(game, gameCategory);
    }
}
