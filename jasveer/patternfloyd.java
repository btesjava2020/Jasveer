package jasveer;
import java.util.*;
public class patternfloyd {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter No. of Rows");
		int k=0,n=s.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				k++;
				System.out.print(k+" ");
			}
			System.out.println();
		}

	}

}
