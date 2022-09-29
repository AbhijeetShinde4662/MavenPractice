package PracticePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Practice5Test
{
	@Test
	public void sample()
	{
		String browser= System.getProperty("b");
		String url= System.getProperty("u");
		
		
		
		System.out.println("The name of the browser is= "+browser);
		System.out.println("The url is"+url); 
		
		
		WebDriverManager.chromedriver().setup();
		if(browser.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			WebDriver driver= new ChromeDriver();
			driver.get(url);
		}
}
	
}
