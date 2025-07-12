class MeanNumbers 
{
	public static void main(String[] args) 
	{
		int num=24567;
		num=num/10;
		while(num>9)
		{
			int ld=num%10;
			System.out.println(ld);
			num=num/10;
		}
	}
}
