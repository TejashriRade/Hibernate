package com.hcode.StudentHibo;



import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class QueryStudentH 
{
    public static void main( String[] args )
    {
    	//create object
    
    
        Configuration con= new Configuration().configure().addAnnotatedClass(StudentH.class);
        SessionFactory sf= con.buildSessionFactory();
        Session ss= sf.openSession();
        
       
        Transaction ts= ss.beginTransaction();
        
        //query student---list of all student
       List <StudentH> thestud =ss.createQuery("from StudentH").list();
       
       System.out.println("Student Who have last name Patil");
       
       
       //Query student last name patil
       thestud=ss.createQuery("from StudentH s where s.last_name='Patil'").list();
      //display value lastname
       for(StudentH s:thestud)
       {
    	   System.out.println(s);
       }
       System.out.println();
        
       
       
       //query student last name rade and firtname Tejashri
       thestud=ss.createQuery("from StudentH s where last_name='Rade' or first_name='Tejashri'").list();
      //display value
       for(StudentH s:thestud)
       {
    	   System.out.println(s);
       }
       System.out.println();
       
       
       
       //email with love2 code.com
       thestud=ss.createQuery("from StudentH s where s.email like '%love2code.com'").list();
       for(StudentH s:thestud)
       {
    	   System.out.println(s);
       }
       System.out.println();
       
       System.out.println("with love2code.com");
       
       ts.commit();
        
    }
}
