import java.util.Scanner;
class PalindromeByUsingMethods
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number ");
		int num=scan.nextInt();
		if(palindrome(num)==num)
		{
			System.out.println("Given number is palindrome number");
		}
		else
		{
			System.out.println("Given number is not palindrome number");
		}

	}
	public static int palindrome (int num)
	{
		int rev=0;
		while(num!=0)
		{
			int ld=num%10;
			rev =rev*10+ld;
			num=num/10;
		}
		return rev;
     }

}
