package neostoxPOMclassMVC;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.testng.Reporter;

import net.bytebuddy.utility.RandomString;

public class Utility 
{
	public static String readDataFromExcel(int row,int cell) throws EncryptedDocumentException, IOException 
	{
		File myfile =new File("C:\\\\\\\\poi-bin-5.2.3-20220909\\\\\\\\worksheet.xlsx");
		Sheet mysheet = WorkbookFactory.create(myfile).getSheet("Sheet2");
		String value = mysheet.getRow(row).getCell(cell).getStringCellValue();
		Reporter.log("REading data from Excel sheet row is"+row+ "cell is "+cell, true);
		Reporter.log( "value is "+value, true);
		return value;
	}
	
	public static void implicitWait(int time , WebDriver driver) 
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(time));
		Reporter.log("waiting for "+time+"ms", true);
	}
	
	public static void takeScreenShot(WebDriver driver ,String fileName) throws IOException 
	{
		
		File soure = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String s = RandomString.make(2);
		File dest=new File("C:\\Users\\Shubham Solankar\\Videos\\Screenshot\\tests"+fileName+s+".png");
		FileHandler.copy(soure, dest);
		Reporter.log("Taking Screenshot ", true);
		Reporter.log("screenshot taken and saved at "+dest, true);
	}
	
	public static void ScrollIntoView(WebDriver driver,WebElement element) 
	{
		JavascriptExecutor js = (JavascriptExecutor)driver; 
		js.executeScript("arguments[0].scrollIntoView(true)", element);
		
		Reporter.log("scroll into view to "+element, true);
	}
	
	
	
	
}


