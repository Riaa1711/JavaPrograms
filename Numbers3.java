class Numbers3 
{
	public static void main(String[] args) 
	{
		int num=25;
		int sq=num*num;
		boolean isAutomorphic=false;
		while(num>0)
		{
			int ld1=num%10;
			int ld2=sq%10;
			if(ld1==ld2)
			{
				isAutomorphic=true;
				break;
			}
			num=num/10;
			sq=sq/10;
		}
		if(isAutomorphic==true)
		{
			System.out.println("Automorphic number");
		}
		else
		{
			System.out.println("Not a automorphic number");
		}




	}
}
