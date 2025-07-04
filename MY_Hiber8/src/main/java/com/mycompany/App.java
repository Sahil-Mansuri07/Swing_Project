package com.mycompany;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
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
    
    Query<Student> query=session.createNativeQuery("select * from Student",Student.class);
    	
    query.setFirstResult(1);
    query.setMaxResults(5);
    
    
    List<Student> list=query.getResultList();
    
    for (Student student:list)
    {
    	System.out.println(student.getRoll()+"=>>"+student.getName()+"=>>>>>"+student.getPercent());
    	
    }
    
    session.close();
    sessionFactory.close();
    	
    	
    	System.out.println( "Hello World!" );
    }
}
