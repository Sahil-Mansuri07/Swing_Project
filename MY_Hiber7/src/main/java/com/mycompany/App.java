package com.mycompany;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

/*
  Hello world!
 */
 
public class App 
{
    public static void main( String[] args )
    {    
    Configuration configuration=new Configuration();
   configuration.configure();
    
    SessionFactory sessionFactory=configuration.buildSessionFactory();
    
    Session session=sessionFactory.openSession();
    
    /*
    This is for fetching conditional data from Student table < or >
    */
    
    Double gt=10.3;
    Double lt=67.6;
    
Query<Student> query=session.createQuery("from Student where percent<=:lt and percent>=:gt",Student.class);
	
    query.setParameter("lt", lt);
    query.setParameter("gt", gt);
    
    
    List<Student> list=query.getResultList();
    
    for(Student student:list)
    {
    System.out.println(student.getRoll()+"==>"+student.getName()+"=>=>=>"+student.getPercent());
    	
    }
    
    
    
    
    /*  
    This is for fetching only one data from Student table
    
    
    String name="Ramlal";
    
    Query<Student> query=session.createQuery("from Student where name=:n",Student.class);
	
    query.setParameter("n", name);
    
    
    List<Student> list=query.getResultList();
    
    for(Student student:list)
    {
    System.out.println(student.getRoll()+"==>"+student.getName()+"=>=>=>"+student.getPercent());
    	
    }   */



  /*  
    This is for fetching all the data from Student table
    
    Query<Student> query=session.createQuery("from Student");
    	
    List<Student> list=query.getResultList();
    
    for(Student student:list)
    {
    System.out.println(student.getRoll()+"==>"+student.getName()+"=>"+student.getPercent());
    	
    }
 */    	
    session.close();
    sessionFactory.close();
    	
    	System.out.println( "Hello World!" );
    
    
    }
}

