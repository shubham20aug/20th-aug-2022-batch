package neostoxPOMclassMVC;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class Orderlist 
{
	//1. Data member should be declared globally with access level private using @FindBy annotation
	
		@FindBy(xpath="(//a[text()='Sign In'])[1]") private WebElement signInButton;
		
		
		//2.Initialize within a construction with access level public using pageFactory
		
		public Orderlist (WebDriver driver) 
		{
			PageFactory.initElements(driver, this);
		}
		
		//3. Utilize within a method with access level public 
		
		public void clickonsinginButton()
		{
			signInButton.click();
			Reporter.log("Clicking on SignIn button", true);
		}	
}
