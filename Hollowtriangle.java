class Hollowtriangle 
{
	public static void main(String[] args) 
	{
		int n=6;
		//pattern(n);
		//pattern1(n);
		//pattern3(n);
		pattern4(n);
	}
	static void pattern(int n)
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=i;j<n;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=(2*i-1);k++)
			{
				if(k==1||i==n||k==(2*i-1))
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
	}

	}
	static void pattern1(int n)
	{
		for(int i=n;i>=1;i--)
		{
			for(int j=i;j<n;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=(2*i-1);k++)
			{
				if(k==1||i==n||k==(2*i-1))
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
		System.out.println();
		}
	}
	static void pattern3(int n)
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=i;j<n;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=(2*i-1);k++)
			{
				if(k==1||k==(2*i-1))
				{
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.println();

		}
		for(int i=n-1;i>=1;i--)
		{
			for(int j=i;j<n;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=(2*i-1);k++)
			{
				if(k==1||k==(2*i-1))
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	static void pattern4(int n)
	{
		for(int i=n;i>=1;i--)
		{
			for(int j=i;j<n;j++)
		{
				System.out.print(" ");
		}


}






