import java.util.*;

abstract class Circle{
    static double area, circum, r;
    static void get_r(){
        Scanner input = new Scanner(System.in);
        r = input.nextDouble();
    }
    static void calc_area(){
        System.out.println("Area: "+(3.14*r*r));
    }
    static void calc_peri(){
        System.out.println("Circumference: "+(2*3.14*r));
    }
}


public class Abstraction_Circle
{
	public static void main(String[] args) {
	    Circle.get_r();
	    Circle.calc_area();
	    Circle.calc_peri();
	}
}
