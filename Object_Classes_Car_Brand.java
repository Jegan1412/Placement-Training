import java.util.*;

public class Object_Classes_Car_Brand
{
	public static void main(String[] args) {
		
	    Car car = new Car();
	    car.setBrand();
	    System.out.println(car.brand);
	}
}

class Car{
    String brand;
    Car(){
        brand = "unknown";
    }
    void setBrand(){
        Scanner input = new Scanner(System.in);
        brand = input.nextLine();
    }
}