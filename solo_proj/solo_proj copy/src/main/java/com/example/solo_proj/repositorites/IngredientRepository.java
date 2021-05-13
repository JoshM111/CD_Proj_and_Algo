package com.example.solo_proj.repositorites;

import java.util.List;

import org.springframework.data.repository.CrudRepository;


import com.examples.solo_proj.models.Ingredient;


public interface IngredientRepository extends CrudRepository <Ingredient, Long> {
	List<Ingredient> findAll();
}
