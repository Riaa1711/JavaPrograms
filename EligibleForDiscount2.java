import java.util.Scanner;
class EligibleForDiscount2
{
	public static void main(String[]args)
	{
	Scanner scan=new Scanner(System.in);
		System.out.println("Enter the age ");
	int age = scan.nextInt();
	if(age>=65)
		{
		System.out.println(" Eligible for discount");
		}
		else
		{ 
		System.out.println(" Not eligible for discount");
		}
	}


}