package com.cg.employees.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="skills")
public class Skills {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private Integer employeeId;
	private String name;
	private String description;
	private String proficiencyLevel;
	private Integer rating;
	
	
	
	public Skills() {}

	public Skills(Integer id, Integer employeeId, String name, String description, String proficiencyLevel,
			Integer rating) {
		super();
		this.id = id;
		this.employeeId = employeeId;
		this.name = name;
		this.description = description;
		this.proficiencyLevel = proficiencyLevel;
		this.rating = rating;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getProficiencyLevel() {
		return proficiencyLevel;
	}
	public void setProficiencyLevel(String proficiencyLevel) {
		this.proficiencyLevel = proficiencyLevel;
	}
	public Integer getRating() {
		return rating;
	}
	public void setRating(Integer rating) {
		this.rating = rating;
	}

//	@Override
//	public String toString() {
//		return "Skills [id=" + id + ", employeeId=" + employeeId + ", name=" + name + ", description=" + description
//				+ ", proficiencyLevel=" + proficiencyLevel + ", rating=" + rating + "]";
//	}
	
	
	

}
