import java.util.*;

class Functions{
	
	Scanner input = new Scanner(System.in);
	
	public void keylogger(){
		int n=input.nextInt(), temp=n, i=0, j=0;
		String str=""+n;
		while(i<str.length()) System.out.print((char)(96+(str.charAt(i++)-'0')));
		i=1;
		System.out.println();
		while(i<str.length()){
			j=0;
			StringBuilder ts=new StringBuilder();
			while(j<i-1) ts.append((char)(96+(str.charAt(j++)-'0')));
			int val = (str.charAt(i-1)-'0')*10 + (str.charAt(i)-'0');
			if(val<=26) ts.append((char)(96+val));
			j=i+1;
			while(j<str.length()) ts.append((char)(96+(str.charAt(j++)-'0')));
			i++;
			System.out.println(ts);
		}
	}
	
	public void books(){
		System.out.println("Enter Total amount of Books & Money: ");
		int n=input.nextInt(), m=input.nextInt(), i, j;
		int books[][] = new int[n][4], maxValue=0, maxInd=0, totalValue=0;
		boolean took[] = new boolean[n];
		for(i=0;i<n;i++){
			System.out.print("Enter Serial no, Value, Price, Marking of the book: ");
			for(j=0;j<4;j++) books[i][j]=input.nextInt();
		}
		while(m>0){
			for(i=0;i<n;i++){
				if(books[i][1]>maxValue && !took[i]){
					maxValue=books[i][1];
					maxInd=i;
				}
			}
			if(!took[maxInd]){
				if(books[maxInd][3]>1){
					if((m-(books[maxInd][2]*2)>0)){
						totalValue+=(maxValue*2);
						m-=(books[maxInd][2]*2);
					}
				}
				else{
					totalValue+=maxValue;
					m-=books[maxInd][2];
				}
				took[maxInd]=true;
			}
			maxValue=0;
		}
		System.out.println(totalValue);
	}
	
	public void taxi(){
		int n=input.nextInt(), arr[][]=new int[n][n];
		int i, j, passengers=0, blocks=0;
		for(i=0;i<n;i++){
			for(j=0;j<n;j++) arr[i][j]=input.nextInt();
		}
		if(arr[0][1]==-1 && arr[1][0]==-1) passengers=0;
		else{
			for(i=0;i<n;i++){
				for(j=0;j<n;j++){
					if(arr[i][j]==1){
						blocks=0;
						if((i-1<0) || (i-1>=0 && arr[i-1][j]==-1)) blocks++;
						if((j-1<0) || (j-1>=0 && arr[i][j-1]==-1)){
							if((i-1<0) || (i-1>=0 && arr[i-1][j]==-1)) continue;
							blocks++;
						}
						if((i+1>=n) || (i+1<n && arr[i+1][j]==-1)) blocks++;
						if((j+1>=n) || (j+1<n && arr[i][j+1]==-1)){
							if((i+1>=n) || (i+1<n && arr[i+1][j]==-1)) continue;
							blocks++;
						}
						if(blocks<3) passengers++;
					}
				}
			}
		}
		System.out.println(passengers);
	}
	
	public void share_profit(){
		int n=input.nextInt(), days[]=new int[n], i, max=0, min=0;
		for(i=0;i<n;i++){
			days[i]=input.nextInt();
			if(days[min]>days[i]) min=i;
		}
		max=min;
		for(i=min;i<n;i++){
			if(days[max]<days[i]) max=i;
		}
		System.out.println((days[max]-days[min]));
	}
	
	public void most_occurances(){
		String str=input.nextLine();
		ArrayList<Character> ue = new ArrayList<>();
		ArrayList<Integer> nos = new ArrayList<>();
		char s[]=str.toCharArray();
		Arrays.sort(s);
		int n=str.length(), temp, i, j;
		StringBuilder res = new StringBuilder();
		//Finding Elements & its Count in Long Approach
		/*for(i=0;i<n;i++){
			char ch=str.charAt(i);
			if(ue.contains(ch)){
				int ind = ue.indexOf(ch);
				nos.add(ind, (nos.get(ind)+1));
				nos.remove(ind+1);
			}
			else {
				ue.add(ch);
				nos.add(1);
			}
		}*/
		//Finding Elements & its Count in Simple Approach
		for(i=0;i<n;i++){
			ue.add(s[i]);
			temp=0;
			for(j=i;j<n;j++){
				if(s[i]==s[j]) temp++;
			}
			nos.add(temp);
			i=i+temp-1;
		}
		boolean done[] = new boolean[ue.size()];
		int m = ue.size(), max, maxInd=-1;
		for(i=0;i<m;i++){
			max=0;
			for(j=0;j<m;j++){
				if(nos.get(j)>1 && nos.get(j)>max && !done[j]){
					max = nos.get(j);
					maxInd=j;
				}
			}
			if(max==0) break;
			res.append(ue.get(maxInd));
			done[maxInd]=true;
		}
		System.out.println(res);
	}
	
