import java.util.*;

public class Object_Classes_Constructor_Overloading
{
	public static void main(String[] args) {

		Book who = new Book(), dragon = new Book("Dragon", "Aswath", 155.39);
		who.display();
		dragon.display();
	}
}

class Book {
	String title,author;
	double price;
	Book(){
	    title = "unknown_book";
		author = "someone";
		price = 0.00;
	}
	Book(String title, String author, double price) {
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	void display(){
	    System.out.println("Book Title: "+title+"\nBook Author: "+
	    author+"\nBook Price: "+price+"\n");
	}
}