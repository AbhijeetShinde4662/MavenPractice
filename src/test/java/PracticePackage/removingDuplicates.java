package PracticePackage;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class removingDuplicates 
{

	public static void main(String[] args)
	{
			String s1="hi hi its abhijeet abhijeet shinde speaking";
			String[] s2 = s1.split(" ");
			Set<String>set=  new LinkedHashSet<>();
			for (int i = 0; i < s2.length-1; i++) 
			{
				set.add(s2[i]);
			}
			for (String s3 : set) 
			{
				System.out.print(s3+" ");
			}
			
	}
}