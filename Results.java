class Results 
{
	public static void main(String[] args) 
	{
		int marks=75;
		if(marks <=100 && marks >= 70)
		{
			System.out.println("Excellent");
		}
		else if ( marks<70 && marks >=50)
		{
			System.out.println("Grade A ");
		}
		else if (marks <50 && marks >=35)
		{
			System.out.println(" Grade B");
		}
		else 
		{
			System.out.println(" Failed");
		}
	}
}
