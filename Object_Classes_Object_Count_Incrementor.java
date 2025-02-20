import java.util.*;

public class Object_Classes_Object_Count_Incrementor
{
	public static void main(String[] args) {
		
	    Obj car = new Car(), rocket = new Car();
	}
}

class Obj{
    String brand;
    static int count=0;
    Car(){
        count++;
        System.out.println("Object Created! Current Count: "+count);
    }
    
}