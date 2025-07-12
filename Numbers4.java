class Numbers4 
{
	public static void main(String[] args) 
	{
	int num=27;
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
			System.out.println("Harshad number");
		}
		else
		{
			System.out.println("Not a Hrshad number");
		}
		
	}
}
