package com.daddyscode.hibernate;

import javax.persistence.*;

import org.hibernate.annotations.Table;

@Entity
@Table(appliesTo = "hibernate")
public class Book {
	private long id;
	private String title;
	private String author;
	private float price;
	
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Id
	@Column(name = "book_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
	
	
}
