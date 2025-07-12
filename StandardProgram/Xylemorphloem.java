import java.util.Scanner;
class Xylemorphloem 
{
	public static void main(String[] args) 
	{
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the number");
		int num=scan.nextInt();
		int sum=0;
		int sum1=0;
		int ld=num%10;
		sum1=ld;
		num=num/10;
		while(num>9)
		{
		 ld=num%10;
			sum=sum+ld;
			num=num/10;
		}
		sum1=sum1+num;
		if(sum==sum1)
		{
			System.out.println("Xylem number");
		}
		else
		{
			System.out.println("Phloem number");
		}
	}
}
		