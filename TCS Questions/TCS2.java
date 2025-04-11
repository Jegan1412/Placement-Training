import java.util.*;

class Functions{
	Scanner input = new Scanner(System.in);
	
	public void validate_string(){
		String str = input.nextLine();
		int star=0, hash=0;
		for(int i=0;i<str.length();i++){
			if(str.charAt(i) == '*') star++;
			else if(str.charAt(i) == '#') hash++;
		}
		System.out.println((hash-star));
	}
	
	public void after_greater_element(){
		int n=input.nextInt(), arr[] = new int[n], i;
		for(i=0;i<n;i++) arr[i]=input.nextInt();
		System.out.print(arr[0]+" ");
		for(i=1;i<n;i++) System.out.print(((arr[i]>arr[i-1])?(arr[i]+" "):""));
	}
	
	public void max_parked_row(){
		int r=input.nextInt(), c=input.nextInt();
		int arr[][] = new int[r][c];
		int max_parked = 0, count, max=0, i, j;
		for(i=0;i<r;i++){
			for(j=0;j<c;j++) arr[i][j]=input.nextInt();
		}
		for(i=0;i<r;i++){
			count=0;
			for(j=0;j<c;j++){
				if(arr[i][j]==1) count++;
			}
			if(count > max){
				max = Math.max(max, count);
				max_parked = i;
			}
		}
		System.out.println((max_parked+1));
	}
	
	public void cruise_management(){
		int n=input.nextInt(), e[]=new int[n], l[]=new int[n], current=0, i;
		for(i=0;i<n;i++){
			System.out.println("No.of Guests Entered & Leaved at hour "+(i+1)+":");
			e[i]=input.nextInt();
			l[i]=input.nextInt();
			current += e[i]-l[i];
		}
		System.out.println(current);
	}
	
	public void odd_colors(){
		int n=input.nextInt(),i, count=1;
		char arr[]=new char[n];
		for(i=0;i<n;i++) arr[i]=input.next().charAt(0);
		Arrays.sort(arr);
		for(i=1;i<n;i++){
			if(arr[i]==arr[i-1]) count++;
			else if(arr[i]!=arr[i-1]){
				System.out.println(((count%2!=0)?(arr[i-1]+":"+count):""));
				count=1;
			}
		}
		if(i-1==n-1) System.out.println(((count%2!=0)?(arr[i-1]+":"+count):""));
	}
	
	public void candy_jar(){
		System.out.print("Enter Jar Size:");
		int n=input.nextInt();
		System.out.print("Enter Minimum Camdies Limit to refill:");
		int m=input.nextInt();
		System.out.print("Enter Candies Order:");
		int c=input.nextInt();
		
		if(c>=n) System.out.print("Invalid Input");
		else if(c<n && c>(n-m)){
			System.out.println("No.of Candies Sold: "+c);
			System.out.println("No.of Candies Left: "+n);
		}
		else{
			System.out.println("No.of Candies Sold: "+c);
			System.out.println("No.of Candies Left: "+(n-c));
		}
	}
	
	public void trainee_fitcheck(){
		int arr[][]=new int[3][3], res[]=new int[3], i, j, fitness, max=70;
		for(i=0;i<3;i++){
			for(j=0;j<3;j++) arr[i][j]=input.nextInt();
		}
		for(i=0;i<3;i++){
			fitness=0;
			for(j=0;j<3;j++) fitness+=arr[j][i];
			res[i]=(fitness/3);
			max = Math.max(max, res[i]);
		}
		if(max>70){
			for(i=0;i<3;i++){
				if(max==res[i]) System.out.println("Trainee No: "+(i+1));
			}
		}
		else System.out.println("All Trainees are Unfit");
	}
	
	public void washing_machine(){
		int w=input.nextInt(), mins=0;
		if(w==0) mins=0;
		else if(w>0 && w<=2000) mins=25;
		else if(w>2000 && w<=4000) mins=35;
		else if(w>4000 && w<=7000) mins=45;
		System.out.println(((w<=7000)?("Time Estimated: "+mins+" minutes"):"OVERLOADED"));
	}
	
	public void caesar_cipher(){
		System.out.print("Enter your Plain Text: ");
		String str=input.nextLine();
		char s[]=str.toCharArray();
		System.out.print("Enter the Key: ");
		int n=s.length, key=input.nextInt();
		if(key<=0) System.out.println("Invalid Input");
		else{
			StringBuilder cc=new StringBuilder();
			for(int i=0;i<n;i++){
				if(s[i]==' '){
					cc.append(s[i]);
					continue;
				}
				cc.append((char)((int)s[i]+key));
			}
			System.out.println("The encrypted Text is: "+cc.toString());
		}
	}
	
	public void wall_painting(){
		System.out.print("Enter no.of Interior & Exterior Walls: ");
		int i=input.nextInt(), e=input.nextInt(), j;
		float sqi=0, sqe=0;
		System.out.print("Enter Square Feet of each Interior Wall, then Exterior Wall: ");
		for(j=0;j<i;j++) sqi+=input.nextFloat();
		for(j=0;j<e;j++) sqe+=input.nextFloat();
		System.out.println("Total estimated Cost: "+((sqi*18)+(sqe*12)));
	}
}

public class TCS2{
	public static void main(String args[]){
		
		Scanner input = new Scanner(System.in);
		Functions fnc = new Functions();
		
		//fnc.validate_string();
		
		//fnc.after_greater_element();
		
		//fnc.max_parked_row();
		
		//fnc.cruise_management();
		
		//fnc.odd_colors();
		
		//fnc.candy_jar();
		
		//fnc.trainee_fitcheck();
		
		//fnc.washing_machine();
		
		//fnc.caesar_cipher();
		
		fnc.wall_painting();
	}
}