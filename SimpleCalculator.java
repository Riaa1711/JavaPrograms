import java.util.Scanner;  
class SimpleCalculator
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("*****************Simple calculator****************");
		System.out.println("Enter 1 to perform addition");
		System.out.println("Enter 2 to perform substraction");
		System.out.println(" Enter 3 to perform multilication operation");
		System.out.println("Enter 4 to perform Division(quotient) operation");
		System.out.println(" Enter 5 to perform Division(remainder) operation");
		int choice =scan.nextInt();
		switch (choice)
		{
		case 1:
			{
			System.out.println("*************you have choosen addition operation *********************");
			System.out.println(" Enter first number");
			int n1=scan.nextInt();
			System.out.println("Enter 2nd number");
			int n2=scan.nextInt();
			int res =n1+n2;
			System.out.println(n1+"+"+n2+"="+res);
		
		}
		break;
     case 2:
		 {
		 System.out.println("*********888 you have choosen substraction operation************");
		 System.out.println(" Enter your first number");
	     int n1=scan.nextInt();
	    System.out.println(" Enter your second number");
		int n2=scan.nextInt();
		int res=n1-n2;
		System.out.println(n1+"-"+n2+"="+res);
		 }
		
		break;
      case 3:
			{
		  System.out.println("*********** you have choosen multiplication operation***************");
			System.out.println("Enter your first number");
			int n1=scan.nextInt();
			System.out.println(" Enter your second number");
			int n2 =scan.nextInt();
			int res =n1*n2;
			System.out.println(n1+"*"+n2+"="+res);
			}
			break;
		case 4 :
			{
			System.out.println("*********************you have choosen division (quotient) operation**************");
			System.out.println("Enter your number");
			int n1=scan.nextInt();
			System.out.println("Enter your second number");
			int n2= scan.nextInt();
			int res =n1/n2;
			System.out.println(n1+"/"+n2+"="+res);
			}
			break;
		case 5:
			{
			System.out.println("**********************you have choosen division(reaminder) operation***********");
			System.out.println(" Enter your first number");
			int n1 =scan.nextInt();
			System.out.println("Enter your second number");
			int n2= scan.nextInt();
			int res=n1%n2;
			System.out.println(n1+"%"+n2+"="+res);
			}
			break;
		default :
			System.out.println("Invalid operation");
		break;
		}
	}
}



	


