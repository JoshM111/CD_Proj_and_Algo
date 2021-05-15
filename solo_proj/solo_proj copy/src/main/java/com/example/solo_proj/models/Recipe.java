package com.example.solo_proj.models;

import java.util.Date;
import java.util.List;

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
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

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
	private String step1;
	private String step2;
	private String step3;
	private String step4;
	private String step5;
	private String step6;
	private String step7;
	private String step8;
	private String step9;
	private String step0;
	private String stepSalt;
	@NotBlank
	private String ing1;
	private String ing2;
	private String ing3;
	private String ing4;
	private String ing5;
	private String ing6;
	private String ing7;
	private String ing8;
	private String ing9;
	private String ing0;
	private String ingSalt;
	@NotBlank
	@Size(max=2)
	private String mm1;
	@Size(max=2)
	private String mm2;
	@Size(max=2)
	private String mm3;
	@Size(max=2)
	private String mm4;
	@Size(max=2)
	private String mm5;
	@Size(max=2)
	private String mm6;
	@Size(max=2)
	private String mm7;
	@Size(max=2)
	private String mm8;
	@Size(max=2)
	private String mm9;
	@Size(max=2)
	private String mm0;
	@NotBlank
	@Size(max=6)
	private String qty1;
	@Size(max=6)
	private String qty2;
	@Size(max=6)
	private String qty3;
	@Size(max=6)
	private String qty4;
	@Size(max=6)
	private String qty5;
	@Size(max=6)
	private String qty6;
	@Size(max=6)
	private String qty7;
	@Size(max=6)
	private String qty8;
	@Size(max=6)
	private String qty9;
	@Size(max=6)
	private String qty0;
	@Column(updatable = false)
	//^ this applies only to the line directly after
	@DateTimeFormat(pattern = "yyyy-MM--DD HH:mm:ss")
	private Date createdAt;
	//I changed the pattern format here ^ to signify that there are different ways to gather the same data.
	@DateTimeFormat(pattern = "yyyy-MM--DD HH:mm:ss")
	private Date updatedAt;
