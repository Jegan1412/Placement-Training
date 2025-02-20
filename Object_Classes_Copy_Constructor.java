import java.util.*;

public class Object_Classes_Copy_Constructor
{
	public static void main(String[] args) {

		Rectangle who = new Rectangle(), dragon = new Rectangle(100, 100), 
		dragon2 = new Rectangle(dragon);
		who.display();
		dragon.display();
		dragon2.display();
	}
}

class  Rectangle{
	double length, width;
	Rectangle(){
	    length = 0.00;
	    width = 0.0;
	}
	Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}
	Rectangle(Rectangle obj){
	    this.length = obj.length;
		this.width = obj.width;
	}
	
	void display(){
	    System.out.println("Rectangle Length: "+length+"\nRectangle Width: "+width+"\n");
	}
}