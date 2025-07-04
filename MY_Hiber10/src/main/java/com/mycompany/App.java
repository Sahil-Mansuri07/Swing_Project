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
       
    Configuration configuration =new Configuration();
    configuration.configure();
    
    SessionFactory sessionFactory=configuration.buildSessionFactory();
    
    Session session=sessionFactory.openSession();
    
    Student student=session.find(Student.class,9);

    
    System.out.println(student.getRoll()+"=<>="+student.getName()+"=<>="+student.getPercent());
       
Student student2=session.find(Student.class,9);

    
    System.out.println(student2.getRoll()+"=<>="+student2.getName()+"=<>="+student2.getPercent());
       
    
//    
//    student.setName("Anil Kapoor");
//    student.setPercent(15.63);
//   
//    session.save(student);
//    
//    Transaction transaction=session.beginTransaction();
//    
//    student.setName("Arjun Kapoor");

//    transaction.commit();
    
    session.close();
    sessionFactory.close();
    
    	
    	
    System.out.println( "Hello World!" );
    
    }
}
