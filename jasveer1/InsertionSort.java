package jasveer1;
import java.util.Scanner;
public class InsertionSort {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int b,a[]=new int[10];
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
			for(int j=0;j<=i;j++)
			{
				if(a[j]>a[i])
				{
				   b=a[j];
				   a[j]=a[i];
				   a[i]=b;
				}
				System.out.print(a[j]+" ");
			}
		}

	}

}
