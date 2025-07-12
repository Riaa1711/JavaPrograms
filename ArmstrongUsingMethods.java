// write a program to check whether the given number is armstrong or not by using methods
   import java.util.Scanner;
   class ArmstrongUsingMethods
   {
	public static void main(String[] args) 
	{
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the number");
		int num =scan.nextInt();
		int temp=num;
		int sum=0;
		int power=count(num);
		while(num!=0)
		{
			int ld=num%10;
			sum=sum+exp(ld,power);
			num=num/10;
		}
	if(sum==temp)
		{
		System.out.println("Armstrong number");
		}
		else
		{
			System.out.println("not an armstrong number");
		}
	}
	public static int count(int num)
	   {
		int count=0;
		while(num!=0)
		   {
			count++;
			num=num/10;
		   }
		   return count;
	   }
	   public static int exp(int base,int power)
	   {
		   int exp=1;
		   for( int i=1;i<=power;i++)
		   {
			   exp=exp*base;
		   }
		   return exp;
	   }


	   

}
