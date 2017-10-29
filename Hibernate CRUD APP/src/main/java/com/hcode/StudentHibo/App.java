package com.hcode.StudentHibo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	//create object
    	StudentH s= new StudentH(0, null, null, null);
    	
      /* 
        StudentH s1= new StudentH(1,"Tejashri","Rade","rade.tejashri3@gmail.com");
        StudentH s2= new StudentH(2,"Rani","Patil","rani@gmail.com");
      */
    
        Configuration con= new Configuration().configure().addAnnotatedClass(StudentH.class);
        SessionFactory sf= con.buildSessionFactory();
        Session ss= sf.openSession();
        
       
        Transaction ts= ss.beginTransaction();
        
        /*save it to mysql
        	ss.save(s1);
        	ss.save(s2);
        */
        
        //read object from mysql 
        s=ss.get(StudentH.class, 3);
        System.out.println(s);
        
       
       ts.commit();
        
    }
}
