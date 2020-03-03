package jasveer;
import java.util.Scanner;
public class prime {

	public static void main(String[] args) 
	{ 
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Any No:");
		int a=s.nextInt();
		int x=0;
		for(int i=2;i<=Math.sqrt(a);i++)
		{
			if(a%i==0)
			{ 
				x=1;
				break;
			}
		}
		if(x==0)
		{
			System.out.println("Prime");
		}
		else
		{
			System.out.println("Not Prime");
		}
	}

}
