package jasveer;

public class pattern10 {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if((i+j==4)||(i-j==2)||(j-i==2)||(i+j==8))
				{
					System.out.print("a");
				}
				else if(((i*j)==6)||((i*j)==12))
				{
					System.out.print("b");
				}
				else if((i==3)&&(j==3))
				{
					System.out.print("c");
				}
				else
				{
					System.out.print(" ");
				}
			}System.out.println();
		}

	}

}
