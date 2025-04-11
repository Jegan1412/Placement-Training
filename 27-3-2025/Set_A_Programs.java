import java.util.*;

class Functions{
	Scanner input = new Scanner(System.in);
	
	public void odd_even(){
		int n = input.nextInt();
		System.out.println((((n%2)==0)?"Even":"Odd"));
	}
	
	public void prime_no(){
		int n = input.nextInt();
		boolean isPrime = true;
		for(int i=2;i<Math.sqrt(n);i++){
			if(n%i==0){
				isPrime= false;
				break;
			}
		}
		System.out.println(((isPrime)?"Prime":"Not Prime"));
	}
	
	public void factorial(){
		int n = input.nextInt(), fact=1;
		for(int i=1;i<=n;i++) fact *= i;
		System.out.println("Factorial: "+fact);
	}
	
	public void reverse_num(){
		int n = input.nextInt(), temp=n, rev=0;
		while(temp>0){
			rev = (rev*10) + (temp%10);
			temp /= 10;
		}
		System.out.println("Reversed Num: "+rev);
	}
	
	public void palindrome(){
		int n = input.nextInt(), temp=n, rev=0;
		while(temp>0){
			rev = (rev*10) + (temp%10);
			temp /= 10;
		}
		System.out.println(((n==rev)?"Palindrome":"Not Palindrome"));
	}
	
	public void amstrong(){
		int n = input.nextInt(), temp=n, count=0, sum=0;
		while(temp>0){
			count++;
			temp/=10;
		}
		temp = n;
		while(temp>0){
			sum += Math.pow((temp%10),count);
			temp/=10;
		}
		System.out.println(((n==sum)?"Amstrong":"Not Amstrong"));
	}
	
	public void sum_of_digits(){
		int n = input.nextInt(), sum=0;
		while(n>0){
			sum += n%10;
			n/=10;
		}
		System.out.println("Sum of Digits: "+sum);
	}
	
	public void no_of_digits(){
		int n = input.nextInt(), count=0;
		while(n>0){ 
			count++;
			n/=10;
		}
		System.out.println("No.of Digits: "+count);
	}
	
	public void gcd(){
		int a=input.nextInt(), b=input.nextInt();
		while(b!=0){
			int temp=b;
			b=b%a;
			a=temp;
		}
		System.out.println("GCD: "+a);
	}
	
	public void lcm(){
		int a=input.nextInt(), b=input.nextInt(), max=Math.max(a,b);
		while(true){
			if(max%a==0 && max%b==0){
				System.out.println("LCM :"+max);
				break;
			}
			max++;
		}
	}
	
	public void perfect_no(){
		int n=input.nextInt(), temp=n, sum=0;
		for(int i=1;i<=(n/2);i++){
			if(n%i==0) sum+=i;
		}
		System.out.println(((n==sum)?"Perfect":"Not Perfect"));
	}
	
	public void fibonacci_series(){
		int a=0,b=1,c;
		System.out.println("Fibonacci Series of First 10 Nums:");
		for(int i=0;i<10;i++){
			System.out.print(a+" ");
			c=a+b;
			a=b;
			b=c;
		}
	}
	
	public void strong_number(){
		int n=input.nextInt(), temp=n, fact, strong=0;
		while(temp>0){
			fact=1;
			for(int i=1;i<=(temp%10);i++) fact *= i;
			strong += fact;
			temp/=10;
		}
		System.out.println(((n==strong)?"Strong Number":"Not Strong Number"));
	}
	
	public void automorphic_number(){
		int n=input.nextInt(), temp=n, square=n*n;
		boolean automorphic = true;
		while(temp>0){
			if(temp%10 != square%10){
				automorphic = false;
				break;
			}
			temp/=10; square/=10;
		}
		System.out.println(((automorphic == true)?"Automorphic Number":"Not Automorphic Number"));
	}
	
	public void niven_number(){
		int n=input.nextInt(), temp=n, sum=0;
		while(temp>0){
			sum += (temp%10);
			temp/=10;
		}
		System.out.println(((n%sum==0)?"Niven Number":"Not Niven Number"));
	}
	
	public void generate_primes(){
		int n=input.nextInt(), i, j;
		boolean isprime;
		System.out.println("Prime Numbers upto "+n+" are: ");
		for(i=2;i<=n;i++){
			isprime = true;
			for(j=2;j<=Math.sqrt(i);j++){
				if(i%j==0){
					isprime=false;
					break;
				}
			}
			System.out.print(((isprime)?(i+" "):""));
		}
	}
	
	public void neon_number(){
		int n=input.nextInt(), square = n*n, sum=0;
		while(square>0){
			sum += (square%10);
			square/=10;
		}
		System.out.println(((n==sum)?"Neon Number":"Not Neon Number"));
	}
	
	public void sum_of_n_natural_nums(){
		int n=input.nextInt(), i, sum=0;
		for(i=1;i<=n;i++) sum += i;
		System.out.println("Sum: "+sum);
	}
	
