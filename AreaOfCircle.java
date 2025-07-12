import java.util.Scanner;
class AreaOfCircle

{
 public static void main (String [] args)
	{
	 Scanner scan = new Scanner(System.in);
	 double pi =3.14;
	 System.out.println(" Enter the radius value");
	 int r = scan.nextInt();
	 double area = pi*r*r;
	 System.out.println(" Area of circle is :"+area);
	}
}
