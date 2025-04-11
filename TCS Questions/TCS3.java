import java.util.*;

class Functions{
	Scanner input = new Scanner(System.in);
	
	public void bus_fare(){
		String src=input.nextLine().toUpperCase(), des=input.nextLine().toUpperCase();
		String stops[]={"TH", "GA", "IC", "HA", "TE", "LU", "NI", "CA"};
		int n=stops.length-1, path[]={800, 600, 750, 900, 1400, 1200, 1100, 1500};
		int cur=-1, i, j, dis=0;
		for(i=0;i<=n;i++){
			if(src.equals(stops[i])){
				cur=i;
				break;
			}
		}
		if(cur==-1) System.out.println("Invalid Source");
		else{
			while(!(stops[cur].equals(des))){
				cur = (cur+1)%(n+1);
				dis+=path[cur];
			}
			System.out.println(Math.round((float)(dis*5)/1000)+" INR");
		}
	}
	
	public void monkeys(){
		int n, lb, lp, tb, tp, temp;
		System.out.print("Enter Total no.of Monkeys Present: ");
		n=input.nextInt(); temp=n;
		System.out.print("Enter no.of Eatable Bananas & Peanuts by a Monkey: ");
		lb=input.nextInt(); lp=input.nextInt();
		System.out.print("Enter Total no.of Bananas & Peanuts Present: ");
		tb=input.nextInt(); tp=input.nextInt();
		if(lb>tb || lp>tp || lp<=0 || lb<=0) System.out.println("INVALID INPUT");
		else{
			while(tb>0 || tp>0){
				if(tb>0 && tb>=lb) tb -= lb;
				else if(tp>0 && tp>=lp) tp -= lp;
				else if(tb<lb && tp<lp){
					tb-=tb; tp-=tp;
				}
				temp--;
			}
			System.out.println("No.of Monkeys Left on the Tree: "+temp);
		}
	}
		
		
	public void auto_vending_machine(){
		System.out.println("Welcome to CCD !! I have\n C - Coffee\n T - Tea\n S - Soups\n B - Bevarages\n Choose your Option:");
		char mm=Character.toUpperCase(input.next().charAt(0));
		int sm;
		switch(mm){
			case 'C':
				System.out.println("Coffee Varieties:\n 1-Espresso Coffee\n 2-Cappuccino Coffee\n 3-Latte Coffee\n Choose your Option:");
				sm=input.nextInt();
				if(sm==1) System.out.println("Enjoy your Espresso Coffee");
				else if(sm==2) System.out.println("Enjoy your Cappuccino Coffee");
				else if(sm==3) System.out.println("Enjoy your Latte Coffee");
				else System.out.println("Invalid Input");
				break;
			case 'T':
				System.out.println("Tea Varieties:\n 1-Plain Tea\n 2-Assam Tea\n 3-Ginger Tea\n 4-Cardamon Tea\n 5-Masala Tea\n 6-Lemon Tea\n 7-Green Tea\n 8-Organic Darjeeling Tea\n Choose your Option:");
				sm=input.nextInt();
				if(sm==1) System.out.println("Enjoy your Plain Tea");
				else if(sm==2) System.out.println("Enjoy your Assam Tea");
				else if(sm==3) System.out.println("Enjoy your Ginger Tea");
				else if(sm==4) System.out.println("Enjoy your Cardamon Tea");
				else if(sm==5) System.out.println("Enjoy your Masala Tea");
				else if(sm==6) System.out.println("Enjoy your Lemon Tea");
				else if(sm==7) System.out.println("Enjoy your Green Tea");
				else if(sm==8) System.out.println("Enjoy your Organic Darjeeling Tea");
				else System.out.println("Invalid Input");
				break;
			case 'S':
				System.out.println("Soup Varieties:\n 1-Hot & Sour Soup\n 2-Veg Corn Soup\n 3-Tomato Soup\n 4-Spicy Tomato Soup\n Choose your Option:");
				sm=input.nextInt();
				if(sm==1) System.out.println("Enjoy your Hot & Sour Soup");
				else if(sm==2) System.out.println("Enjoy your Veg Corn Soup");
				else if(sm==3) System.out.println("Enjoy your Tomato Soup");
				else if(sm==4) System.out.println("Enjoy your Spicy Tomato Soup");
				else System.out.println("Invalid Input");
				break;
			case 'B':
				System.out.println("Bevarage Varieties:\n 1-Hot Chocolate Drink\n 2-Badam Drink\n 3-Badam-Pista Drink\n Choose your Option:");
				sm=input.nextInt();
				if(sm==1) System.out.println("Enjoy your Hot Chocolate Drink");
				else if(sm==2) System.out.println("Enjoy your Badam Drink");
				else if(sm==3) System.out.println("Enjoy your Badam-Pista Drink");
				else System.out.println("Invalid Input");
				break;
		}
	}
	
	public void doctor_fees(){
		ArrayList<Integer> arr = new ArrayList<Integer>();
		int age, fees=0;
		while(true){
			age=input.nextInt();
			if(age<=0 || age>=120) break;
			arr.add(age);
		}
		for(int i=0;i<arr.size();i++){
			if(arr.get(i)<17) fees+=200;
			else if(arr.get(i)>17 && arr.get(i)<=40) fees+=400;
			else fees+=300;
		}
		System.out.println("Total Income "+fees+" INR");
	}
	
	public void prime_or_not(){
		int n;
		do{
			System.out.print("Please enter a Positive Number: ");
			n=input.nextInt();
		}while(n<0);
		for(int i=2;i<Math.sqrt(n);i++){
			if(n%i==0){
				n=0;
				break;
			}
		}
		System.out.println(((n!=0)?"Prime":"Not Prime"));
	}
	
	public void series_7(){
		System.out.println("Enter Position to find value: ");
		int n=input.nextInt(), val=((n-1)/2)*7;
		System.out.println(n+"th value of this Series: "+((n%2==0)?(val-(n-1)/2):val));
	}
	
	public void series_2(){
		System.out.println("Enter Position to find value: ");
		int n=input.nextInt(), val;
		System.out.println(n+"th value of this Series: "+((n%2!=0)?(n-1):((n-1)/2)));
	}
	
	public void char_replace(){
		String str1=input.nextLine(), str2=input.nextLine(), str3=input.nextLine();
		int s1=str1.length(), s2=str2.length(), s3=str3.length(), i;
		for(i=0;i<s1;i++){
			if(str1.charAt(i)=='a' || str1.charAt(i)=='e' || str1.charAt(i)=='i' || str1.charAt(i)=='o' || str1.charAt(i)=='u')
			{System.out.print("%");}
			else System.out.print(str1.charAt(i));
		}
		for(i=0;i<s2;i++){
			if(str2.charAt(i)=='a' || str2.charAt(i)=='e' || str2.charAt(i)=='i' || str2.charAt(i)=='o' || str2.charAt(i)=='u')
			{System.out.print(str2.charAt(i));}
			else System.out.print("#");
		}
		System.out.print(str3.toUpperCase());
	}
}


public class TCS3{
	public static void main(String args[]){
		
		Scanner input = new Scanner(System.in);
		Functions fnc = new Functions();
		
		//fnc.bus_fare();
		
		//fnc.monkeys();
		
		//fnc.scam_commission();
		
		//fnc.auto_vending_machine();
		
		//fnc.doctor_fees();
		
		//fnc.prime_or_not();
		
		//fnc.series_7();
		
		//fnc.series_2();
		
		//fnc.char_replace();

	}
}