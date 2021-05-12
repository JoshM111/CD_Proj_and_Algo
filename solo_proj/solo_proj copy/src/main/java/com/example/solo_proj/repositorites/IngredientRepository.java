package com.example.solo_proj.repositorites;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.examples.solo_proj.models.Ingredient;

@Repository
public interface IngredientRepository extends CrudRepository <Ingredient, Long> {
	List<Ingredient> findAll();
}
