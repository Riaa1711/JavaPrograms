 class SpyNumber 
{
	public static void main(String[] args) 
	{
		int num=123;
		int sum=0;
		int prod=1
		while(num!=0)
		{
		int ld =num%10;
		sum=sum+ld;
		prod =prod*ld;
		num=num/10;
		}
		if (sum==prod)
		{
			System.out.println(" Spy number");
		}
		else 
			{
			System.out.println(" not a spy number");
			}
	}
	

}
