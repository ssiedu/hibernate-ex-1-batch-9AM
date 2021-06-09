package com.ssi;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class AddAccount {

	public static void main(String[] args) {
		
		Configuration config=new Configuration().configure();
		Session session=config.buildSessionFactory().openSession();
		Transaction tr=session.beginTransaction();
		Account account=new Account();
		account.setAno(1001);
		account.setName("abcd");
		account.setBalance(50000);
		account.setType("saving");
		session.save(account);
		tr.commit();
		session.close();
		System.out.println("Data Stored Successfully....!!");

	}

}
