package neostoxPOMclassMVC;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class NeostoxSinginPage 
{

	@FindBy(xpath="(//input[@type='number'])[1]") private WebElement userid;
	@FindBy(xpath="(//a[text()='Sign In'])[2]") private WebElement singinButton;
	
	
	public NeostoxSinginPage (WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		
	}
	
	
	public void Insertnumfield(String Number) throws InterruptedException 
	{
		userid.sendKeys(Number);
		Thread.sleep(500);
		Reporter.log("Entering mobile no. field", true);
	}
		
	
	
	public void ClickOnLoginButton() 
	{
		singinButton.click();
		Reporter.log("clicking on SingIn button ", true);
	}
}
