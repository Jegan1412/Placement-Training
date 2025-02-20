import java.util.*;

public class Object_Classes_Parameterized_Constructor
{
	public static void main(String[] args) {

		Obj bike = new Obj(), car = new Obj("Jaguar");
		System.out.println(car.brand);
	}
}

class Obj {
	String brand;
	Obj(){
	    brand = "unknown";
	}
	Obj(String b) {
		brand = b;
	}
}