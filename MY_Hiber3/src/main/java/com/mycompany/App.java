package com.mycompany;

import java.io.FileInputStream;
import java.util.Date;

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
    try {  
    	
    Configuration configuration= new Configuration();
    configuration.configure();
    
    SessionFactory sessionFactory=configuration.buildSessionFactory();
    
    Session session =sessionFactory.openSession();
   
    Address address=session.get(Address.class,1001);
	
	  Address address1=new Address(); 
	 address1.setAdd_id(1001);
	  address1.setStreet("Gali no 1");
 address1.setCity("Mumbai"); 
	  address1.setX(10045); 
	  address1.setOpen(true); 
 address1.setDate(new Date());
	  FileInputStream fis=new
	  FileInputStream("src\\main\\java\\picc.jpg"); 
	  byte []b=new
	  byte[fis.available()];
	  fis.read(b);
address1.setImage(b);
	  Transaction transaction=session.beginTransaction(); 
	  session.save(address1); 
      
	  transaction.commit();
	    
   session.close();
   sessionFactory.close();
         System.out.println( "Hello World!" );
  
System.out.println(address1.getX()+"=>"+address1.getAdd_id()+"=>"+address1.getCity()+"=>"+address1.getStreet()+"=>"+address1.getDate()+"=>"+address1.getImage());
    
    
    }
    catch(Exception e)
    {
    	e.printStackTrace();
    	
    }
}
}
