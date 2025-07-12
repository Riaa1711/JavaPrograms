class Permutation 
{
	public static void main(String[] args) 
	{
		int n=9;
		int r=3;
		int num=fact(n);
		int den=fact(n-r);
		System.out.println(num/den);
	}
	static int fact(int n)
	{
		int ans=1;
		for(int i=1;i<=n;i++)
		{
			ans=ans*i;
		}
		return ans;
	}
}


