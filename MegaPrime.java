 import java.util.Scanner;
class MegaPrime 
{
	public static void main(String[] args) 
	{
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the number");
		int num=scan.nextInt();
		boolean isMegaPrime=true;
		if(prime(num))
		{
            while(num!=0)
			{
				int ld=num%10;
				if(!prime(ld))
				{
					isMegaPrime=false;
					break;
				}
				num=num/10;
			}
			if(isMegaPrime==true)
			{
				System.out.println(" Given number is a Mega prime number");
			}
			else
			{
				System.out.println("Given number is a prime number but not a Mega prime");
			}
		}
		else
		{
			System.out.println("Not a prime number");
         }
	}
	public static boolean prime (int num)
	{
		int count=0;
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				count++;
			}
		}
		if (count==2)
		{
			return true;
		}
		else
		{
			return false;

	}
	

}
}