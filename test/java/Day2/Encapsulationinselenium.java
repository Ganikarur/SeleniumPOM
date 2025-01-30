package Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Encapsulationinselenium {

	
		
		private WebElement UnTextbox;
		private WebElement psTextbox;
		private WebElement loginTextbox;
		
		public  Encapsulationinselenium(WebDriver driver)
		{
		UnTextbox=driver.findElement(By.xpath("//input[@name='username']"));
		psTextbox=driver.findElement(By.xpath("//input[@name='password']"));
		loginTextbox=driver.findElement(By.xpath("//button[normalize-space()='Login']"));
		}
  public void setdata(String un, String pawssword) throws InterruptedException 
  {
	 Thread.sleep(3000);
	  UnTextbox.sendKeys(un);
	  psTextbox.sendKeys(pawssword);
	  loginTextbox.click();
  
	}

	// TODO Auto-generated method stub
	
}


