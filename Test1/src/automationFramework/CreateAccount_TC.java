package automationFramework;

import java.util.concurrent.TimeUnit;

import mx4j.tools.config.DefaultConfigurationBuilder.Create;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import pageObjects.CreateAccount;

public class CreateAccount_TC {

	private static WebDriver driver = null;

	public static void main(String[] args) throws InterruptedException {

		driver = new FirefoxDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://accounts.google.com/SignUp?service=mail&continue=http%3A%2F%2Fmail.google.com%2Fmail%2F%3Fpc%3Dtopnav-about-en");

		// Use page Object library now

		CreateAccount.txtbx_FirstName(driver).sendKeys("testuser_1");
		Thread.sleep(100);
		CreateAccount.txtbx_LastName(driver).sendKeys("testlast");
		Thread.sleep(100);
		CreateAccount.txtbx_GmailAddress(driver).sendKeys("testlast@gmail.com");
		Thread.sleep(100);

		CreateAccount.txtbx_Password(driver).sendKeys("Test@123");
		Thread.sleep(100);
		CreateAccount.txtbx_PasswordAgain(driver).sendKeys("Test@123");
		Thread.sleep(2000);
		CreateAccount.drop_downMonth(driver).click();
		
		Thread.sleep(100);
		CreateAccount.txtbx_Day(driver).sendKeys("12");
		//CreateAccount.txtbx_Day(driver).sendKeys("15");
		Thread.sleep(100);
		CreateAccount.txtbx_Year(driver).sendKeys("2015");
         
		CreateAccount.drop_downGender(driver).click();
		Thread.sleep(100);
		CreateAccount.txtbx_PhoneNumber(driver).sendKeys("7709427013");
	
		CreateAccount.check_IgnoreCaptecha(driver).click();
		Thread.sleep(100);
     	CreateAccount.txtbx_RecoveryEmail(driver)
				.sendKeys("akshay11@gmail.com");
     	
     	CreateAccount.check_TermOfService(driver).click();
     	

		Thread.sleep(500);
		CreateAccount.btn_NextStep(driver).click();
		Thread.sleep(10000);

		
		System.out
				.println(" Login Successfully, now it is the time to Log Off buddy.");
		driver.quit();
		
		

	}

}
