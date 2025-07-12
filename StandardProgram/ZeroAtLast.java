import java.util.Scanner;
import java.util.Arrays;
class ZeroAtLast 
{
	public static void main(String[] args) 
	{
		Scanner scan =new Scanner(System.in);
       System.out.println("Enter the array size:");
	   int size=scan.nextInt();
	   System.out.println("Enter the elements");
	   int []a=new int [size];
	   for(int i=0;i<=a.length-1;i++)
		{
		   a[i]=scan.nextInt();
		}
		System.out.println("The array is "+Arrays.toString(zeroatlast (a)));
	}
	public static int [] zeroatlast(int[]a)
	{
		for(int i=0;i<=a.length-1;i++)
		{
			if(a[i]==0)
			{
				for(int j=i+1;j<=a.length-1;j++)
				{
					if(a[j]!=0)
					{
						int temp=a[i];
						a[i]=a[j];
						a[j]=temp;
						break;
					}
				}
			}
		}
		return a;
}
}