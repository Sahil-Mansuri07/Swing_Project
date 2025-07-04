package com.mycompany;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Answer {

    @Id
    private int aid;

    private String ans;

    @ManyToOne
 Question ques;

 
    
 public Integer getAid() {
	return aid;
 }

 public void setAid(Integer aid) {
	this.aid = aid;
 }

 public String getAns() {
	return ans;
 }

 public void setAns(String ans) {
	this.ans = ans;
 }

 public Question getQues() {
	return ques;
 }

 public void setQues(Question ques) {
	this.ques = ques;
 }
 	
}
