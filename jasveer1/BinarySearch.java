package jasveer1;
import java.io.*;
public class BinarySearch {

	public static void main(String[] args) throws IOException
	{
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		int i,r;
		System.out.println("Enter Elements of Array");
		int a[]=new int[10];
		for(i=0;i<a.length;i++)
		{
			a[i]=Integer.parseInt(br.readLine());
		}
		System.out.println("Enter No. To Be Searched");
		int b=Integer.parseInt(br.readLine());
		r=binary(a,b);
		if(r==-1)
		{
			System.out.println("No. Not Found");
		}
		else
		{
			System.out.println("No. Found at "+r);
		}
	}
	static int binary(int a[],int b)
	{
		int l=0;
		int u=a.length-1;
		while(l<=u)
		{
			int m=(l+u)/2;
			if(a[m]==b)
			{
				return m;
			}
			else if(a[m]>b)
			{
				u=m-1;
			}
			else if(a[m]<b)
			{
				l=m+1;
			}
		}
			return -1;
	}

}
