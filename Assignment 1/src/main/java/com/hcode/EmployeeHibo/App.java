package com.hcode.EmployeeHibo;

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

    	Trainee t1= new Trainee();
    	Trainee t2= new Trainee();
    	
    	t1.setID(1);
    	t1.setName("Tejashri");
    	t1.setTechnology("JAVA");
    	t1.setLevel(1);
    	

    	t2.setID(2);
    	t2.setName("Vijay");
    	t2.setTechnology("Devops");
    	t2.setLevel(2);
    	
    	Configuration con= new Configuration().configure().addAnnotatedClass(Trainee.class);
    	SessionFactory fs= con.buildSessionFactory();
    	Session session=fs.openSession();
    	
    	Transaction ts= session.beginTransaction();
    	
    	//saving object to mysql
    	session.save(t1);
    	session.save(t2);
    	ts.commit();
    	
    	
    }
}
