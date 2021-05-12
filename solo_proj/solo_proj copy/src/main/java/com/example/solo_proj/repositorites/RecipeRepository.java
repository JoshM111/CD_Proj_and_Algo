package com.example.solo_proj.repositorites;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.examples.solo_proj.models.Recipe;

@Repository
public interface RecipeRepository extends CrudRepository <Recipe, Long> {
	List<Recipe> findAll();
}
