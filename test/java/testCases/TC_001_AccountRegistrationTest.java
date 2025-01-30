package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.RegistrationPage;

public class TC_001_AccountRegistrationTest extends BaseClass{
	
	@Test
	public void verify_account_registration()
	{
		HomePage hp=new HomePage(driver);
		hp.clickMyAccount();
		hp.clickRegister();
		
		RegistrationPage regpage=new RegistrationPage(driver);
		
		regpage.setFirstName(randomeString().toUpperCase());
		regpage.setLastName(randomeString().toUpperCase());
		regpage.setEmail(randomeString()+"@gmail.com");// randomly generated the email
		regpage.setTelephone(randomeNumber());
		
		String password=randomAlphaNumeric();
		
		regpage.setPassword(password);
		regpage.setConfirmPassword(password);
		
		regpage.setPrivacyPolicy();
		regpage.clickContinue();
		
		String confmsg=regpage.getconfirmationmsg();
		Assert.assertEquals(confmsg, "Your Account Has Been Created!");
		
	}
	
	
	
	
}








