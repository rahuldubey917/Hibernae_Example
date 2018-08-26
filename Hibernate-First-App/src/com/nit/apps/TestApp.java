package com.nit.apps;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestApp {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory sf = cfg.buildSessionFactory();
		Session hsession = sf.openSession();
		Transaction tx = hsession.beginTransaction();

		//Storing the data in Pojo class object
		Products p = new Products();
		p.setPid(102);
		p.setBauther("UT");
		p.setBname("javascript");
		p.setBprice(450);
		
		//showing data to inserted into table
        
		int Pid=p.getPid();
		String Bname=p.getBname();
		int Bprice=p.getBprice();
		String Bauther=p.getBauther();
       System.out.println("pid="+Pid);		
       System.out.println("bname="+Bname);		
       System.out.println("bprice="+Bprice);		
       System.out.println("bauther="+Bauther);		
		
		//	Inserting data into Table
		hsession.save(p);

		tx.commit();
		System.out.println("data inserted successfully");
		hsession.close();

	}

}
