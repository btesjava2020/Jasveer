package jasveer;

public class pattern13 {

	public static void main(String[] args) {
		for(int i=1;i<=7;i++)
		{
			for(int j=1;j<=7;j++)
			{
				if(((i+j)<=4)||((i+j)>=12)||((i-j)>=4)||((j-i)>=4))
				{
					System.out.print(" ");
      			}
				else if(j==4)
				{
					System.out.print("1");
				}
				else if((j==3)||(j==5))
				{
					System.out.print("2");
				}
				else if((j==2)||(j==6))
				{
					System.out.print("3");
				}
				else
				{
					System.out.print("4");
				}
			}System.out.println();
		}

	}

}
