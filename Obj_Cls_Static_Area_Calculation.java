import java.util.*;

class Area{
    
    static float area(float radius){
        return (float)(3.14f*radius*radius);
    }
    static float area(float length, float width){
        return (float)(length*width);
    }
    static double area(double side){
        return (double)(side*side);
    }
    static double area(double base, double height){
        return (double)(0.5*base*height);
    }
    
}

public class Obj_Cls_Static_Area_Calculation
{
	public static void main(String[] args) {
	    
	    Scanner input = new Scanner(System.in);
	    
	    System.out.println("\nCircle: "+Area.area(9.00f)+"\nRectangle: "+Area.area(9.00f, 6.00f)+
	    "\nSquare: "+Area.area(9.00)+"\nTriangle: "+Area.area(9.00, 6.00)+"\n");
	}
}