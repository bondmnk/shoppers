package TestCases1;

import java.io.File;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Pomclass.HomePage;
import WebdriverUtility.BaseClass;
import WebdriverUtility.DriverUtility;
import WebdriverUtility.DriverUtitlity;
@Listeners(WebdriverUtility.ListnersImplementation.class)
public class Login extends BaseClass { //use BaseClass1 for crossbrowser execution
	
	@Test(groups ="Regration")
public void Tc_Login_001() throws InterruptedException {
		HomePage homep = new HomePage(driver);
		homep.getMenMenuLink().click();
		DriverUtility driverU= new DriverUtility();
		driverU.scrollWebPage(driver, 0, 1000);
		Thread.sleep(6000);
	}

//	@Test(groups= "smoke")
//public void Tc_Login_002() {
//		HomePage homep = new HomePage(driver);
//		homep.getWomenMenuLink().click();
//	
	
	}

