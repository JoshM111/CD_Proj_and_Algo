package com.examples.solo_proj.services;

import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;
import com.example.solo_proj.repositorites.IngredientRepository;
import com.examples.solo_proj.models.Ingredient;

@Service
public class IngredientService {
private IngredientRepository iRepo;
	
	public IngredientService(IngredientRepository repo) {
		this.iRepo = repo;
	}
//	shortened Ingredients to Ing for ease of use when calling methods.
	public Ingredient getOneIng(Long id) {
		return this.iRepo.findById(id).orElse(null);
	}
//	public Ingredient addIng(Ingredient addIng) {
//		for( x =0; x<name.length; x ++) {
//			createIng(name[x], amount[x], measurement[x]);
//		}
//	}
//	function () {
//	    name  = sessionStorage.getAttribute("name");
//	    for ( x = 0; x  < name.length; x ++) {
//	        createIngredient(name[x], quantity[x]);
//	    }
	public Ingredient createIng(Ingredient newIngredient) {
		return this.iRepo.save(newIngredient);
	}
	public List<Ingredient> getAllIngs() {
		return iRepo.findAll();
	}
	public Ingredient findIng(Long id) {
		Optional<Ingredient> optionalIngredient = iRepo.findById(id);
		if (optionalIngredient.isPresent()) {
			return optionalIngredient.get();
		} else {
			return null;
		}
	}
	public Ingredient updateIng(Long id, Ingredient updatedIngredient) {
		return this.iRepo.save(updatedIngredient);
	}
	public void deleteIng(Long id) {
		this.iRepo.deleteById(id);
	}
}
