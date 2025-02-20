import java.util.*;

public class Object_Classes_Constructor
{
	public static void main(String[] args) {
		
		Book book = new Book();
	}
}

class Book{
    Book(){
        String title = "Java Programming";
        double price = 100.00;
        System.out.println("Book Title : "+title+"\nBook Price : "+price);
    }
}