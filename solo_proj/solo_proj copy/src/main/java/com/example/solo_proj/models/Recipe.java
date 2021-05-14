package com.example.solo_proj.models;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="recipes")
public class Recipe {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@NotBlank
	private String name;
	@NotBlank
	private String directions;
	@Column(updatable = false)
	//^ this applies only to the line directly after
	@DateTimeFormat(pattern = "yyyy-MM--DD HH:mm:ss")
	private Date createdAt;
	//I changed the pattern format here ^ to signify that there are different ways to gather the same data.
	@DateTimeFormat(pattern = "yyyy-MM--DD HH:mm:ss")
	private Date updatedAt;
//	
//	
	@OneToMany(mappedBy="item", cascade=CascadeType.ALL, fetch=FetchType.LAZY)
	private List<Ingredient> ingredients;
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="user_id")
	private User creator;
	@ManyToMany(fetch=FetchType.LAZY)
	@JoinTable(
			name="likes",
			joinColumns = @JoinColumn(name="recipe_id"),
			inverseJoinColumns = @JoinColumn(name="user_id")
			)
	private List<User> likedRecipes;
//	//
//	//
	public Recipe() {
	}

	public Recipe(Long id, @NotBlank String name, @NotBlank String directions, Date createdAt, Date updatedAt,
			List<Ingredient> ingredients, User creator, List<User> likedRecipes) {
		this.id = id;
		this.name = name;
		this.directions = directions;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.ingredients = ingredients;
		this.creator = creator;
		this.likedRecipes = likedRecipes;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDirections() {
		return directions;
	}
	public void setDirections(String directions) {
		this.directions = directions;
	}
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	public Date getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}
	public List<Ingredient> getIngredients() {
		return ingredients;
	}
	public void setIngredients(List<Ingredient> ingredients) {
		this.ingredients = ingredients;
	}
	public User getCreator() {
		return creator;
	}
	public void setCreator(User creator) {
		this.creator = creator;
	}
	public List<User> getLikedRecipes() {
		return likedRecipes;
	}
	public void setLikedRecipes(List<User> likedRecipes) {
		this.likedRecipes = likedRecipes;
	}
		
		
}
