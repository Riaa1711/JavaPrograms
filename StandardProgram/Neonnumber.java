import java.util.Scanner;
class Neonnumber 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=scan.nextInt();
		int sq=num*num;
		int sum=0;
		while(sq!=0)
		{
			int ld=sq%10;
			sum=sum+ld;
			sq=sq/10;
		}
		if(num==sum)
		{
			System.out.println("Neon number ");
		}
		else
		{
			System.out.println(" not a neon number ");
		}

	}
}
