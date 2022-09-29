package PracticePackage;

public class PatternMatching 
{

	public static void main(String[] args) 
	{
		int no=07;
		
		for (int i = 1; i <= no; i++) 
		{
			for (int j = 1; j <= i; j++) 
			{

				if(i%2==0)
				{
					System.out.print("0");
				}
				else
				{
					System.out.print("1");
				}



			}
			System.out.println("");
		}
	}

}
