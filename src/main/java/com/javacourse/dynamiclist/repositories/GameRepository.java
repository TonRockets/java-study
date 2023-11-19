package com.javacourse.dynamiclist.repositories;

import com.javacourse.dynamiclist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {

}
