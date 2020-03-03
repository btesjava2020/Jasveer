package jasveer1;
import java.util.Scanner;
public class LinearSearch {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i,b,arr[]=new int[10];
		System.out.println("Enter Elements of Array");
        for(i=0;i<arr.length;i++)
        {
        	arr[i]=sc.nextInt();
        }
        System.out.println("Enter No. To be Searched");
        b=sc.nextInt();
        int x=0;
        for(i=0;i<arr.length;i++)
        {
        	if(arr[i]==b)
        	{
        		x=1;
        		System.out.println("Element Searched and position of Element is"+" "+i);
        		break;
        	}
        }
        if(x==0)
        {
        	System.out.println("Element Not Searched");
        }
	}

}
