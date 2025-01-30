package Day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestdemo {

	public static void main(String[] args) {
		 WebDriver driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://www.google.com/");
			driver.manage().window().maximize();
			
			WebElement textbox=driver.findElement(By.xpath("//textarea[@id='APjFqb']"));
			textbox.sendKeys("selenium");
			List<WebElement> list=driver.findElements(By.xpath("//div[@jsname='aajZCb']//ul//li//span"));
		
			System.out.println(list.size());
			
			for(int i=0; i<list.size(); i++)
			{
				String text=list.get(i).getText();
				System.out.println(text);
			}
			textbox.sendKeys(Keys.ARROW_DOWN);
			textbox.sendKeys(Keys.ARROW_DOWN);
			textbox.sendKeys(Keys.ENTER);

	}

}
