import java.util.*;

class Functions{
	 Scanner input = new Scanner(System.in);
	 
	 public void happy_coding(){
		int n = input.nextInt(), m1=input.nextInt(), m2=input.nextInt(), hc =0, cc =0, hcc = 0;
        for(int i=1;i<=n;i++){
            if(i%m1==0 && i%m2 == 0){
                System.out.print("HappyCoding");
                hcc++;
            }
            else if(i%m1==0){
                System.out.print("Happy");
                hc++;
            }
            else if(i%m2==0){
                System.out.print("Coding");
                cc++;
            }
            else    System.out.print(i);
            System.out.print(" ");
        }
        System.out.println();
        System.out.println("Happy: "+hc);
        System.out.println("Coding: "+cc);
        System.out.println("HappyCoding: "+hcc);
	 }
	 
	 public void equilibrium(){
		int n = input.nextInt(), arr[] = new int[n], eq =1;
        boolean cp = false;
        for(int i=0;i<n;i++)    arr[i]=input.nextInt();
        while(eq!=n){
            int rm = 1,lm = 1;
            for(int i=0;i<=eq;i++){
                rm*=arr[i];
            }
            for(int i = eq+1;i<n;i++){
                lm*=arr[i];
            }
            if(rm == lm){
                System.out.println(eq+1);
                cp = true;
                break;
            }
            eq++;
        }
        if(!cp) System.out.println(-1);
	 }
	 
	public void series_arithmetic_geometric(){
		String s = input.nextLine();
        String sarr[] = s.split(",");
        if(sarr.length<3)   System.out.println("Invalid Inputs");
        else{
            int arr[] = new int[sarr.length];
			for(int i=0;i<arr.length;i++)   arr[i]=Integer.parseInt(sarr[i]);
			if((arr[1]-arr[0]) == (arr[2]-arr[1])) System.out.println((arr[arr.length-1])+(arr[1]-arr[0]));
			if((arr[1]/arr[0]) == (arr[2]/arr[1])) System.out.println((arr[arr.length-1])*(arr[1]/arr[0]));
        }
	}
	
	public void word_game(){
		ArrayList<String> al = new ArrayList<>();
        int word = 0;
        do{
			al.add(input.nextLine());
            if((al.get(word)).charAt(0)== '#') break;
            word++;
        }while(true);
        input.close();
        System.out.println(al.get(0));
        for(int i=1;i<al.size();i++){
            int len = al.get(i-1).length();
            if(al.get(i-1).charAt(len-1)==al.get(i).charAt(0)){
                System.out.println(al.get(i));
            }
            else break;
        }
	}
	
	public void black_thunder(){
		String name = input.nextLine().toUpperCase();
		int n = name.length();
		boolean winner=true, isDigit=false;
		for(int i=0;i<n;i++){
			if((int)name.charAt(i)<65 || (int)name.charAt(i)>90){
				isDigit=true;
				break;
			}
		}
		if(isDigit) System.out.println("Invalid Inputs");
		else{
			if(name.charAt(0)!='B' && name.charAt(0)!='L') winner = false;
			if(name.charAt(n-1)!='E' && name.charAt(n-1)!='R') winner = false;
			if(!(name.indexOf('K')>0 && name.indexOf('K')<n-1)) winner = false;
			System.out.println(((winner)?"Yes":"No"));
		}
	}
	
	public void chess(){
		int n=input.nextInt();
		char chess[][]=new char[n][n];
		int bx=input.nextInt()-1, by=input.nextInt()-1, qx=input.nextInt()-1, qy=input.nextInt()-1;
		int i,j;
		for(i=0;i<n;i++){
			for(j=0;j<n;j++) chess[i][j]='.';
		}
		
		int bu=bx-1, bd=bx+1, bl=by-1, br=by+1;
		while(bu>=0 || bd<n || bl>=0 || br<n){
			if(bu>=0 && bl>=0) chess[bu][bl]='*';
			if(bu>=0 && br<n) chess[bu][br]='*';
			if(bd<n && bl>=0) chess[bd][bl]='*';
			if(bd<n && br<n) chess[bd][br]='*';
			bu--; bd++; bl--; br++;
		}
		
		int qu=qx-1, qd=qx+1, ql=qy-1, qr=qy+1;
		for(i=qx-1;i>=0;i--) chess[i][qy] = ((chess[i][qy]=='*')?'%':'&');
		for(i=qx+1;i<n;i++) chess[i][qy] = ((chess[i][qy]=='*')?'%':'&');
		for(i=qy-1;i>=0;i--) chess[qx][i] = ((chess[qx][i]=='*')?'%':'&');
		for(i=qy+1;i<n;i++) chess[qx][i] = ((chess[qx][i]=='*')?'%':'&');
		
		while(qu>=0 || qd<n || ql>=0 || qr<n){
			if(qu>=0 && ql>=0) chess[qu][ql]=((chess[qu][ql]=='*')?'%':'&');
			if(qu>=0 && qr<n) chess[qu][qr]=((chess[qu][qr]=='*')?'%':'&');
			if(qd<n && ql>=0) chess[qd][ql]=((chess[qd][ql]=='*')?'%':'&');
			if(qd<n && qr<n) chess[qd][qr]=((chess[qd][qr]=='*')?'%':'&');
			qu--; qd++; ql--; qr++;
		}
		chess[bx][by]='B'; chess[qx][qy]='Q';
		for(i=0;i<n;i++){
			for(j=0;j<n;j++) System.out.print(chess[i][j]);
			System.out.println();
		}
	}
}

public class ebox{
	public static void main(String args[]){
		
		Functions fnc = new Functions();
		
		//fnc.happy_coding();
		
		//fnc.equilibrium();
		
		//fnc.series_arithmetic_geometric();
		
		//fnc.word_game();
		
		//fnc.black_thunder();
		
		//fnc.chess();
	}
}