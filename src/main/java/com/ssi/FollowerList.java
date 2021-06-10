package com.ssi;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

public class FollowerList {

	public static void main(String[] args) {
		Configuration config=new Configuration().configure();
		Session session=config.buildSessionFactory().openSession();
		User user=session.get(User.class, "ab@gmail.com");
		System.out.println(user);
		System.out.println("Follower List : .............");
		System.out.println("__________________________________________________________________________");
		List<User> followers=user.getFollowers();
		for(User follower:followers) {
			System.out.println(follower);
		}
		System.out.println("__________________________________________________________________________");
		session.close();

	}

}
