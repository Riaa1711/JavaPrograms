 import java.util.Scanner;
 class  TwistedPrimeByMethods
{
	public static void main(String[] args) 
	{
		Scanner scan =new Scanner(System.in);
			System.out.println("Enter the number");
		int num= scan.nextInt();
		if(prime(num))
		{
		       if(prime(reverse(num)))
		      {
			     System.out.println("Given number is a twisted prime");
		      }
		else
			{
			System.out.println(" Given number is not a twisted prime");
			}
		}
		else
		{
			System.out.println("Given number is not a prime number ");
		}
	}
	public static boolean prime(int num)
	{
		int count=0;
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				count++;
			}
		}
		if (count ==2)
		{
			return true;
			
		}
		else {
			return false;
		}
	}
	public static int reverse(int num)
	{
		int rev=0;
		while(num!=0)
		{
			int ld=num%10;
			rev=rev*10+ld;
			num=num/10;
		}
		return rev;
	}
}
