package Pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public WebDriver driver;
	public  LoginPage (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	@FindBy(id= "Email")
	private WebElement EmailtextField;
	
	@FindBy(id= "Password")
	private WebElement PasswordTextField;
	
	@FindBy(id= "Login")
	private WebElement LoginButtonField;
	 
	public WebElement getEmailtextField() {
		return EmailtextField;
	}
		public WebElement getPasswordtextField() {
			return PasswordTextField;
		}
			public WebElement getLoginButtonField() {
				return LoginButtonField;
			}
		
		
	}
	

