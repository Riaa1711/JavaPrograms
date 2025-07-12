class Pattern9 
{
	public static void main(String[] args) 
	{ 
		int num=10;
		for(int i =1;i<=5;i++)
		{
			for(int j=5;j>=1;j--)
			{
				if(i==j)
				{
					System.out.print(num);
					num--;
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();

	    }
	}
}
