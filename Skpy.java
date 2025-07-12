class Skpy 
{
	public static void main(String[] args) 
	{ 
		int n=1124;
		int sum=0;
		int prod=1;
        while(n>0)
		{
			int ld=n%10;
			sum=sum+ld;
			prod=prod*ld;
			n=n/10;
		}
		if(sum==prod)
		{
			System.out.println("Spy number");
		}
		else
		{
			System.out.println("Not a spy number");
		}


	}
}
