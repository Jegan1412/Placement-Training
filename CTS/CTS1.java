import java.util.*;

class Functions{
	Scanner input=new Scanner(System.in);
	
	public void fuel_consumption(){
		System.out.print("Enter no.of Litres to fill Tank & Distance Covered:");
		float l=input.nextFloat(), d=input.nextFloat(), mpl=d/l;
		if(d<=0 || l<=0) System.out.println("Invalid Input");
		else{
			System.out.printf("\nLitres/100KMs : \t%.2f",(float)(100/mpl));
			float m=(float)(d*0.6214), g=(float)(l*0.2642);
			System.out.printf("\nMiles/Gallon : \t%.2f", (float)(m/g));
		}
	}
	
	public void bill_generation(){
		System.out.println("Enter the No.of Pizzas, Puffs & Cooldrinks bought: ");
		int pi=input.nextInt(), pu=input.nextInt(), cd=input.nextInt();
		int tp=(pi*100)+(pu*20)+(cd*10);
		System.out.println("Total Price: "+tp+"\nENJOY THE SHOW!!!");
	}
	
	public void magic_board(){
		int arr[]=new int[4], i;
		System.out.println("Enter the digits:");
		for(i=0;i<4;i++) arr[i]=input.nextInt();
		for(i=0;i<4;i++) System.out.println(arr[i]+" - "+(char)arr[i]);
	}
	
	public void max_of_3(){
		int cse, ece, mech;
		System.out.println("Enter no.of Students placed in CSE: ");
		cse=input.nextInt();
		System.out.println("Enter no.of Students placed in ECE: ");
		ece=input.nextInt();
		System.out.println("Enter no.of Students placed in MECH: ");
		mech=input.nextInt();
		System.out.println("Highest Placement: "+((cse>ece && cse>mech)
		?"CSE":((ece>cse && ece>mech)?"ECE":((mech>cse && mech>ece)?
		"MECH":"None of the department has got the highest placement"))));
	}
	
	public void ticket_pricing(){
		System.out.println("Enter the no.of ticket: ");
		int t=input.nextInt();
		if(t>=5 && t<=40){
			char r, cc, c;
			System.out.println("Do you want refreshment: ");
			r=input.next().charAt(0);
			System.out.println("Do you have Coupon Code: ");
			cc=input.next().charAt(0);
			System.out.println("Enter the Circle: ");
			c=input.next().charAt(0);
			if(c=='k' || c=='q' || c=='K' || c=='Q'){
				float tp=t*((c=='k' || c=='K')?75:150);
				tp -= ((tp>20)?(tp/100)*10:0);
				tp -= ((cc=='y' || cc=='Y')?(tp/100)*2:0);
				tp += ((r=='y' || r=='Y')?(t*50):0);
				System.out.printf("Ticket cose: %.2f",tp);
			}
			else System.out.println("Invalid Input");
		}
		else System.out.println("Minimum of 5 and Maximun of 40 Tickets");
	}
	
	public void season_lesson(){
		System.out.println("Enter the Month: ");
		int m=input.nextInt();
		if(m>0 && m<13){
			System.out.println("Season: "+((m>2 && m<6)?"Spring":
			((m>5 && m<9)?"Summer":((m>8 && m<12)?"Autumn":"Winter"))));
		}
		else System.out.println("Invalid Month");
	}
	
	public void generate_primes_in_range(){
		System.out.println("Enter Start & End of the Range: ");
		int s=input.nextInt(), e=input.nextInt();
		if(s==1) s++;
		if(s<e && (e-s)!=0){
			int i, j=s;
			boolean isPrime;
			while(j<=e){
				isPrime=true;
				for(i=2;i<=Math.sqrt(j);i++){
					if(j%i==0) isPrime=false;
				}
				if(isPrime) System.out.println(j+" ");
				j++;
			}
		}
		else System.out.println("Provide valid Input");
	}
	
	public void palindrome(){
		int n=input.nextInt(), temp=n, sum=0;
		while(temp>0){
			sum=(sum*10)+(temp%10);
			temp/=10;
		}
		System.out.println(((n==sum)?"Palindrome":"Not Palindrome"));
	}
	
	public void salary_appraisal(){
		System.out.print("Enter Salary: ");
		int s=input.nextInt();
		if(s<1) System.out.println("Invalid Input");
		else{
			System.out.print("Enter Appraisal Rating: ");
			float a=input.nextFloat();
			System.out.println("Appraised Salary: "+((a>0 && a<=3)?(s+(s/100)*10):
			(a>3 && a<=4)?(s+(s/100)*25):((a>4 && a<=5)?(s+(s/100)*30):"Invalid Input")));
		}
	}
	
	public void course_enquiry(){
		System.out.println("Enter no.of courses: ");
		int n=input.nextInt();
		if(n<1 || n>20) System.out.println("Invalid Range");
		else{
			int i;
			String arr[]=new String[n];
			for(i=0;i<n;i++) arr[i]=input.nextLine();
			String c=input.nextLine();
			boolean isHere=false;
			for(i=0;i<n;i++){
				if(c.toUpperCase().equals(arr[i].toUpperCase())) isHere=true;
			}
			System.out.println(c+" course is "+((isHere)?"available":"not available"));
		}
		
	}
}

public class CTS1{
	public static void main(String args[]){
		
		Functions fnc = new Functions();
		
		//fnc.fuel_consumption();
		
		//fnc.bill_generation();
		
		//fnc.magic_board();
		
		//fnc.max_of_3();
		
		//fnc.ticket_pricing();
		
		//fnc.season_lesson();
		
		//fnc.generate_primes_in_range();
		
		//fnc.palindrome();
		
		//fnc.salary_appraisal();
		
		fnc.course_enquiry();
	}
}