class PrimePairs 
{
	public static void main(String[] args) 
	{
		int n=4;
		primepairs(n);
		
	}
	static void primepairs(int n)
	{
		for(int i=1;i<=n;i++)
		{
			if(isprime(i))
			{
				for(int j=i;j<=n;j++)
				{
					if(isprime(j))
					{
						if(i*j<=n)
						{
							System.out.println(i+" "+j);
						}
					}
				}
			}
		}
	}
	static boolean isprime(int n)
	{
		if(n<2)return false;
		for(int i=2;i*i<=n;i++)
		{
			if(n%i==0)
			{
				return false;
			}
		}
		return true;
	}
}
	