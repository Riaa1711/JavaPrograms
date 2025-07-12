import java.util.Scanner;
class BuyAProduct2
{
	public static void main( String[]args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the money");
		int money= scan.nextInt();
		System.out.println(" Enter productprice");
		int productprice=scan.nextInt();
		if (money>=productprice)
		{
			System.out.println("Purchased successful");
		}
		else {
			System.out.println(" Insufficient funds");
		}
	}
}
