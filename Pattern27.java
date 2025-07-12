class Pattern27 
{
	public static void main(String[] args) 
	{
		int starcount=9;
		int spacecount=0;
		for(int i=1;i<=5;i++)
		{
			for(int a =1;a<=spacecount;a++)
			{
				System.out.print(" ");
			}
			for(int b=1;b<=starcount;b++)
			{
				System.out.print("*");
			}
			spacecount++ ;
			starcount-=2;
			System.out.println();
		}



	}
}
