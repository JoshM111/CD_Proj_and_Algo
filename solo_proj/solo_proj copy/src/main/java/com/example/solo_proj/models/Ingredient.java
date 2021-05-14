package com.example.solo_proj.models;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="ingredients")
public class Ingredient {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@NotBlank
	private String name;
	@NotBlank
	@Size(min = 2, max = 6)
	private String measurement;
	@NotNull
	@Size(min = (int) .01, max= 99)
	private Double amount;
	@Column(updatable = false)
	//^ this applies only to the line directly after
	@DateTimeFormat(pattern = "yyyy-MM--DD HH:mm:ss")
	private Date createdAt;
	//I changed the pattern format here ^ to signify that there are different ways to gather the same data.
	@DateTimeFormat(pattern = "yyyy-MM--DD HH:mm:ss")
	private Date updatedAt;
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="recipe_id")
	private Recipe item;
//	
//	
	public Ingredient() {
	}

	public Ingredient(Long id, @NotBlank String name, @NotBlank @Size(min = 2, max = 6) String measurement,
			@NotNull @Size(min = 0, max = 99) Double amount, Date createdAt, Date updatedAt, Recipe item) {
		super();
		this.id = id;
		this.name = name;
		this.measurement = measurement;
		this.amount = amount;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.item = item;
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

	public String getMeasurement() {
		return measurement;
	}

	public void setMeasurement(String measurement) {
		this.measurement = measurement;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
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

	public Recipe getItem() {
		return item;
	}

	public void setItem(Recipe item) {
		this.item = item;
	}

	
}
