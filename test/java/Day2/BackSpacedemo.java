package Day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BackSpacedemo {

	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver=new ChromeDriver();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			driver.manage().window().maximize();
			
			WebElement text=driver.findElement(By.xpath("//input[@name='username']"));
		text.sendKeys("ganesha");
		String ts=text.getAttribute("name");
	int count=	ts.length();
	Thread.sleep(5000);
	for(int i=0; i<=count; i++)
	{
		text.sendKeys(Keys.BACK_SPACE);
	}

	}

}
