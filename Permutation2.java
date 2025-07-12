class Permutation2 
{
	public static void main (String[]args)
	{
		int num=170;
		int temp=num;
		int sum=0;
		while(num>0)
		{
			int ld=num%10;
			sum=sum+factorial(ld);
			num=num/10;
		}
		if(sum==temp)
		{
			System.out.println("Strong number");
		}
		else
		{
			System.out.println("Not a strong number");
		}
	}
	static int factorial(int num)
	{
		int fact=1;
		for(int i=1;i<=num;i++)
		{
			fact=fact*i;
		}
		return fact;
	}
}
			
