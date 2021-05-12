package com.examples.solo_proj.services;

import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;
import com.example.solo_proj.repositorites.RecipeRepository;
import com.examples.solo_proj.models.Recipe;
import com.examples.solo_proj.models.User;

@Service
public class RecipeService {
private RecipeRepository rRepo;
	
	public RecipeService(RecipeRepository repo) {
		this.rRepo = repo;
	}
	public Recipe getOneRecipe(Long id) {
		return this.rRepo.findById(id).orElse(null);
	}

	public Recipe createRecipe(Recipe newIdea) {
		return this.rRepo.save(newIdea);
	}
	public List<Recipe> getAllRecipes() {
		return rRepo.findAll();
	}
	public Recipe findRecipe(Long id) {
		Optional<Recipe> optionalRecipe = rRepo.findById(id);
		if (optionalRecipe.isPresent()) {
			return optionalRecipe.get();
		} else {
			return null;
		}
	}
	public Recipe updateRecipe(Long id, Recipe updatedRecipe) {
		return this.rRepo.save(updatedRecipe);
	}
	public void deleteRecipe(Long id) {
		this.rRepo.deleteById(id);
	}
	public void addLiker(User user, Recipe recipe) {
		List<User> likers = recipe.getLikedRecipes();
		likers.add(user);
		this.rRepo.save(recipe);
	}
	public void removeLiker(User user, Recipe recipe) {
		List<User> likers = recipe.getLikedRecipes();
		likers.remove(user);
		this.rRepo.save(recipe);
	}
}
