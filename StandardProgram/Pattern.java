import java.util.Scanner;
 class Pattern 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner (System.in);
		int n=scan.nextInt();
		int spacecount=2*n-2;
		int starcount=1;
		for(int i=1;i<=2*n-1;i++)
		{
			for(int a=1;a<=starcount;a++)
			{
				System.out.print("*");
			}
			for(int b=1;b<=spacecount;b++)
			{
				System.out.print(" ");
			}
			for( int c=1;c<=starcount;c++)
			{
				System.out.print("*");
			}
			if(i<n)
			{
				starcount++;
				spacecount-=2;
			}
			else
			{
				starcount--;
				spacecount+=2;
			}
			System.out.println();
	}
	}
}
