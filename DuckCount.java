class DuckCount 
{
	public static void main(String[] args) 
	{
		int count=0;
		int num;
		for( int i=0;i<=100;i++)
		{
			num=i;
			boolean isDucknumber=false;
			while(num!=0)
			{
				int ld=num%10;
				if(ld==0)
				{
				isDucknumber=true;
				break;
				}
		num=num/10;
			}
			if(isDucknumber==true)
			{
				System.out.println(i);
				count++;
			}
		}

			System.out.println("The count is "+count);


	
  }
}
