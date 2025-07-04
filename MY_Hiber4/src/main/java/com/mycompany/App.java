package com.mycompany;

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
   
   Question question1=new Question();
   
   question1.setQid(1001);
   question1.setQues("What is your name?");
   
   Question question2=new Question();
   
   question2.setQid(1002); 	
   question2.setQues("Which is your favourite game?");
   
   Question question3=new Question();
   
   question3.setQid(1003);
   question3.setQues("who is your favourite actor?");
   
   Answer answer1=new Answer();
   
   answer1.setAid(101);
   answer1.setAns("Sahil Mansuri");
   
   Answer answer2=new Answer();
   
   answer2.setAid(102);
   answer2.setAns("Cricket");
   
   Answer answer3=new Answer();
   
   answer3.setAid(103);
   answer3.setAns("RDJ");
   
   question1.setAns(answer1);
   question2.setAns(answer2);
   question3.setAns(answer3);
   
   
   answer1.setQues(question1);
   answer2.setQues(question2);
   answer3.setQues(question3);
   
   session.save(question1);
   session.save(question2);
   session.save(question3);
   session.save(answer1);
   session.save(answer2);
   session.save(answer3);
   
   
   Transaction transaction=session.beginTransaction();
   
   transaction.commit();
   
   session.close();
   sessionFactory.close();
    	
    	System.out.println( "Hello World!" );
   
    }
}
