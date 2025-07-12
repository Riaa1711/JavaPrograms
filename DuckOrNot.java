class  DuckOrNot
{
	public static void main(String[] args) 
	{
		int num=1289;
		boolean isDuckNumber=false;
		while(num!=0)
		{
			int ld=num%10;
			if(ld==0)
			{
				isDuckNumber=true;
				break;
			}
			num=num/10;
		}
		if(isDuckNumber==true)
		{
			System.out.println(" Given number is a duck number");
		}
		else
		{
			System.out.println(" Given number is not a duck number");
		}
		
	}
	
}
