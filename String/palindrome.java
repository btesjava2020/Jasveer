package String;
import java.io.*;
public class palindrome {

	public static void main(String[] args) throws IOException{
	InputStreamReader isr=new InputStreamReader(System.in);
	BufferedReader br=new BufferedReader(isr);
	String s=br.readLine();
	String s1="";
	for(int i=(s.length()-1);i>=0;i--)
	{
		s1=s1+s.charAt(i);
	}
//	System.out.print(s1);
if(s.equals(s1))
{
	System.out.println("Palindrome");
}
else
{
	System.out.println("Not Palindrome");
}
}
}
