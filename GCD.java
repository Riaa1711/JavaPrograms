class GCD 
{
	public static void main(String[] args) 
	{
		int a=5;
		int b=10;
		//int ans=Gcdoftwo(a,b);
		int bas=Lcmoftwo(a,b);
		//System.out.println(ans);
		System.out.println(bas);
	}
	static int Gcdoftwo(int a,int b)
	{
		int gcd=1;
		int min=Math.min(a,b);
		for(int i=1;i<=min;i++)
		{
			if(a%i==0 && b%i==0)
			{
				gcd=i;
			}
		}return gcd;
	}
	static int Lcmoftwo(int a,int b)
	{
		int lcm=1;
		for(int i=1;i<=a*b;i++)
		{
			if(i%a==0 && i%b==0)
			{
				lcm=i;
				break;
			}
		}
		return lcm;
	}
}

		
		