class SumOfMean
{
	public static void main(String[] args) 
	{
		int num=87654;
		num=num/10;
		int sum=0;
		while(num>9)
		{
			int ld=num%10;
			sum=sum+ld;
			num=num/10;
		}
		System.out.println(sum);
	}

}
