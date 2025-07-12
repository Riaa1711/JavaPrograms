class  LastFirst
{
	public static void main(String[] args) 
	{
		int num=23456;
		int sum=0;
		int ld=num%10;
		while(num>9)
		{
			num=num/10;
		}
		sum=ld+num;
		System.out.println(sum);
	}
}
