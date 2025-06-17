import java.util.*;

class Functions{
	Scanner input = new Scanner(System.in);
	
	public void decimal_binary(){
		int n=input.nextInt(), temp=n;
		StringBuilder res=new StringBuilder();
		while(temp>0){
			res.append(temp%2);
			temp/=2;
		}
		System.out.println(res.reverse());
	}
	
	public void decimal_octal(){
		int n=input.nextInt(), temp=n;
		StringBuilder res=new StringBuilder();
		while(temp>0){
			res.append(temp%8);
			temp/=8;
		}
		System.out.println(res.reverse());
	}
	
	public void decimal_hexa(){
		int n=input.nextInt(), temp=n;
		StringBuilder res=new StringBuilder();
		while(temp>0){
			if((temp%16)>9) res.append((char)((temp%16)+55));
			else res.append(temp%16);
			temp/=16;
		}
		System.out.println(res.reverse());
	}
	
	public void octal_binary(){
		String num=input.nextLine();
		int n=num.length()-1, digit=0, count;
		StringBuilder res=new StringBuilder();
		while(n>=0){
			count=3;
			digit=num.charAt(n--)-'0';
			while(count>0){
				res.append(digit%2);
				digit/=2;
				count--;
			}
		}
		System.out.println(res.reverse());
	}
	
	public void octal_decimal(){
		String num=input.nextLine();
		int n=num.length()-1, pow=0, res=0;
		while(n>=0){
			res = res+((int)(num.charAt(n--)-'0')*(int)Math.pow(8,pow++));
		}
		System.out.println(res);
	}
	
	public void octal_hexa(){
		String num=input.nextLine();
		int n=num.length()-1, digit=0, count;
		StringBuilder res=new StringBuilder();
		while(n>=0){
			count=3;
			digit=num.charAt(n--)-'0';
			while(count>0){
				res.append(digit%2);
				digit/=2;
				count--;
			}
		}
		String r = res.reverse().toString();
		int m=r.length(), i, j, temp, pow;
		res.delete(0, m);
		for(i=0;i<r.length();i+=4){
			temp=0; pow=0;
			for(j=i+3;j>=i;j--) temp += ((int)(r.charAt(j)-'0')*(int)Math.pow(2,pow++));
			if(temp<10) res.append(temp);
			else res.append((char)((temp%16)+55));
		}
		System.out.println(res);
	}
	
	public void matrix_rotate(){
		int m=input.nextInt(), n=input.nextInt(), arr[][]=new int[m][n], res[][]=new int[n][m];
		int i, j, temp;
		for(i=0;i<m;i++){
			for(j=0;j<n;j++){
				arr[i][j]=input.nextInt();
				res[j][i]=arr[i][j];
			} 
		}
		int end;
		for(i=0;i<n;i++){
			end=m-1;
			for(j=0;j<m/2;j++){
				temp=res[i][j];
				res[i][j]=res[i][end];
				res[i][end--]=temp;
			}
		}
		System.out.println();
		for(i=0;i<n;i++){
			for(j=0;j<m;j++) System.out.print(res[i][j]+" ");
			System.out.println();
		}
	}
	
	public int recursive_factorial(int n){
		if(n==1) return 1;
		return n*recursive_factorial(n-1);
	}
	
	public void first_non_repeating_character(){
		String str=input.nextLine();
		int i=0;
		for(i=0;i<str.length();i++){
			if(str.indexOf(str.charAt(i)) == str.lastIndexOf(str.charAt(i))) break;
		}
		System.out.println(i);
	}
	
	public void remove_duplicates_from_sorted_array(){
		int n=input.nextInt(), arr[]=new int[n], i;
		for(i=0;i<n;i++) arr[i]=input.nextInt();
		Arrays.sort(arr);
		ArrayList<Integer> res=new ArrayList<>();
		for(i=0;i<n;i++){
			if(!res.contains(arr[i])) res.add(arr[i]);
		}
		for(i=0;i<res.size();i++){
			System.out.println(res.get(i));
		}
	}
	
	public void spiral_matrix(){
		int m=input.nextInt(), n=input.nextInt(), arr[][]=new int[m][n];
		int i, j, temp;
		for(i=0;i<m;i++){
			for(j=0;j<n;j++) arr[i][j]=input.nextInt();
		}
		int u=0, d=m-1, l=0, r=n-1;
		while(u<=d && l<=r){
			for(i=l;i<=r;i++) System.out.print(arr[u][i]+" ");
			u++;
			for(i=u;i<=d;i++) System.out.print(arr[i][r]+" ");
			r--;
			for(i=r;i>=l;i--) System.out.print(arr[d][i]+" ");
			d--;
			for(i=d;i>=u;i--) System.out.print(arr[i][l]+" ");
			l++;
		}
		
	}
}

public class Infosys{
	public static void main(String args[]){
		
		Functions fnc = new Functions();
		Scanner input = new Scanner(System.in);
	
		//fnc.decimal_binary();
		
		//fnc.decimal_octal();
		
		//fnc.decimal_hexa();
		
		//fnc.octal_binary();
		
		//fnc.octal_decimal();
		
		//fnc.octal_hexa();
		
		//fnc.matrix_rotate();
		
		//System.out.println(fnc.recursive_factorial(input.nextInt()));
		
		//fnc.first_non_repeating_character();
		
		//fnc.remove_duplicates_from_sorted_array();
		
		fnc.spiral_matrix();
		
	}
}