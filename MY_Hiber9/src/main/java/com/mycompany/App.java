package com.mycompany;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

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

    Student student=new Student();
   
    student.setName("Tarak Mehta");
    student.setPercent(98.4);
    
    Transaction transaction=session.beginTransaction();
    
    session.save(student);
    
    transaction.commit();
    
    session.close();
    sessionFactory.close();
    
    	
    System.out.println( "Hello World!" );
    
    }
}
