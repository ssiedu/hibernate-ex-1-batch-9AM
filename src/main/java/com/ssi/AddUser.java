package com.ssi;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class AddUser {

	public static void main(String[] args) {
		
		Configuration config=new Configuration().configure();
		Session session=config.buildSessionFactory().openSession();
		Transaction tr=session.beginTransaction();
		User u1=new User("ab@gmail.com","abc","indore");
		User u2=new User("cd@gmail.com","cde","bhopal");
		User u3=new User("ef@gmail.com","efg","mumbai");
		User u4=new User("gh@gmail.com","ghi","delhi");
		u1.getFollowers().add(new User("cd@gmail.com"));
		u1.getFollowers().add(new User("ef@gmail.com"));
		u2.getFollowers().add(new User("ef@gmail.com"));
		u2.getFollowers().add(new User("gh@gmail.com"));
		session.save(u1); session.save(u2); session.save(u3); session.save(u4);
		tr.commit();
		session.close();
		System.out.println("data stored...!");

	}

}