//	
//	
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
	public Recipe(Long id, @NotBlank String name, @NotBlank String step1, String step2, String step3, String step4,
			String step5, String step6, String step7, String step8, String step9, String step0, String stepSalt,
			@NotBlank String ing1, String ing2, String ing3, String ing4, String ing5, String ing6, String ing7,
			String ing8, String ing9, String ing0, String ingSalt, @NotBlank @Size(max = 2) String mm1,
			@Size(max = 2) String mm2, @Size(max = 2) String mm3, @Size(max = 2) String mm4, @Size(max = 2) String mm5,
			@Size(max = 2) String mm6, @Size(max = 2) String mm7, @Size(max = 2) String mm8, @Size(max = 2) String mm9,
			@Size(max = 2) String mm0, @NotBlank @Size(max = 6) String qty1, @Size(max = 6) String qty2,
			@Size(max = 6) String qty3, @Size(max = 6) String qty4, @Size(max = 6) String qty5, @Size(max = 6) String qty6,
			@Size(max = 6) String qty7, @Size(max = 6) String qty8, @Size(max = 6) String qty9, @Size(max = 6) String qty0,
			Date createdAt, Date updatedAt, User creator, List<User> likedRecipes) {
		super();
		this.id = id;
		this.name = name;
		this.step1 = step1;
		this.step2 = step2;
		this.step3 = step3;
		this.step4 = step4;
		this.step5 = step5;
		this.step6 = step6;
		this.step7 = step7;
		this.step8 = step8;
		this.step9 = step9;
		this.step0 = step0;
		this.stepSalt = stepSalt;
		this.ing1 = ing1;
		this.ing2 = ing2;
		this.ing3 = ing3;
		this.ing4 = ing4;
		this.ing5 = ing5;
		this.ing6 = ing6;
		this.ing7 = ing7;
		this.ing8 = ing8;
		this.ing9 = ing9;
		this.ing0 = ing0;
		this.ingSalt = ingSalt;
		this.mm1 = mm1;
		this.mm2 = mm2;
		this.mm3 = mm3;
		this.mm4 = mm4;
		this.mm5 = mm5;
		this.mm6 = mm6;
		this.mm7 = mm7;
		this.mm8 = mm8;
		this.mm9 = mm9;
		this.mm0 = mm0;
		this.qty1 = qty1;
		this.qty2 = qty2;
		this.qty3 = qty3;
		this.qty4 = qty4;
		this.qty5 = qty5;
		this.qty6 = qty6;
		this.qty7 = qty7;
		this.qty8 = qty8;
		this.qty9 = qty9;
		this.qty0 = qty0;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
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
	public String getStep1() {
		return step1;
	}
	public void setStep1(String step1) {
		this.step1 = step1;
	}
	public String getStep2() {
		return step2;
	}
	public void setStep2(String step2) {
		this.step2 = step2;
	}
	public String getStep3() {
		return step3;
	}
	public void setStep3(String step3) {
		this.step3 = step3;
	}
	public String getStep4() {
		return step4;
	}
	public void setStep4(String step4) {
		this.step4 = step4;
	}
	public String getStep5() {
		return step5;
	}
	public void setStep5(String step5) {
		this.step5 = step5;
	}
	public String getStep6() {
		return step6;
	}
	public void setStep6(String step6) {
		this.step6 = step6;
	}
	public String getStep7() {
		return step7;
	}
	public void setStep7(String step7) {
		this.step7 = step7;
	}
	public String getStep8() {
		return step8;
	}
	public void setStep8(String step8) {
		this.step8 = step8;
	}
	public String getStep9() {
		return step9;
	}
	public void setStep9(String step9) {
		this.step9 = step9;
	}
	public String getStep0() {
		return step0;
	}
	public void setStep0(String step0) {
		this.step0 = step0;
	}
	public String getStepSalt() {
		return stepSalt;
	}
	public void setStepSalt(String stepSalt) {
		this.stepSalt = stepSalt;
	}
	public String getIng1() {
		return ing1;
	}
	public void setIng1(String ing1) {
		this.ing1 = ing1;
	}
	public String getIng2() {
		return ing2;
	}
	public void setIng2(String ing2) {
		this.ing2 = ing2;
	}
	public String getIng3() {
		return ing3;
	}
	public void setIng3(String ing3) {
		this.ing3 = ing3;
	}
	public String getIng4() {
		return ing4;
	}
	public void setIng4(String ing4) {
		this.ing4 = ing4;
	}
	public String getIng5() {
		return ing5;
	}
	public void setIng5(String ing5) {
		this.ing5 = ing5;
	}
	public String getIng6() {
		return ing6;
	}
	public void setIng6(String ing6) {
		this.ing6 = ing6;
	}
	public String getIng7() {
		return ing7;
	}
	public void setIng7(String ing7) {
		this.ing7 = ing7;
	}
	public String getIng8() {
		return ing8;
	}
	public void setIng8(String ing8) {
		this.ing8 = ing8;
	}
	public String getIng9() {
		return ing9;
	}
	public void setIng9(String ing9) {
		this.ing9 = ing9;
	}
	public String getIng0() {
		return ing0;
	}
	public void setIng0(String ing0) {
		this.ing0 = ing0;
	}
	public String getIngSalt() {
		return ingSalt;
	}
	public void setIngSalt(String ingSalt) {
		this.ingSalt = ingSalt;
	}
	public String getMm1() {
		return mm1;
	}
	public void setMm1(String mm1) {
		this.mm1 = mm1;
	}
	public String getMm2() {
		return mm2;
	}
	public void setMm2(String mm2) {
		this.mm2 = mm2;
	}
	public String getMm3() {
		return mm3;
	}
	public void setMm3(String mm3) {
		this.mm3 = mm3;
	}
	public String getMm4() {
		return mm4;
	}
	public void setMm4(String mm4) {
		this.mm4 = mm4;
	}
	public String getMm5() {
		return mm5;
	}
	public void setMm5(String mm5) {
		this.mm5 = mm5;
	}
	public String getMm6() {
		return mm6;
	}
	public void setMm6(String mm6) {
		this.mm6 = mm6;
	}
	public String getMm7() {
		return mm7;
	}
	public void setMm7(String mm7) {
		this.mm7 = mm7;
	}
	public String getMm8() {
		return mm8;
	}
	public void setMm8(String mm8) {
		this.mm8 = mm8;
	}
	public String getMm9() {
		return mm9;
	}
	public void setMm9(String mm9) {
		this.mm9 = mm9;
	}
	public String getMm0() {
		return mm0;
	}
	public void setMm0(String mm0) {
		this.mm0 = mm0;
	}
	public String getQty1() {
		return qty1;
	}
	public void setQty1(String qty1) {
		this.qty1 = qty1;
	}
	public String getQty2() {
		return qty2;
	}
	public void setQty2(String qty2) {
		this.qty2 = qty2;
	}
	public String getQty3() {
		return qty3;
	}
	public void setQty3(String qty3) {
		this.qty3 = qty3;
	}
	public String getQty4() {
		return qty4;
	}
	public void setQty4(String qty4) {
		this.qty4 = qty4;
	}
	public String getQty5() {
		return qty5;
	}
	public void setQty5(String qty5) {
		this.qty5 = qty5;
	}
	public String getQty6() {
		return qty6;
	}
	public void setQty6(String qty6) {
		this.qty6 = qty6;
	}
	public String getQty7() {
		return qty7;
	}
	public void setQty7(String qty7) {
		this.qty7 = qty7;
	}
	public String getQty8() {
		return qty8;
	}
	public void setQty8(String qty8) {
		this.qty8 = qty8;
	}
	public String getQty9() {
		return qty9;
	}
	public void setQty9(String qty9) {
		this.qty9 = qty9;
	}
	public String getQty0() {
		return qty0;
	}
	public void setQty0(String qty0) {
		this.qty0 = qty0;
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