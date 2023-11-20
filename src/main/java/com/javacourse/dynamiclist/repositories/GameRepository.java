package com.javacourse.dynamiclist.repositories;

import com.javacourse.dynamiclist.entities.Game;
import com.javacourse.dynamiclist.projectios.GameProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface GameRepository extends JpaRepository<Game, Long> {

    @Query(nativeQuery = true, value = """
			SELECT
			    game.id,
			    game.title,
			    game.created_year AS `year`,
			    game.img_url AS imgUrl,
			    game.short_description AS shortDescription,
			    game_category_assoc.position,
			FROM
			    game
			INNER JOIN
			    game_category_assoc ON game.id = game_category_assoc.game_id
			INNER JOIN
			    game_category ON game_category.id = game_category_assoc.category_id
			WHERE
			    game_category_assoc.category_id = :categoryId
			ORDER BY
			    game_category_assoc.position;
			""")
	List<GameProjection> searchByCategory(Long categoryId);
}
