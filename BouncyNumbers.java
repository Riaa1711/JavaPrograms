 import java.util.Scanner;
 class  BouncyNumbers
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number");
		int num= scan.nextInt();
		if(num==ascending (num))
		{
			System.out.println("not a bouncy number");
		
		}
		else if(num == descending(num))
		{
			System.out.println("not a bouncy number");
		}
		else
		{
			System.out.println(" it is a bouncy number");
		}
		
	}
	public static int ascending ( int num)
	{
		int rev =0;
		int temp=num;
		for( int i=1;i<=9;i++)
		{
			num=temp;
			while(num!=0)
			{
				int ld=num%10;
				if(ld==i)
				{
					rev=rev*10+ld;
					break;
				}
				num=num/10;
			}
		}
		return rev;
}
public static int descending(int num)
	{
	int rev=0;
	int temp=num;
		for(int i=9;i>=0;i--)
		{
			num=temp;
			while(num!=0)
			{
				int ld=num%10;
				if(ld==i)
				{
					rev=rev*10+ld;
					break;

				}
				num=num/10;
			}
		}
		return rev;
	}
}
		

