package com.cg.employees.dto;
import java.time.LocalDate;

 

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


public class CertificatesDTO {
   
    private Integer id;
    private Integer employeeId;
    private String skillName;
    private String description;
    private LocalDate dateOfIssue;
    private LocalDate dateOfExpiry;
    private Integer score;
    private Integer passingScore;
    private Integer maxScore;
    private double scorePercentage;
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
    public String getSkillName() {
        return skillName;
    }
    public void setSkillName(String skillName) {
        this.skillName = skillName;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public LocalDate getDateOfIssue() {
        return dateOfIssue;
    }
    public void setDateOfIssue(LocalDate dateOfIssue) {
        this.dateOfIssue = dateOfIssue;
    }
    public LocalDate getDateOfExpiry() {
        return dateOfExpiry;
    }
    public void setDateOfExpiry(LocalDate dateOfExpiry) {
        this.dateOfExpiry = dateOfExpiry;
    }
    public Integer getScore() {
        return score;
    }
    public void setScore(Integer score) {
        this.score = score;
    }
    public Integer getPassingScore() {
        return passingScore;
    }
    public void setPassingScore(Integer passingScore) {
        this.passingScore = passingScore;
    }
    public Integer getMaxScore() {
        return maxScore;
    }
    public void setMaxScore(Integer maxScore) {
        this.maxScore = maxScore;
    }
    public double getScorePercentage() {
        return scorePercentage;
    }
    public void setScorePercentage(double scorePercentage) {
        this.scorePercentage = scorePercentage;
    }



 

}

