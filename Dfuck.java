class Dfuck 
{
	public static void main(String[] args) 
	{
		int n=1209;
		boolean isDucknumber=false;
		while(n!=0)
		{
			int ld=n%10;
			if(ld==0)
			{
				isDucknumber=true;
				break;
			}
			n=n/10;
		}
		if(isDucknumber==true)
		{
			System.out.println("Duck");
		}
		else
		{
			System.out.println("not Duck");
		}
	}
}

