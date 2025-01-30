package TestNg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataproviderdemo1 {
	
	WebDriver driver;
	@BeforeClass
  void openApplication()
  {//Username : Admin

//Password : admin123
	  driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  
  }

	@Test(dataProvider ="dp",priority=1)
  void loginApplication(String name, String password) throws InterruptedException
  {
		Thread.sleep(5000);
		  driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(name);
	  driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(password);
	  Thread.sleep(3000);	
	  driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
  }
	@DataProvider(name="dp")
	Object[][] logindata()
	{
		Object[] [] data= {{"ganesha","testa"},
		                   { "test","123"}};
		return data;
		}
	
	@AfterClass
  void logoutApplication()
  {
	  driver.close();
  }



}
