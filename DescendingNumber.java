class DescendingNumber 
{
	public static void main(String[] args) 
	{
		int rev=0;
		for(int i=9;i>=0;i--)
		{
			int num=27981;
			while(num!=0)
			{
				int ld=num%10;
				if(ld==i)
				{
					rev=rev*10+ld;
					break;
				}
				num=num/10;
			}
		}
		System.out.println(rev);

	}
}
