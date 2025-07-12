 import java.util.Scanner;
 class Pattern29 
{
	public static void main(String[] args) 
	{
		Scanner scan =new Scanner(System.in);
		int num=scan.nextInt(); 
			int spacecount=n-1;
			int starcount=1;
				for(int i=1;i<=2*n-1;i++)
		{
					for(int a=1;a<=spacecount;a++)
			{
						System.out.print(" ");
			}
			for(int b=1;b<=starcount;b++)
			{
				System.out.print("*");
			}
			if(i<n)
			{
				spacecount--;
				starcount++;
			}
			else
			{
				spacecount++;
				starcount--;
			}
		System.out.println();
		}
	}
}


				