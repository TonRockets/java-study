package com.javacourse.dynamiclist.repositories;

import com.javacourse.dynamiclist.entities.GameCategory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameCategoryRepository extends JpaRepository<GameCategory, Long> {
}
