package jasveer1;
import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i,b,arr[]=new int[10];
		System.out.println("Enter Elements of Array");
        for(i=0;i<arr.length;i++)
        {
        	arr[i]=sc.nextInt();
        }
        for(i=0;i<arr.length;i++)
        {
        	for(int j=0;j<(arr.length-1);j++)
        	{
        		if(arr[j]>arr[j+1])
        		{
        			b=arr[j];
        			arr[j]=arr[j+1];
        			arr[j+1]=b;
        		}
        	}
        }
        System.out.println("After Sorting:");
        for(i=0;i<arr.length;i++)
        {
        	System.out.println(arr[i]);
        }

	}

}
