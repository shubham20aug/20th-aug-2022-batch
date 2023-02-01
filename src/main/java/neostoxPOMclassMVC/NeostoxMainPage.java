package neostoxPOMclassMVC;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;



public class NeostoxMainPage
{

	@FindBy(xpath="//span[@id='lbl_username']") private WebElement userName;
	@FindBy(xpath="(//a[text()='OK'])[2]") private WebElement popupOk;
	@FindBy(xpath="(//a[text()='Close'])[5]") private WebElement popupClose;
	@FindBy(xpath="//span[text()='Logout']") private WebElement logout;
	
	
	public NeostoxMainPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}	
	
	
	
	
	
	public void clickonPopup(WebDriver driver) throws InterruptedException 
	{
		popupOk.click();
	    Utility.ScrollIntoView(driver, popupOk);
	    Reporter.log("click on popupok button ", true);
		Thread.sleep(500);
		//popupClose.click();
		 Utility.ScrollIntoView(driver, popupClose);
		
		Reporter.log("click on popupclose button ", true);
	}
	
	

	
	public String clickonusername() throws InterruptedException   
	{   Thread.sleep(1000);
		String actualUserName = userName.getText();
		userName.click();
		Thread.sleep(1000);
		Reporter.log("click on username", true);
		Reporter.log("Actual user name is ---> "+actualUserName, true);
		return actualUserName;
		
	}
	public void clickonlogoutbutton() 
	{
		logout.click();
		Reporter.log("click on logout button", true);
	}
	 
	
	
	
}
