package Day2;
import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshotsdemo {

	public static void main(String[] args) {
		
		
        WebDriver driver=new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		/*TakesScreenshot take=(TakesScreenshot)driver;
		
		File sourcefile=take.getScreenshotAs(OutputType.FILE);
		File targetfile=new File(System.getProperty("user.dir")+"\\Screenshots1\\fullpage.png");
		//copy source file to target file
		sourcefile.renameTo(targetfile);
*/// capture screenshots specific section
		WebElement feature=driver.findElement(By.xpath("//div[@class='category-grid home-page-category-grid']"));
		File sourcefile=feature.getScreenshotAs(OutputType.FILE);
		File targetfile=new File((System.getProperty("user.dir")+"\\Screenshots1\\fullpage1.png"));
		sourcefile.renameTo(targetfile);
	}

}
