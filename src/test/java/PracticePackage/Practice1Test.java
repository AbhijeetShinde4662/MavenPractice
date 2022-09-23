package PracticePackage;

import org.testng.annotations.Test;

public class Practice1Test
{
	@Test
	public void sample()
	{
		String browser = System.getProperty("br");
		String url = System.getProperty("ur");
		
		System.out.println(browser);
		System.out.println(url);
		
		System.out.println("Hi I am Indian");
	}
}
 
