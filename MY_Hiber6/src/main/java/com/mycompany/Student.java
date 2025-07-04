package com.mycompany;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {

	@Id
	int roll;
	String name;
	Double percent;
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getPercent() {
		return percent;
	}
	public void setPercent(Double percent) {
		this.percent = percent;
	}
	
     

}
