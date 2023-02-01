package neoStoxTestClass;

import org.testng.annotations.Test;

import neoStoxBase.Base;
import neostoxPOMclassMVC.NeostoxHomePage;
import neostoxPOMclassMVC.NeostoxMainPage;
import neostoxPOMclassMVC.NeostoxPasswordPage;
import neostoxPOMclassMVC.NeostoxSinginPage;
import neostoxPOMclassMVC.Utility;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class validateUserName extends Base
{
	NeostoxHomePage home;
	NeostoxSinginPage singin;
	NeostoxPasswordPage passs;
	NeostoxMainPage dash;
	//String s ="TC-121";
	
	
	
 @BeforeClass
      public void beforeClass() 
 {
	 launchBrowser();
	 home = new NeostoxHomePage(driver);
	 singin =new NeostoxSinginPage(driver);
	 passs  =new NeostoxPasswordPage(driver);
	 dash =new NeostoxMainPage(driver);
	 
	 
	  }
	 
 @BeforeMethod
	  public void logingToneostox() throws EncryptedDocumentException, InterruptedException, IOException 
 {
	home.clickonsinginButton();
	Utility.implicitWait(1000, driver);
	
	singin.Insertnumfield(Utility.readDataFromExcel(0, 0));
	Utility.implicitWait(1000, driver);
	singin.ClickOnLoginButton();
	Utility.implicitWait(1000, driver);
	
	passs.Insertpass(Utility.readDataFromExcel(0, 1));
	passs.ClickOnSubmitButton();
	
	Utility.implicitWait(1000, driver);
	dash.clickonPopup(driver);
	
 }
 

  @Test
      public void validateUsername() throws EncryptedDocumentException, InterruptedException, IOException  
  {
	 Assert.assertEquals(dash.clickonusername(),Utility.readDataFromExcel(0, 2),"Actual and Expected User name are not matching TC failed");
	  Utility.takeScreenShot(driver, "Random SS");
  }
 
  @AfterMethod
      public void logoutToneostox()
  {
	  dash.clickonlogoutbutton();
  }

 

  @AfterClass
      public void closingBrowser()
  {
	  driver.close();
  }

}
