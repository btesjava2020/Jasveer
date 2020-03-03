package jasveer;
import java.util.Scanner;
public class function {

	public static void main(String[] args) 
	{
        Scanner s=new Scanner(System.in);
        int a,b;
        System.out.println("Enter First No :");
        a=s.nextInt();
        System.out.println("Enter Second No :");
        b=s.nextInt();
		System.out.println(checknums(a,b));
	}
	public static String checknums(int num1,int num2)
	{
		if(num1>num2)
		{
			return "true";
		}
		else if(num1<num2)
		{
			return "false";
		}
		else
		{
			return "-1";
		}
	}

}
