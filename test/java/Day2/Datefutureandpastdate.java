package Day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Datefutureandpastdate {
	static void selectfuturedate(WebDriver driver, String month, String year, String date)
	{
		
	while(true)
	{
		String currentmonth=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
		String currentyear=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
		
		if(currentmonth.equals(month) && currentyear.equals(year))
		{
			break;
		}
		
		driver.findElement(By.xpath("//span[text()='Next']")).click();//next year or month
		//driver.findElement(By.xpath("//span[text()='Prev']")).click();//prevous year or month
		
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

}
	//past date selection
	static void selectpastdate(WebDriver driver, String month, String year, String date)
	{
		
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

}



	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		driver.switchTo().frame(0);
		
		//method 2
		String month="June";
		String year="2025";
		String date="21";
		WebElement datepicker=driver.findElement(By.xpath("//input[@id='datepicker']"));
		datepicker.click();
		selectfuturedate(driver, month,year,date);
		//selectpastdate(driver, month,year,date);
		
	}

}
