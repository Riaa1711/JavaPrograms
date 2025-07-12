class LargestDigit
{
	public static void main(String[] args) 
	{
		int num=7923;
		int largestDigit=0;
		while(num!=0)
		{
			int ld =num%10;
			if(ld>largestDigit)
			{
			largestDigit=ld;
			}
			num=num/10;
		}
		System.out.println(largestDigit);
	}

	}

