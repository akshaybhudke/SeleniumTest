package automationFramework;

import java.util.concurrent.TimeUnit;

import mx4j.tools.config.DefaultConfigurationBuilder.Create;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import pageObjects.CreateAccount;

public class CreateAccount_TC {

	private static WebDriver driver = null;

	public static void main(String[] args) throws InterruptedException {
		
		driver = new FirefoxDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://accounts.google.com/SignUp?service=mail&continue=http%3A%2F%2Fmail.google.com%2Fmail%2F%3Fpc%3Dtopnav-about-en");

		// Use page Object library now

	CreateAccount.txtbx_FirstName(driver).sendKeys("testuser_1aa");
		CreateAccount.txtbx_LastName(driver).sendKeys("testlastaaa");
		CreateAccount.txtbx_GmailAddress(driver).sendKeys(
				"testlastaaaa@gmail.com");
		CreateAccount.txtbx_Password(driver).sendKeys("Test@123aa");
		CreateAccount.txtbx_PasswordAgain(driver).sendKeys("Test@123aa");
		CreateAccount.drop_downMonth(driver).click();
		CreateAccount.txtbx_Day(driver).sendKeys("12");
		// CreateAccount.txtbx_Day(driver).sendKeys("15");
		CreateAccount.txtbx_Year(driver).sendKeys("2015");
		CreateAccount.drop_downGender(driver).click();
		CreateAccount.txtbx_PhoneNumber(driver).sendKeys("7709427013");
		CreateAccount.check_IgnoreCaptecha(driver).click();
		CreateAccount.txtbx_RecoveryEmail(driver)
				.sendKeys("akshay11@gmail.com");
		CreateAccount.check_TermOfService(driver).click();

		Thread.sleep(500);
		 CreateAccount.btn_NextStep(driver);
		Thread.sleep(500);

		String actual = CreateAccount.after_NextStep(driver).toString();
		
		Assert.assertEquals(actual, "Google could not create your account");
		Thread.sleep(500);
		System.out
				.println(" Login Successfully, now it is the time to Log Off buddy.");
		driver.quit();

	}

}
