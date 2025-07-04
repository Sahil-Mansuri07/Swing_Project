package com.mycompany;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {

	@Id
	Integer roll;
	String name;
	Float percent;
	public Integer getRoll() {
		return roll;
	}
	public void setRoll(Integer roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Float getPercent() {
		return percent;
	}
	public void setPercent(Float percent) {
		this.percent = percent;
	}
	
	
}
