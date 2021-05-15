package com.example.solo_proj.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.solo_proj.models.Ingredient;
import com.example.solo_proj.services.IngredientService;



@RestController
@RequestMapping("/api")
//^ allows you to add a prefix to the routes. now all routes listed below will start with /api/
public class IngredientApiController {
	private IngredientService iService;
	
	public IngredientApiController(IngredientService service) {
		this.iService = service;
	}
	
	//Routes
	@RequestMapping("")
	//^ you need to change the route from the root when you are making this an api
	public List<Ingredient> index() {
		return this.iService.getAllIngs();
	}
	
	@RequestMapping("{id}")
	public Ingredient getIng(@PathVariable("id") Long id) {
		return this.iService.getOneIng(id);
	}
	
	@RequestMapping(value="/", method=RequestMethod.POST)
	public Ingredient create(Ingredient newIng) {
		return this.iService.createIng(newIng);
	}
}