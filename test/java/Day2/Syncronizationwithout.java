package Day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Syncronizationwithout {

	public static void main(String[] args) {
		 WebDriver driver=new ChromeDriver();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			driver.manage().window().maximize();
			
			driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
			driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
			
			
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			
			while(true)
			{
				try {
					 driver.findElement(By.xpath("//span[@class='oxd-userdropdown-tab']")).click();
					 break;
				}catch(Exception e)
				{
					System.out.println("Bye");
				}
					 
			}}} 
	
			 
