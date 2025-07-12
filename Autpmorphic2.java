class Autpmorphic2 
{
	public static void main(String[] args) 
	{
		int num;
		int i;
		int sq;
		int count=0;
		for(i=1;i<=100;i++)
			{
			num=i;
			
		sq=num*num;
		boolean isAutomorphic=true;
		while(num!=0)
		{
			int ld1=num%10;
			int ld2=sq%10;
			if(ld1!=ld2)
			{
				isAutomorphic=false;
				break;
			}
			num=num/10;
			sq=sq/10;
		}
		if (isAutomorphic==true)
		{
			System.out.println(i);
			count++;
		}
			}

		System.out.println( "The count is "+count);
	



	
}
}
