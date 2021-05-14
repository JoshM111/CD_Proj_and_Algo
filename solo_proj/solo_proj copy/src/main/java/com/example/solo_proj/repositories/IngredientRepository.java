package com.example.solo_proj.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.solo_proj.models.Ingredient;

@Repository
public interface IngredientRepository extends CrudRepository <Ingredient, Long> {
	List<Ingredient> findAll();
}
