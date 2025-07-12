class  HalfDigit
{
	public static void main(String[] args) 
	{
		int num=1711;
		int temp=num;
		int count=0;
		while(num!=0)
		{
			count++;
			num=num/10;
		}
		
		if(count%2==0)
		{
			int exp=1;
			for(int i=1;i<=count/2;i++)
			{
				exp=exp*10;
			}

		System.out.println("The first half is "+(temp/exp));
		System.out.println("The second half is "+(temp%exp));

		}
	
	else
	{
		System.out.println(" The count of the digits of the number is an odd number");
	}


	}
}
