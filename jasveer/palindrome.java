package jasveer;
import java.util.Scanner;
public class palindrome 
{ 
   public static void main(String args[])
   {
	   Scanner s=new Scanner(System.in);
	   System.out.println("Enter Any No:");
	   int a=s.nextInt();
	   int b,r,p=0;
	   b=a;
	   while(a!=0)
	   {
		   r=a%10;
		   p=p*10+r;
		   a=a/10;
	   }
	   if(p==b)
	   {
		   System.out.println("Palindrome");
	   }
	   else
	   {
		   System.out.println("Not Palindrome");
	   }
   }
}
