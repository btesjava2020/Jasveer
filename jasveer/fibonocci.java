package jasveer;
import java.util.Scanner;
public class fibonocci {

	public static void main(String[] args) 
	{
		int a1=0,a2=1,a3,n,i;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter The Limit:");
		n=s.nextInt();
		System.out.println(a1);
		System.out.println(a2);
		for(i=3;i<=n;i++)
		{
			a3=a1+a2;
			System.out.println(a3);
			a1=a2;
			a2=a3;
		}
 
	}

}
