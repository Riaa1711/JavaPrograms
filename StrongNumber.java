class StrongNumber 
{
	public static void main(String[] args) 
	{
		int num=145;
		int temp=num;
		int sum=0;
		while(num!=0)
		{
			int ld=num%10;
			int fact=1;
			for(int i=ld;i>=1;i--)
			{
				fact=fact*i;
			}
			sum=sum+fact;
			num=num/10;
		}
		if(sum==temp)
		{
			System.out.println("Strong number");
		}
		else
		{
			System.out.println(" Not a strong number");
		}


	}
}
