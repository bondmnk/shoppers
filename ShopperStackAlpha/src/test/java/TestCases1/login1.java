package TestCases1;

import org.testng.annotations.Test;

import Pomclass.HomePage;
import WebdriverUtility.BaseClass;
import java.io.File;


public class login1 extends BaseClass {
	@Test(groups= "Regration")
	public void Tc_Login_002() {
			HomePage homep = new HomePage(driver);
			homep.getWomenMenuLink().click();
			
}
	}
