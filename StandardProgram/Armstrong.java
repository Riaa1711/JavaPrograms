import java.util.Scanner;
class Armstrong 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		int temp1=num;
		int temp2=num;
		int sum=0;
		int count=0;
		while(num!=0)
		{
			count++;
			num=num/10;
		}
		while(temp1!=0)
		{
			int exp=1;
			int ld=temp1%10;
			for(int i=1;i<=count;i++)
			{
				exp=exp*ld;
			}
			sum=sum+exp;
			temp1=temp1/10;
		}
		if(sum==temp2)
		{
			System.out.println("Armstrong number");
		}
		else
		{
			System.out.println("not an armstrong number");
		}
	}
}
				