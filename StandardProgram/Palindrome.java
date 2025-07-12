import java.util.Scanner;
class Palindrome 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=scan.nextInt();
		int temp=num;
	    int rev=0;
		while(num!=0)
		{
			int ld=num%10;
			rev=rev*10+ld;
			num=num/10;
		}
		if(temp==rev)
		{
			System.out.println("Palindrome ");
		}
		else
		{
			System.out.println("not a palindrome");
		}
			
	}
}
