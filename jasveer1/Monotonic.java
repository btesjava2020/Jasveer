package jasveer1;
import java.io.*;
public class Monotonic {

	public static void main(String[] args) throws IOException{
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		int n=Integer.parseInt(br.readLine());
		int a[]=new int[n];
		int x=0,l;
		l=a.length;
		for(int i=0;i<l;i++)
		{
			a[i]=Integer.parseInt(br.readLine());
		}
		for(int j=0;j<(l-1);j++)
		{
//		    System.out.println(a[j]);
			if(!(a[j]<=a[j+1]))
			{
				x=1;
				break;
			}
		}
		if(x==1)
		{
			System.out.println("Not Monotonic");
		}
		else 
		{ 
			System.out.println("Monotonic");
		}
		
	}

}
