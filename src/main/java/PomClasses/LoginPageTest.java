package PomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageTest {

	WebDriver driver;
	
	
	public LoginPageTest(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//input[@data-testid='user-mobileno-input-box']")
	private WebElement MObileNumberTextField;
	
	
	@FindBy(xpath="//input[@data-testid='password-input-box-cta']")
	private WebElement PassTextField;
	
	@FindBy(xpath="//div[@data-testid='login-cta']")
	private WebElement LoginButton;
	
	
	public WebElement getMObileTextField() {
		return MObileNumberTextField;
	}

	public WebElement getPassTextField() {
		return PassTextField;
	}

	public WebElement getLoginButton() {
		return LoginButton;
	}

	

	
	
	
}
