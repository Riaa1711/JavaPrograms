class ExponentialValue
{
	public static void main(String[] args) 
	{
		int num=235;
		int temp=num;
		int count=0;
		int sum=0;
		int exp=1;
		while(num!=0)
		{
			num=num/10;
			count++;
		}
		int power=count;
		for( int i=1;i<=power;i++);
		{
			int ld=temp%10;
			int base =ld;
			exp=exp*base;
			sum=sum+exp;
           temp=temp/10;
		}
		   
		System.out.print(sum);
		


	}
}
