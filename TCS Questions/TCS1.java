import java.util.*;

class Functions{
	Scanner input = new Scanner(System.in);
	
	public int factorial_without_product(int n, int fact){
		if(n<2) return fact;
		int temp = fact;
		for(int i=(n-1);i>1;i--) fact += temp;
		return (factorial_without_product(n-1, fact));
	}
	
	public void max_1_in_row(){
		int r=input.nextInt(), c=input.nextInt();
		int arr[][] = new int[r][c];
		int max_1_ind = 0, count, max=0, i, j;
		for(i=0;i<r;i++){
			for(j=0;j<c;j++) arr[i][j] = input.nextInt();
		}
		for(i=0;i<r;i++){
			count=0;
			for(j=0;j<c;j++){
				if(arr[i][j]==1) count++;
			}
			if(count > max){
				max = Math.max(max, count);
				max_1_ind = i;
			}
		}
		System.out.println(max_1_ind);
	}
	
	public void char_count_occurances(){
		String str1 = input.nextLine(), str2 = input.nextLine();
		int n1=str1.length(), n2=str2.length(), count=0, i, j;
		for(i=0;i<n2;i++){
			if(!str2.substring(0,i).contains(str2.substring(i,i+1))){
				for(j=0;j<n1;j++){
					if(str2.charAt(i) == str1.charAt(j)) count++;
				}
			}
		}
		System.out.println(count);
	}
	
	public void good_number(){
		int n = input.nextInt(), temp=n, sum=0;
		while(temp>0){
			sum+=(temp%10);
			temp/=10;
		}
		System.out.println(((n%sum==0)? "Good Number":"Bad Number"));
	}
	
	public void vehicle_manufacturing(){
		int v=input.nextInt(), w=input.nextInt();
		if(v>w || w<2){
			System.out.println("No.of 2-Wheelers:"+-1+"\tNo.of 4-Wheelers:"+-1);
		}
		else{
			
		}
	}
	
	public void chocolate_factory(){
		int n=input.nextInt(), arr[] = new int[n], i, j;
		for(i=0;i<n;i++) arr[i]=input.nextInt();
		for(i=0;i<n;i++){
			if(arr[i]==0){
				for(j=i;j<n-1;j++) arr[j] = arr[j+1];
				arr[n-1] = 0;
				n--;
			}
		}
		for(i=0;i<arr.length;i++) System.out.print(arr[i]+" ");
	}
	
	public void first_non_repeated_element(){
		int n = input.nextInt(), arr[]=new int[n], i, j;
		for(i=0;i<n;i++) arr[i] = input.nextInt();
		boolean[] repeat = new boolean[n];
		for(i=0;i<n;i++){
			for(j=i+1;j<n;j++){
				if(arr[i] == arr[j]){
					repeat[i] = true;
					repeat[j] = true;
				}
			}
		}
		for(i=0;i<n;i++){
			if(!repeat[i]){
				System.out.println(arr[i]);
				break;
			}
		}
	}
	
	public void rotate_array_left(){
		int n = input.nextInt(), arr[]=new int[n], i, j, temp;
		for(i=0;i<n;i++) arr[i] = input.nextInt();
		System.out.println("Enter Position to Rotate: ");
		int pos = input.nextInt();
		for(i=0;i<pos;i++){
			temp = arr[0];
			for(j=0;j<n-1;j++){
				arr[j] = arr[j+1];
			}
			arr[n-1]=temp;
		}
		for(i=0;i<n;i++) System.out.print(arr[i]+" ");
	}
	
	public void equilibrium_index(){
		int n = input.nextInt(), arr[]=new int[n], i=0, j=n-1, k;
		for(k=0;k<n;k++) arr[k] = input.nextInt();
		int ls=arr[i++], rs=arr[j--];
		while(ls!=rs || (i<j && i!=j)){
			if(ls == rs) break;
			else if(ls<rs) ls+=arr[i++];
			else if(rs<ls) rs+=arr[j--];
		}
		if(ls==rs && i==j) System.out.println(i);
		else System.out.println(-1);
		for(k=0;k<n;k++) System.out.print(arr[k]+" ");
	}
	
	public void rotate_array_right(){
		int n = input.nextInt(), arr[]=new int[n], i, j, temp;
		for(i=0;i<n;i++) arr[i] = input.nextInt();
		System.out.println("Enter Position to Rotate: ");
		int pos = input.nextInt();
		for(i=0;i<pos;i++){
			temp = arr[n-1];
			for(j=n-1;j>0;j--){
				arr[j] = arr[j-1];
			}
			arr[0]=temp;
		}
		for(i=0;i<n;i++) System.out.print(arr[i]+" ");
	}
	
	public void subset_array(){
		System.out.println("Enter Size and Elements of Main Array: ");
		int n = input.nextInt(), m_arr[]=new int[n], i, j;
		for(i=0;i<n;i++) m_arr[i] = input.nextInt();
		System.out.println("Enter Size and Elements of Subset Array: ");
		int m = input.nextInt(), s_arr[]=new int[m];
		for(i=0;i<m;i++) s_arr[i] = input.nextInt();
		Arrays.sort(m_arr); Arrays.sort(s_arr);
		boolean stat=false;
		for(i=0;i<s_arr.length;i++){
			stat = false;
			for(j=0;j<m_arr.length;j++){
				if(s_arr[i] == m_arr[j]){
					stat = true;
					break;
				}
			}
			if(!stat) break;
		}
			System.out.println(stat);
	}
	
	public void symmetric_pairs(){
		int r=input.nextInt(), arr[][]=new int[r][2], i, j;
		for(i=0;i<r;i++){
			arr[i][0] = input.nextInt();
			arr[i][1] = input.nextInt();
		}
		for(i=0;i<r;i++){
			for(j=i+1;j<r;j++){
				if(arr[i][0]==arr[j][1] && arr[i][1]==arr[j][0])
					System.out.print("("+arr[i][0]+","+arr[i][1]+") ");
			}
		}
	}
}

public class TCS1{
	public static void main(String args[]){
		
		Scanner input = new Scanner(System.in);
		Functions fnc = new Functions();
		//System.out.println();
		
		//int n = input.nextInt();
		//System.out.println(fnc.factorial_without_product(n, n));
		
		//fnc.max_1_in_row();
		
		//fnc.char_count_occurances();
		
		//fnc.good_number();
		
		//fnc.vehicle_manufacturing();
		
		//fnc.chocolate_factory();
		
		//fnc.first_non_repeated_element();
		
		//fnc.rotate_array_left();
		
		fnc.equilibrium_index();
		
		//fnc.rotate_array_right();
		
		//fnc.subset_array();
		
		//fnc.symmetric_pairs();
	}
}