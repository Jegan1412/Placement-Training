import java.util.*;

class Add {
	private int a,b;

	Add() {
		Scanner input = new Scanner(System.in);
		a = input.nextInt();
		b = input.nextInt();
	}
	public int get_a() {
		return a;
	}
    public int get_b(){
        return b;
    }
}

class Sum extends Add {
	public void sum() {
		System.out.println((int)(get_a()+get_b()));
	}
}

public class Inheritance_Add_Two_Num
{
	public static void main(String[] args) {

		Sum sum = new Sum();

		sum.sum();

	}
}