class  LargestPerfectOrNot
{
	public static void main(String[] args) 
	{
		int num=4326;
		int largestDigit=0;
		int sum=0;
		while(num!=0)
		{
			int ld=num%10;
			if(ld>largestDigit)
			{
				largestDigit=ld;
			}
			num=num/10;
		}
		System.out.println(largestDigit);
		for (int i=1;i<largestDigit;i++)
		{
			if(largestDigit%i==0)
			{
				sum=sum+i;
			}
		}
		if(sum==largestDigit)
		{
			System.out.println(" Is a perfect number");
		}
		else
		{
			System.out.println(" Not a perfect number");
		}


		}
	}

