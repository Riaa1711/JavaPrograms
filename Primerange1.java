class Primerange1 
{
	public static void main(String[] args) 
	{
		int min=10;
		int max=20;
		for(int i=min;i<=max;i++)
		{
			if(isprime(i))
			{
				System.out.println(i+" ");
			}
		}
	}
	static boolean isprime(int n)
	{int count =0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				count++;
			}
		}
		if(count==2)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}


	
