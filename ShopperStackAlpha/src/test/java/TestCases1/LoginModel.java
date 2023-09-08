package TestCases1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import WebdriverUtility.BaseClass;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.webdriver.WebDriverBrowser;

public class LoginModel extends BaseClass{

	@Test
	public void Tc_Login_001() {
		WebDriverBrowser driver;
		WebDriverManager.chromedriver().setup();		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
WebDriver driver1 = new ChromeDriver();
	driver1.get("https://www.facebook.com/");
	driver1.quit();
		System.out.println("First test case  just now added");
		driver1.quit();
	}
	@Test
	public void ATc_Login_002() {
		
	System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	driver.get("https://www.makemytrip.com/");
		driver.quit();
		
		System.out.println("second test case");
	}

}
