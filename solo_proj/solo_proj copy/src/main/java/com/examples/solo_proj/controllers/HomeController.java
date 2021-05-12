package com.examples.solo_proj.controllers;

import java.util.List;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.examples.solo_proj.models.Ingredient;
import com.examples.solo_proj.models.Recipe;
import com.examples.solo_proj.models.User;
import com.examples.solo_proj.services.IngredientService;
import com.examples.solo_proj.services.RecipeService;
import com.examples.solo_proj.services.UserService;
import com.examples.solo_proj.validators.UserValidator;

@Controller
public class HomeController {
	@Autowired
	private UserService uService;
	@Autowired
	private UserValidator validator;
	@Autowired
	private RecipeService rService;
	@Autowired
	private IngredientService iService;
//	questions that I need to ask //
//	How can I incorporate tags as a search feature?- m2m relationship?
//	How can I allow the Users to add more ingredients to the recipe line instead of having a fixed amount
//	Landing Page- with register and login
	@GetMapping("/")
	public String index(@ModelAttribute("user") User user) {
//		List<User> user = this.uService.allUsers();
//		viewModel.addAttribute("users", user);
		return "landing.jsp";
	}
//	/User
	@PostMapping("/register")
	public String register(@Valid @ModelAttribute() User user, BindingResult result, HttpSession session) {
		validator.validate(user, result);
		if(result.hasErrors()) {
			return "landing.jsp";
		}
		User newUser = this.uService.registerUser(user);
		session.setAttribute("user__id", newUser.getId());
		return "redirect:/recipes";
	}
	@PostMapping("/login")
	public String login(@RequestParam("loginEmail") String email, @RequestParam("loginPassword") String password, RedirectAttributes redirectAttrs, HttpSession session) {
		if(!this.uService.authUser(email, password)) {
			redirectAttrs.addFlashAttribute("loginError", "Invalid Credentials");
			return "redirect:/";
		}
		User user = this.uService.getByEmail(email);
		session.setAttribute("user__id", user.getId());
		return "redirect:/recipes";
	}
	@GetMapping("/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:/";
	}
//	/Recipes
	@GetMapping("/recipes")
	public String dashboard(Model viewModel, HttpSession session) {
		Long userId = (long)session.getAttribute("user__id");
		User user=this.uService.find(userId);
		List<Recipe> recipes= this.rService.getAllRecipes();
		viewModel.addAttribute("allRecipes", recipes);
		viewModel.addAttribute("user", user);
		return "index.jsp";
	}
	@GetMapping("/recipes/new")
	public String add(@ModelAttribute("recipe") Recipe recipe) {
		return "new.jsp";
	}
	@PostMapping("/recipes/new/post")
	public String add(@Valid @ModelAttribute("recipe" + "ingredient") Recipe recipe, Ingredient ing, BindingResult result, HttpSession session, Model viewModel) {
		Long userId = (long)session.getAttribute("user__id");
		Long recipeId = (long)session.getAttribute("recipe__id");
		Recipe rec=this.rService.findRecipe(recipeId);
		User user=this.uService.find(userId);
		if(result.hasErrors()) {
			List<Recipe> recipes= this.rService.getAllRecipes();
			List<Ingredient> ings= this.iService.getAllIngs();
			viewModel.addAttribute("allRecipes", recipes);
			viewModel.addAttribute("user", user);
			viewModel.addAttribute("allIngs", ings);
			viewModel.addAttribute("recipe", rec);
			return "index.jsp";
		}else {
			rec.setCreator(user);
			ing.setItem(recipe);
			this.iService.createIng(ing);
			this.rService.createRecipe(recipe);
			return "redirect:/recipes";
		}
	}
	@GetMapping("/recipes/{id}")
	public String show(@PathVariable("id") Long id, Model viewModel, @ModelAttribute("recipe") Recipe recipe) {
		viewModel.addAttribute("recipe", this.rService.getOneRecipe(id));
		return "show.jsp";
	}
//	
	@GetMapping("/delete/{id}")
	public String delete(@PathVariable("id") Long id) {
		this.rService.deleteRecipe(id);
		return "redirect:/recipes";
	}
	
