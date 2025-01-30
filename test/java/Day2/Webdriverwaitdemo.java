package Day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Webdriverwaitdemo {

	public static void main(String[] args) throws InterruptedException {
		
		
        WebDriver driver=new ChromeDriver();
		try {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		//wait.until(ExpectedConditions.titleIs("OrangeHRM"));
        
		 System.out.println(wait.until(ExpectedConditions.titleIs("OrangeHRM")));
		 
		 System.out.println(driver.getTitle());
		 
		 Thread.sleep(5000);
		 
		 driver.findElement(By.xpath("//span[@class='oxd-userdropdown-tab']")).click();
		 
		List<WebElement> text=driver.findElements(By.xpath("//a[@class='oxd-userdropdown-link']"));
		int count =text.size();
		System.out.println(count);
		
		 /*for(WebElement log:text)
		 {
			 String link=log.getText();
			 System.out.println(link);*/
		for(int i=0; i<count; i++)
		{
			String data=text.get(i).getText();
			System.out.println(data);
			
			if(data.equals("Logout"))
			{
				text.get(i).click();
			}
		 }
		 }
		 catch(Exception e)
		 {
			 System.out.println("pass");
		 }
	}}
		
		 
		 
			 
		
	
