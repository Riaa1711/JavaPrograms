 import java.util.Scanner;
 class Ducknumber 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=scan.nextInt();
		boolean isDucknumber =false;
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
				System.out.println("duck number");
			}
			else
		{
				System.out.println("not a duck number ");
		}

	}
}
