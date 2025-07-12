class Leapyear 
{
	public static void main(String[] args) 
	{
		int num=7923;
		int smallestDigit=9;
		while(num!=0)
		{
			int ld=num%10;
			if(ld<smallestDigit)
			{
				smallestDigit=ld;
			}
			num=num/10;
		}
		System.out.println(smallestDigit);
	}
}

		

			