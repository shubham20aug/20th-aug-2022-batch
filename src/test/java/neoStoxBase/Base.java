package neoStoxBase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

import neostoxPOMclassMVC.Utility;



public class Base 
{
	 protected WebDriver driver;
	public void launchBrowser() 
	{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://neostox.com/");
		Utility.implicitWait(1000, driver);
		Reporter.log("launching browser", true);
	
	}
	

}
