package Day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Copypast {

	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver=new ChromeDriver();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			driver.manage().window().maximize();
			Thread.sleep(5000);
			WebElement text1=driver.findElement(By.xpath("//input[@name='username']"));
			text1.sendKeys("Ganesha");
			WebElement text2=driver.findElement(By.xpath("//input[@name='password']"));
			//text2.sendKeys("Ganesha");
			text2.clear();
			text1.sendKeys(Keys.CONTROL+"a");
			text1.sendKeys(Keys.CONTROL+"c");
			text2.sendKeys(Keys.CONTROL+"v");
			
			
			
	}

}
