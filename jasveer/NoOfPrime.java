package jasveer;
import java.util.*;
public class NoOfPrime {

	public static void main(String[] args) 
	{
		for(int i=2;i<=100;i++)
		{
			if(isprime(i))
			{
				System.out.println(i);
			}
		}
       
	}
	public static boolean isprime(int x)
	{
		int y=0;
		for(int j=2;j<=Math.sqrt(x);j++)
		{   
	        if(x%j==0)
			{
				y=1;
			}
		}
		if(y==0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

}
