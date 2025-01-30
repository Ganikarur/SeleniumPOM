package Day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksDemo1 {

	public static void main(String[] args) {
		 WebDriver driver=new ChromeDriver();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			driver.manage().window().maximize();
            List<WebElement> alllinks=driver.findElements(By.xpath("//a"));
            int count=alllinks.size();
            System.out.println("Print the number links"  +count);
           /* for(WebElement link:alllinks)
            {
            	
            	String text=link.getAttribute("href");
            	System.out.println(text);   */
            for(int i=0; i<alllinks.size(); i++)
            {
            WebElement	Links=alllinks.get(2);
           String text= Links.getAttribute("href");
           System.out.println(text);
           break;
	}}

}
