package jasveer;
import java.util.Scanner;
public class control {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int x;
		System.out.println("Enter Any Number:");
		x=s.nextInt();
		if((x%3==0)&&(x%5==0))
		{
			System.out.println("FizzBuzz");
		}
		 else if(x%3==0)
		{
			System.out.println("Fizz");
		}
		else if(x%5==0)
		{
			System.out.println("Buzz");
		}
	}
}
