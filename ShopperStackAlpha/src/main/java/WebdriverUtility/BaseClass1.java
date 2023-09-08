package WebdriverUtility;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import Pomclass.AccountSettingElement;
import Pomclass.HomePage;
import Pomclass.LoginPage;
import Pomclass.WelcomePage;

public class BaseClass1 { //for cross browser execution
	public WebDriver driver;
	String Browser;
	PropertiesUtility pro =new PropertiesUtility();
	@Parameters("browser")//org.testng.annotation
	@BeforeClass
	public void confBeforeClass(String browser) throws Throwable
	{
		System.out.println("------Launching the Browser-----");
		//Browser = pro.propertiesFile("Browser");
		if(browser.equals("chrome")) {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		driver=new ChromeDriver();
		
		}
		
		else if(browser.equals("edge"))
		{
			System.setProperty("webdriver.edge.driver", "./Driver/msedgedriver.exe");
			driver=new EdgeDriver();
			
		}
		else if(browser.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "./Driver/geckodriver.exe");
			driver=new FirefoxDriver();
			
		}
		else {
			System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
			driver=new ChromeDriver();
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().window().maximize();
		
		String url= pro.propertiesFile("Url");
		driver.get(url);
			
		}

	@BeforeMethod
	
	public void confBeforeMethod() throws Throwable
	{
		System.out.println("------login to application-----");
		WelcomePage welpage =new WelcomePage(driver);
		welpage.getloginButtonWelcomePage().click();
		
		LoginPage loginp = new LoginPage(driver);
		
		String USERNAME = pro.propertiesFile("UserName");
		loginp.getEmailtextField().sendKeys(USERNAME);
		
		String PASSWORD = pro.propertiesFile("PassWord");
		loginp.getPasswordtextField().sendKeys(PASSWORD);
		
		loginp.getLoginButtonField().click();
		
		
	}
	@AfterMethod
	public void confAfterMethod() throws Throwable {
		System.out.println("----log out ---");
		//HomePage homep = new HomePage(driver);
		//Thread.sleep(3000);
		HomePage.accountSettingIcon(20,driver).click();
		
		
		AccountSettingElement ASelements =	 new AccountSettingElement(driver);
		ASelements.getLogoutIcon().click();
	
		
	}
	@AfterClass
	public void confAfterClass() {
		System.out.println("----- closing the browser----");
		driver.quit();
	
		
		

	}

}
