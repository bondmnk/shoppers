package Pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountSettingElement {
	public WebDriver driver;
	public AccountSettingElement(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//*[name() = 'svg' and @ data-testid ='LogoutIcon']")
	private WebElement logoutIcon;
	
	public WebElement getLogoutIcon() {
		return logoutIcon;
}
}