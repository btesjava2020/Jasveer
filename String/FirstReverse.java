package String;
import java.io.*;
//import java.lang.*;
public class FirstReverse {
	
            public static void main(String[] args) throws IOException{
			InputStreamReader isr=new InputStreamReader(System.in);
			BufferedReader br=new BufferedReader(isr);
			String s=br.readLine();
			String s1[]=s.split(" ");
			for(int i=0;i<s1.length;i++)
			{
				fr(s1[i]);
			}

		}
            static void fr(String a)
            {
            	String s2="";
            	for(int i=a.length()-1;i>=0;i--)
            	{
            		s2=s2+a.charAt(i);
            	}
            	System.out.print(s2+" ");
            }
}
