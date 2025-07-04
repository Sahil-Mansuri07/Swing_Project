package com.mycompany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
   Configuration configuration=new Configuration(); 	
    	
   configuration.configure();
   
   SessionFactory sessionFactory=configuration.buildSessionFactory();
   
   Session session=sessionFactory.openSession();
    	
    Question question=new Question();
    
    question.setQid(1003);
    question.setQues("What is programming?");
    
    Answer answer=new Answer();
    answer.setAid(105);
    answer.setAns("Programming is giving a set of instructions to a computer to execute. ");	
    	
    Answer answer2=new Answer();
    answer2.setAid(106);
    answer2.setAns("By the help of programming languages we can make desktop applications. ");
    
    Answer answer3=new Answer();
    answer3.setAid(107);
    answer3.setAns("Programming is the act of instructing a computer to carry out a sequence of actions. ");
    
    List<Answer> list=new ArrayList<Answer>();
    list.add(answer);
    list.add(answer2);
    list.add(answer3);
    
    question.setAns(list);
    
    for(Answer localAnswer:list)
    {
    	localAnswer.setQues(question);
    
    }
    
    session.save(question);
    
    Transaction transaction=session.beginTransaction();
    
    transaction.commit();
    session.close();
    sessionFactory.close();
    
    
    System.out.println( "Hello World!" );
    
    }
}
