package neostoxPOMclassMVC;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class NeostoxPasswordPage 
{

	@FindBy(xpath="//input[@type='password']") private WebElement password;
	
	@FindBy(xpath="//a[text()='Submit']") private WebElement submitButton;
	
	public NeostoxPasswordPage (WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	public void Insertpass(String Pass) throws InterruptedException 
	{
		password.sendKeys(Pass);
		Reporter.log("Entering password field", true);
		//submitButton.click();
		Thread.sleep(1000);
	}
	
	public void ClickOnSubmitButton() 
	{
		submitButton.click();
		Reporter.log("Click on Submit button", true);
	}
	
	
	
}
