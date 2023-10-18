package Utilities;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import PomClasses.HomePageAfterLoginTest;
import PomClasses.HomePageBeforeLoginTest;
import PomClasses.LoginPageTest;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;
	
	
	@BeforeClass
	public void BeforeClass() throws Throwable {
		
		DataUtilities dataProperties = new DataUtilities();
		String BROWSER=dataProperties.dataFromPropertiesFile("./src/test/resources/data.properties", "Browser");
		
		if(BROWSER.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			ChromeOptions option=new ChromeOptions();
			option.addArguments("--disable-notifications");
			driver=new ChromeDriver(option);
		}
		else if(BROWSER.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
		else if(BROWSER.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}
		else {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		String URL=dataProperties.dataFromPropertiesFile("./src/test/resources/data.properties", "url");
		driver.get(URL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		
	}
	
	@BeforeMethod
	public void BeforeMethod() throws Throwable {
		DataUtilities dataProperties = new DataUtilities();
	
		
		
		
		HomePageBeforeLoginTest HBL = new HomePageBeforeLoginTest(driver);
	    HBL.getLoginMainButton().click();
	    
	    LoginPageTest Lp = new LoginPageTest(driver);
	    Thread.sleep(3000l);
	    Lp.getMObileTextField().sendKeys("9353822214");
	    Lp.getPassTextField().sendKeys("s1615691S@");
	    Lp.getLoginButton().click();
		
	}
	
	@AfterMethod
	public void AfterMethod() throws Throwable {
	Thread.sleep(6000);
	HomePageAfterLoginTest HomePageEle = new HomePageAfterLoginTest(driver);
	HomePageEle.getAccountSettingIcon().click();
	HomePageEle.getLogoutIcon().click();	
	}
	
	
	
	@AfterClass
	public void AfterClass() {
		driver.quit();
	}
}
