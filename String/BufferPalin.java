package String;
import java.io.*;
public class BufferPalin {

	public static void main(String[] args) throws IOException{
	     InputStreamReader isr=new InputStreamReader(System.in);
	     BufferedReader br=new BufferedReader(isr);
	     String s,p;
	     s=br.readLine();
//	     int a;
	     s=s.trim();
//	     a=s.length();
	    	 StringBuffer sb=new StringBuffer(s);
	    	 sb.reverse();
	    	 p=sb.toString();
	    	 if(s.equals(p))
	    	 {
	    		 System.out.println("Palindrome");
	    	 }
	    	 else
	    	 {
	    		 System.out.println("Not Palindrome");
	    	 }
	     
	}

}
