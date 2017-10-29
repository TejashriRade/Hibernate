package com.hcode.StudentHibo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class UpdateStudentH 
{
    public static void main( String[] args )
    {
    
    
        Configuration con= new Configuration().configure().addAnnotatedClass(StudentH.class);
        SessionFactory sf= con.buildSessionFactory();
        Session ss= sf.openSession();
        
       
        Transaction ts= ss.beginTransaction();
        
        //update tejashri to teju
        StudentH s= ss.get(StudentH.class, 1);
        s.setFirst_name("Teju");
        
        System.out.println("Update name");
        System.out.println(s);
        
        //delete id 4 
        ss.createQuery("delete from StudentH where id=4").executeUpdate();
        
      
       
       ts.commit();
        
    }
}
