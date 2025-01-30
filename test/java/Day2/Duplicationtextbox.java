package Day2;

import java.time.Duration;
import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Duplicationtextbox {

	public static void main(String[] args) {
		 WebDriver driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://practice.expandtesting.com/dropdown");
			driver.manage().window().maximize();
			
			WebElement dropdwon=driver.findElement(By.xpath("//select[@name='country']"));
			
			Select select=new Select(dropdwon);
			List<WebElement> dp =select.getOptions();
			System.out.println(dp.size());
			
			HashSet<String> allt=new HashSet<String>();
			for(int i=0; i<dp.size(); i++)
			{
				String duplicate=dp.get(i).getText();
				if(allt.add(duplicate)==false)
             {
	  System.out.println(duplicate);
}
			}
			
	}

}
