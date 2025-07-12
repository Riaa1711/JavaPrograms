import java.util.Scanner;
class Pattern28
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number ");
		int n=scan.nextInt();
		int starcount=1;
		for(int i=1;i<=(2*n-1);i++)
		{
			for(int j=1;j<=starcount;j++)
			{
				System.out.print("*");
			}
			if(i<n)
			{
				starcount++;
			}
			else
			{
				starcount--;
			}
			System.out.println();
		}
	}
}

