package com.github.jlran;

public class Book {
	private String name;
	private String date;;
	private String auther;
	private int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getAuther() {
		return auther;
	}
	public void setAuther(String auther) {
		this.auther = auther;
	}
	public Book(){
		
	}
	public Book(int id, String name, String auther, String date){
		this.name = name;
		this.date = date;
		this.auther = auther;
		this.id = id;
	}
}
