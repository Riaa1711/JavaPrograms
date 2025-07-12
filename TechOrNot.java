 class TechOrNot

{
	public static void main(String[] args) 
	{
		int num=2025;
		int temp=num;
		int sum=0;
		int count=0;
		while(num!=0)
		{
			count++;
			num=num/10;
		}
		if(count%2==0)
		{
			int exp=1;
			for( int i=1;i<=count/2;i++)
			{
				exp=exp*10;
			}
			int firstHalf=temp/exp;
			int secondHalf=temp%exp;
			 sum=firstHalf+secondHalf;
			int square=sum*sum;
			if(square==temp)
			{
				System.out.println("Tech number");
			}
			else
			{
				System.out.println("Not a Tech number");
			}
		}
		else
		{
			System.out.println("The number cannot be divided");
		}

		
	}
}
