package com.mycompany;
 import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Question {

@Id
 Integer qid;
 String ques;
 
 @OneToMany(cascade = CascadeType.ALL)
 List<Answer> ans;

 public Integer getQid() {
	return qid;
 }

 public void setQid(Integer qid) {
	this.qid = qid;
 }

 public String getQues() {
	return ques;
 }

 public void setQues(String ques) {
	this.ques = ques;
 }

 public List<Answer> getAns() {
	return ans;
 }

 public void setAns(List<Answer> ans) {
	this.ans = ans;
 }
 
	
}
