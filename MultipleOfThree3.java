import java.util.Scanner;
class  MultipleOfThree3
{
	public static void main(String[] args) 
	{
		int i;
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the number");
		int number = scan.nextInt();
		for (i=1;i<=10;i++)
		{
			System.out.println(number*i);
		}
	}
}
