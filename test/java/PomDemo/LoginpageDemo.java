package PomDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginpageDemo {
	
	
	LoginpageDemo(WebDriver driver)
	{
		
		PageFactory.initElements(driver, this);
	}
	
   
	@FindBy(xpath="//input[@placeholder='Username']")
	WebElement UnTestbox;

	@FindBy(xpath="//input[@placeholder='Password']")
	WebElement PWTestbox;

	@FindBy(xpath="//button[normalize-space()='Login']")
	WebElement Loginbtn;
	
	void SetLoginData(String UName, String Password)
	{
		UnTestbox.sendKeys(UName);
		PWTestbox.sendKeys(Password);
		Loginbtn.click();
	}
	
	
}