	public void decimal_to_binary(){
		int n=input.nextInt(), temp=n;
		StringBuilder binary = new StringBuilder("");
		while(temp>0){
			binary.append((temp%2));
			temp/=2;
		}
		System.out.println("Decimal: "+n+"\tBinary: "+Integer.parseInt(binary.reverse().toString()));
	}
	
	public void largest_digit_in_number(){
		int n=input.nextInt(), temp=n, max=Integer.MIN_VALUE;
		while(temp>0){
			max = Math.max(max,(temp%10));
			temp/=10;
		}
		System.out.println("Largest Digit in "+n+" is "+max);
	}
	
	public void decimal_to_octal(){
		int n=input.nextInt(), temp=n;
		StringBuilder octal = new StringBuilder("");
		while(temp>0){
			octal.append((temp%8));
			temp/=8;
		}
		System.out.println("Decimal: "+n+"\tOctal: "+Integer.parseInt(octal.reverse().toString()));
	}
	
	public void decimal_to_hexadecimal(){
		int n=input.nextInt(), temp=n;
		StringBuilder hexa = new StringBuilder("");
		while(temp>0){
			if((temp%16)<10) hexa.append(temp%16);
			else{
				hexa.append(((char)((temp%16)+55)));
			}
			temp/=16;
		}
		System.out.println("Decimal: "+n+"\tHexaDecimal: "+hexa.reverse().toString());
	}
	
	public void binary_addition(){
		String a=input.nextLine(), b=input.nextLine();
		StringBuilder binary= new StringBuilder("");
		int na=a.length()-1, nb=b.length()-1, carry=0;
		while(na>=0 || nb>=0 || carry>0){
			if(na>=0) carry += (int)(a.charAt(na--)-'0');
			if(nb>=0) carry += (int)(b.charAt(nb--)-'0');
			binary.append((carry%2));
			carry/=2;
		}
		System.out.println("Binary Added Value: "+binary.reverse().toString());
	}
	
	public void octal_addition(){
		String a=input.nextLine(), b=input.nextLine();
		StringBuilder octal= new StringBuilder("");
		int na=a.length()-1, nb=b.length()-1, carry=0;
		while(na>=0 || nb>=0 || carry>0){
			if(na>=0) carry += (int)(a.charAt(na--)-'0');
			if(nb>=0) carry += (int)(b.charAt(nb--)-'0');
			octal.append((carry%8));
			carry/=8;
		}
		System.out.println("Octal Added Value: "+octal.reverse().toString());
	}
	
	/*public void hexa_addition(){
		String a=input.nextLine(), b=input.nextLine();
		StringBuilder hexa= new StringBuilder("");
		int na=a.length()-1, nb=b.length()-1, carry=0;
		
		public int num_value(Char a){
			switch(a)
		}
		
		while(na>=0 || nb>=0 || carry>0){
			
			if((carry%16)<10) hexa.append(carry%16);
			else{
				hexa.append(((char)((temp%16)+55)));
			}
			hexa.append((carry));
			carry/=8;
		}
		System.out.println("Octal Added Value: "+octal.reverse().toString());
	}*/
	
	public void butterfly(){
		int r=input.nextInt();
		for(int i=0;i<r;i++){
			for(int j=0;j<=i;j++) System.out.print("*");
			for(int j=i+1;j<(r*2)-1-i;j++) System.out.print(" ");
			for(int j=0;j<=i;j++) System.out.print("*");
			System.out.println();
		}
		for(int i=r-1;i>=0;i--){
			for(int j=0;j<=i;j++) System.out.print("*");
			for(int j=(i*2);j<((r-1)*2);j++) System.out.print(" ");
			for(int j=0;j<=i;j++) System.out.print("*");
			System.out.println();
		}
	}
}

public class Set_A_Programs{
	public static void main(String args[]){
		
		//Scanner input = new Scanner(System.in);
		Functions fnc = new Functions();
		
		//fnc.odd_even();
		
		//fnc.prime_no();
		
		//fnc.factorial();
		
		//fnc.reverse_num();
		
		//fnc.palindrome();
		
		//fnc.amstrong();
		
		//fnc.sum_of_digits();
		
		//fnc.no_of_digits();
		
		//fnc.gcd();
		
		//fnc.lcm();
		
		//fnc.perfect_no();
		
		//fnc.fibonacci_series();
		
		//fnc.strong_number();
		
		//fnc.automorphic_number();
		
		//fnc.niven_number();
		
		//fnc.generate_primes();
		
		//fnc.neon_number();
		
		//fnc.sum_of_n_natural_nums();
		
		//fnc.decimal_to_binary();
		
		//fnc.largest_digit_in_number();
		
		//fnc.decimal_to_octal();
		
		//fnc.decimal_to_hexadecimal();
		
		//fnc.octal_addition();
		
		
		//fnc.butterfly();
	}
}