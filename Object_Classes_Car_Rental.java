import java.util.*;

public class Object_Classes_Car_Rental
{
	public static void main(String[] args) {
	    
	    CarRental cr = new CarRental();
	    Scanner input = new Scanner(System.in);
	    int n = input.nextInt();
	    int i;
	    
	    for(i=0;i<n;i++){
	        cr.getCar();
	    }
	    for(i=0;i<n;i++){
	        cr.showCar(i);
	    }
	}
}

class CarRental{
    
    int carId;
    String carType;
    float carRent=0;
    
    ArrayList<Integer> car_Id = new ArrayList<>();
    ArrayList<String> car_Type = new ArrayList<>();
    ArrayList<Float> car_Rent = new ArrayList<>();
    
    void getCar(){
        Scanner input = new Scanner(System.in);
        carId = input.nextInt();
        input.nextLine();
        carType = input.nextLine();
        carRent = getRent(carType);
        car_Id.add(carId);
        car_Type.add(carType);
        car_Rent.add(carRent);
    }
    
    float getRent(String carType){
        switch(carType){
            case "SmallCar":
            case "smallcar":
                carRent = 1000;
                break;
            
            case "Van":
            case "van":
                carRent = 800;
                break;
            
            case "SUV":
            case "suv":
                carRent = 2500;
                break;
        }
        return carRent;
    }
    
    void showCar(int index){
        System.out.println("Car ID: "+car_Id.get(index)+"\nCar Type: "+car_Type.get(index)+"\nCar Rent: "+car_Rent.get(index));
    }  
}
