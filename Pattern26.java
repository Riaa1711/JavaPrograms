class Pattern26 
{
	public static void main(String[] args) 
	{
		int Spacecount=4;
		int Starcount=1;
		for(int i=1;i<=5;i++)
		{
			for(int a=1;a<=Spacecount;a++)
			{
				System.out.print(" ");
			}
			for(int b=1;b<=Starcount;b++)
			{
				System.out.print("*");
			}
			Spacecount--;
			Starcount+=2;
			System.out.println();

	   }
	}
}