	public void channel(){
		int lc=input.nextInt(), hc=input.nextInt(), b=input.nextInt(), bc[]=new int[b], i, j;
		for(i=0;i<b;i++) bc[i]=input.nextInt();
		int v=input.nextInt(), vc[]=new int[v];
		for(i=0;i<v;i++) vc[i]=input.nextInt();
		int temp=vc[0], clicks=0;
		/*boolean vb[]=new boolean[v];
		for(i=0;i<v;i++){
			for(j=0;j<b;j++){
				if(vc[i]==bc[j]) vb[i]=true;
			}
		}*/
		while(temp>0){
			clicks++;
			temp/=10;
		}
		int digits, lv=vc[0];
		for(i=1;i<v;i++){
			temp=vc[i];
			digits=0;
			while(temp>0){
				digits++;
				temp/=10;
			}
			if(lv==vc[i] && i>1) clicks++;
			else if(Math.abs(vc[i]-vc[i-1])>digits) clicks+=digits;
			else clicks+=Math.abs(vc[i]-vc[i-1]);
			lv=vc[i-1];
		}
		System.out.println(clicks);
	}
	
	public void job(){
		int n=input.nextInt(), jobs[][]=new int[n][3];
		for(int i=0;i<n;i++){
			System.out.println("Enter Start, End & Profit of the Job: ");
			for(int j=0;j<3;j++) jobs[i][j]=input.nextInt();
		}
	}
	
	public void hamming_distance(){
		int a=input.nextInt(), b=input.nextInt(), count=0;
		while(a>0 || b>0){
			if(a%2 != b%2) count++;
			else if((a>0 && b<=0 && a%2==1) || (a<=0 && b>0 && b%2==1)) count++;
			a/=2; b/=2;
		}
		System.out.println(count);
	}
	
	public void islands(){
		int m=input.nextInt(), n=input.nextInt(), arr[][]=new int[m][n];
		int i, j, islands=0;
		for(i=0;i<m;i++){
			for(j=0;j<n;j++) arr[i][j]=input.nextInt();
		}
		for(i=0;i<m;i++){
			for(j=0;j<n;j++){
				if(arr[i][j]==1){
					islands++;
					find_island(arr, i, j, m, n);
				}
			}
		}
		System.out.println(islands);
	}
	
	public void find_island(int[][] arr, int x, int y, int m, int n){
		arr[x][y]=0;
		
		if(x-1>=0 && arr[x-1][y]==1 ) find_island(arr, x-1, y, m, n);
		if(x+1<m && arr[x+1][y]==1) find_island(arr, x+1, y, m, n);
		if(y-1>=0 && arr[x][y-1]==1) find_island(arr, x, y-1, m, n);
		if(y+1<n && arr[x][y+1]==1) find_island(arr, x, y+1, m, n);
		if(x-1>=0 && y-1>=0 && arr[x-1][y-1]==1) find_island(arr, x-1, y-1, m, n);
		if(x-1>=0 && y+1<n && arr[x-1][y+1]==1) find_island(arr, x-1, y+1, m, n);
		if(x+1<m && y-1>=0 && arr[x+1][y-1]==1) find_island(arr, x+1, y-1, m, n);
		if(x+1<m && y+1<n && arr[x+1][y+1]==1) find_island(arr, x+1, y+1, m, n);
		
		if(arr[x][y]==0) return;
	}
	
	public void binary_tree(){
		ArrayList<Character> inps=new ArrayList<new char[2]>();
		
	}
	
}

public class CTS2{
	public static void main(String args[]){
		
		Functions fnc = new Functions();
		
		//fnc.keylogger();
		
		//fnc.books();
		
		//fnc.taxi();
		
		//fnc.share_profit();
		
		//fnc.most_occurances();
		
		//fnc.channel();
		
		//fnc.job();
		
		//fnc.hamming_distance();
		
		//fnc.islands();
		
		fnc.binary_tree();
	}
}