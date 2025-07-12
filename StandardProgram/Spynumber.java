import java.util.Scanner;
class Spynumber 
{
	public static void main(String[] args) 
	{
	 Scanner scan=new Scanner(System.in);
	 System.out.println("Enter the number");
	 int num=scan.nextInt();
	 int sum=0;
	 int prod=1;
	 while(num!=0)
		{
		 int ld=num%10;
		 sum=sum+ld;
		 prod=prod*ld;
		 num=num/10;
		}
		if(sum==prod)
		{
			System.out.println("The given number is spy number");
		}
		else
		{
			System.out.println("The given number is not a spy number");
		}
	}
}
