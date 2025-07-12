class HarshadNumber 
{
	public static void main(String[] args) 
	{
		int num=14;
		int temp=num;
		int sum=0;
		while(num!=0)
		{
			int ld=num%10;
			sum=sum+ld;
		num=num/10;
		}
		if(temp%sum==0)
		{
			System.out.println("harshad number");
		}
		else
		{
			System.out.println("not a harshad number");
		}
		

	}
}
