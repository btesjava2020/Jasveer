package jasveer;

public class pattern9 {

	public static void main(String[] args) {
		for(int i=1;i<=9;i++)
		{
			for(int j=1;j<=9;j++)
			{
				if((i+j<=5)||(i+j>=15||(j-i)>=5)||(i-j)>=5)
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print("*");
				}
			}System.out.println();
		}

	}

}
