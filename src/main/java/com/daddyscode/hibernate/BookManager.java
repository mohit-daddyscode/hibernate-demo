package com.daddyscode.hibernate;

import org.hibernate.SessionFactory;
import org.hibernate.Session;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class BookManager {
	protected SessionFactory sessionFactory;
	
	protected void setup() {
		final StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
		        .configure() // configures settings from hibernate.cfg.xml
		        .build();
		try {
		    sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
		} catch (Exception ex) {
		    StandardServiceRegistryBuilder.destroy(registry);
		}
	}
	
	protected void exit() {
		sessionFactory.close();
	}
	
	protected void create() {
		Book book = new Book();
		book.setTitle("Norse Mythology");
		book.setAuthor("Neil Gaiman");
		book.setPrice(549);
		
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(book);
		session.getTransaction().commit();
		session.close();
	}
	
	protected void read() {
		
	}
	
	protected void update() {
		
	}
	
	protected void delete() {
		
	}
	
	public static void main(String[] args) {
		BookManager manager = new BookManager();
	    manager.setup();
	    manager.create();
	    manager.exit();
	}
}
