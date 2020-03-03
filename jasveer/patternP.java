package jasveer;
import java.util.*;
public class patternP {

	public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
		for(int i=1;i<=n;i++)
	     {
	    	 for(int j=n;j>=i;j--)
	    	 {
	    		 System.out.print(" ");
	    	 }
	    	 int a=1;
	    	 for(int k=1;k<=i;k++)
	    	 {
	    		 System.out.print(a+" ");
	    		 
	    	 }
	    	 
	    	 System.out.println();
	     }
	}

}
