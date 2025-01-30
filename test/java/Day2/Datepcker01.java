package Day2;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement; // For WebElement
import java.util.List;
import java.time.Duration;

public class Datepcker01 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		driver.switchTo().frame(0);
		//WebElement datepicker=driver.findElement(By.xpath("//input[@id='datepicker']"));
		//datepicker.sendKeys("01/04/2025");
		//method 2
		String month="April";
		String year="2024";
	
		String date="10";
		//opens date pickers
		WebElement datepicker=driver.findElement(By.xpath("//input[@id='datepicker']"));
		datepicker.click();
		
		//select month and years
		while(true)
		{
			String currentmonth=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			String currentyear=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			
			
			if(currentmonth.equals(month) && currentyear.equals(year))
           {
	           break;
           }
			//driver.findElement(By.xpath("//span[text()='Next']")).click();//next year or month
			driver.findElement(By.xpath("//span[text()='Prev']")).click();//prevous year or month
			
		}
		   List<WebElement> dates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tr//td//a"));
		for(WebElement days:dates)
		{
			if(days.getText().equals(date));
			{
				days.click();
				break;
			}
			}
			
	

	}}


