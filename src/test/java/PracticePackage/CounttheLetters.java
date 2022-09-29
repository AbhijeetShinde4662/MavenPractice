package PracticePackage;

public class CounttheLetters
{

	public static void main(String[] args)
	{

		String s1="jamajamajamajama";
		int count=0;
		
		

		for (int i = 0; i <=s1.length()-4; i=i+4) 
		{
			if("jama".equals(s1.substring(i, i+4)))
			{
				count++;
			}
		}
		System.out.println(count);

	}

}
