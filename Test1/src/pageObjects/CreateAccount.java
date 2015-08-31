package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class CreateAccount  {

	private static WebElement element = null;

	public static WebElement txtbx_FirstName(WebDriver driver) {

		element = driver.findElement(By.xpath("id('FirstName')"));

		return element;

	}

	public static WebElement txtbx_LastName(WebDriver driver) {

		element = driver.findElement(By.xpath("id('LastName')"));

		return element;

	}

	public static WebElement txtbx_GmailAddress(WebDriver driver) {

		element = driver.findElement(By.xpath("id('GmailAddress')"));

		return element;

	}

	public static WebElement txtbx_Password(WebDriver driver) {

		element = driver.findElement(By.xpath("id('Passwd')"));

		return element;

	}

	public static WebElement txtbx_PasswordAgain(WebDriver driver) {

		element = driver.findElement(By.xpath("id('PasswdAgain')"));

		return element;

	}

	public static WebElement drop_downMonth(WebDriver driver) {
		driver.findElement(By.xpath("//span[@id='BirthMonth']/div[1]")).click();

		element = driver.findElement(By
				.xpath("//span[@id='BirthMonth']/div[2]/div[5]"));

		return element;

	}

	public static WebElement txtbx_Day(WebDriver driver) {
         
	
		element = driver.findElement(By.xpath("id('BirthDay')"));
		return element;

	}

	public static WebElement txtbx_Year(WebDriver driver) {

		element = driver.findElement(By.xpath("id('BirthYear')"));

		return element;

	}

	public static WebElement drop_downGender(WebDriver driver) {
	      driver.findElement(By.xpath(" /html/body/div[1]/div[2]/div/div[1]/div/form/div[6]/label/div/div[1]")).click();

		element = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[1]/div/form/div[6]/label/div/div[2]/div[2]"));

		return element;

	}

	public static WebElement txtbx_PhoneNumber(WebDriver driver) {

	
		element = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[1]/div/form/div[7]/table/tbody/tr/td/input"));

		return element;

	}

	public static WebElement txtbx_RecoveryEmail(WebDriver driver) {

		element = driver.findElement(By.xpath("id('RecoveryEmailAddress')"));

		return element;

	}

	public static WebElement drop_downCountry(WebDriver driver) {

		element = driver.findElement(By.xpath("id(':h')"));

		return element;

	}  
	
	
	public static WebElement check_TermOfService(WebDriver driver) {

		element = driver.findElement(By.xpath("id('TermsOfService')"));

		return element;

	}  
	public static WebElement check_IgnoreCaptecha(WebDriver driver) {

		element = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[1]/div/form/div[9]/div[1]/label/input"));

		return element;

	}  
	

	public static WebElement btn_NextStep(WebDriver driver) {

		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[1]/div/form/div[13]/input")).click();
		element=driver.findElement(By.xpath("/html/body/div[3]/table/tbody/tr/td/font[2]/p"));
		
			return element;

	}
	public static WebElement after_NextStep(WebDriver webDriver){
		element=webDriver.findElement(By.xpath("/html/body/div[3]/table/tbody/tr/td/font[2]/p"));
		
		  return element;
	}

}
