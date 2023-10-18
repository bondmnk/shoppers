package PomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageBeforeLoginTest {

	WebDriver driver;
	
	public HomePageBeforeLoginTest(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath  ="//div[text()='Login']")
	private WebElement loginMainButton;


	public WebElement getLoginMainButton() {
		return loginMainButton;
	}


	
}
