package String;
import java.io.*;
public class FreOfEach {

	public static void main(String[] args) throws IOException{
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		System.out.println("Enter No.:");
		int n=Integer.parseInt(br.readLine());
		int i,r,count;
		for(i=0;i<10;i++)
		{
			count=0;
			int j=n;
			while(j>0)
			{
				r=j%10;
				j=j/10;
				if(r==i)
				{
					count++;
				}
			}
			System.out.println("frequency of "+i+"="+count);
		}

	}

}
