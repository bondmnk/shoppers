package Pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage {

	WebDriver driver;
	public WelcomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);//pagefactory will initialize all the web elements
		this.driver =driver;
	}
	@FindBy(id="loginBtn")
	
	private WebElement loginButtonWelcomePage;
	public WebElement getloginButtonWelcomePage()
	{
		return loginButtonWelcomePage;
	}
}
