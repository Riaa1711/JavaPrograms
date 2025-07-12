class ReplaceZerosWithOne 
{
	public static void main(String[] args) 
	{
		int num=100709;
		int ans=0;
		int temp=1;
		if(num==0)
		{
			return;
		}
		while(num>0)
		{
			int ld=num%10;
			if(ld==0)
			{
				ld=1;
			}
			 ans=ld*temp+ans;
			num=num/10;
			temp=temp*10;
		}
		System.out.println(ans);
	}
}
