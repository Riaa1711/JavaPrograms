class Exponential2 
{
	public static void main(String[] args) 
	{
		int num=762;
		int ld=num%10;
		while(num<9)
		{
			num=num/10;
		}
		int base=ld;
		int power=num;
		int exp=1;
		for( int i=1;i<=7;i++)
		{
			exp=exp*base;
		}
		System.out.println(exp);
	}

	}

