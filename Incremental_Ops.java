public class Incremental_Ops
{
	public static void main(String[] args) {
	    
	    int w=10,x=10,y=10;
	    //int pre=x++ + x++ + x++;
	    //int post=++y + ++y + ++y;
	    int v= --x + x++ + ++x + --x + x++;
	    int z= w++ + ++w + ++w + w++ + ++w;
	    int a= --y + --y + --y + --y;
	    System.out.println(v+"\n"+z+"\n"+a);
	}
}