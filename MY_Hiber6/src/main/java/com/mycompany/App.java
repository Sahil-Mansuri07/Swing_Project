package com.mycompany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
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
    
  	Student student=session.load(Student.class,1001);
    
    
  	System.out.println(student.getRoll()+"=>=>"+student.getName()+"=>=>"+student.getPercent());
  	
    	
    System.out.println( "Hello World!" );
    }
}