	@GetMapping("/recipes/{id}/edit")
	public String edit(@ModelAttribute("recipe") Recipe recipe, Model viewModel,@PathVariable("id") Long id) {
		viewModel.addAttribute("recipe", this.rService.getOneRecipe(id));
		return"edit.jsp";
	}
	@PostMapping("/recipes/{id}/edit")
	public String postEdit(@Valid @ModelAttribute("recipe") Recipe recipe, BindingResult result, Model viewModel, @PathVariable("id") Long id) {
		if(result.hasErrors()) {
			viewModel.addAttribute("idea", this.rService.getOneRecipe(id));
			return "edit.jsp";
		}
		this.rService.updateRecipe(id, recipe);
		return "redirect:/recipes";
	}
	@GetMapping("/like/{id}")
	public String like(@PathVariable("id") Long id, HttpSession session) {
		Long userId = (Long)session.getAttribute("user__id");
		Long recipeId = id;
		User liker = this.uService.find(userId);
		Recipe likedRecipe = this.rService.getOneRecipe(recipeId);
		this.rService.addLiker(liker, likedRecipe);
		return "redirect:/recipes";
	}
	@GetMapping("/unlike/{id}")
	public String unlike(@PathVariable("id") Long id, HttpSession session) {
		Long userId = (Long)session.getAttribute("user__id");
		Long recipeId = id;
		User liker = this.uService.find(userId);
		Recipe likedRecipe = this.rService.getOneRecipe(recipeId);
		this.rService.removeLiker(liker, likedRecipe);
		return "redirect:/recipes";
	}
//	/ingredients
//	@GetMapping("/ingredients")
//	public String ingredient(Model viewModel, HttpSession session) {
//		Long userId = (long)session.getAttribute("user__id");
//		User user=this.uService.find(userId);
//		List<Ingredient> ings= this.iService.getAllIngs();
//		viewModel.addAttribute("allIngs", ings);
//		viewModel.addAttribute("user", user);
//		return "index.jsp";
//	}
//	@GetMapping("/ingredients/new")
//	public String addIngs(@ModelAttribute("ingredient") Ingredient ing) {
//		return "new.jsp";
//	}
//	@PostMapping("/ingredients/new/post")
//	public String addIng(@Valid @ModelAttribute("ingredient") Ingredient ing, BindingResult result, HttpSession session, Model viewModel) {
//		Long recipeId = (long)session.getAttribute("recipe__id");
//		Recipe recipe=this.rService.findRecipe(recipeId);
//		if(result.hasErrors()) {
//			List<Ingredient> ings= this.iService.getAllIngs();
//			viewModel.addAttribute("allIngs", ings);
//			viewModel.addAttribute("recipe", recipe);
//			return "index.jsp";
//		}else {
//			ing.setItem(recipe);
//			this.iService.createIng(ing);
//			return "redirect:/recipes";
//		}
//	}
//	@GetMapping("/ingredients/{id}")
//	public String showIng(@PathVariable("id") Long id, Model viewModel, @ModelAttribute("ingredient") Ingredient ing) {
//		viewModel.addAttribute("ingredient", this.iService.getOneIng(id));
//		return "show.jsp";
//	}
////	
//	@GetMapping("/ingredients/delete/{id}")
//	public String deleteIng(@PathVariable("id") Long id) {
//		this.iService.deleteIng(id);
//		return "redirect:/recipes";
//	}
//	
//	@GetMapping("/ingredients/{id}/edit")
//	public String editIng(@ModelAttribute("ingredient") Ingredient ing, Model viewModel,@PathVariable("id") Long id) {
//		viewModel.addAttribute("ingredient", this.iService.getOneIng(id));
//		return"edit.jsp";
//	}
//	@PostMapping("/ingredients/{id}/edit")
//	public String postEditIng(@Valid @ModelAttribute("ingredient") Ingredient ing, BindingResult result, Model viewModel, @PathVariable("id") Long id) {
//		if(result.hasErrors()) {
//			viewModel.addAttribute("ingredient", this.iService.getOneIng(id));
//			return "edit.jsp";
//		}
//		this.iService.updateIng(id, ing);
//		return "redirect:/recipes";
//	}
//	
//	
//	
}
