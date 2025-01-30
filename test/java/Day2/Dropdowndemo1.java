package Day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdowndemo1 {

	public static void main(String[] args) {
		
		 WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://practice.expandtesting.com/dropdown");
		driver.manage().window().maximize();
		
		WebElement dropdwon=driver.findElement(By.xpath("//select[@name='country']"));
		
		Select select=new Select(dropdwon);
		List<WebElement> dp =select.getOptions();
		System.out.println(dp.size());
		
		ArrayList<String> altext=new ArrayList<String>();
		
		for(int i=0; i<dp.size(); i++ )
		{
			String text=dp.get(i).getText();
			System.out.println("Starting all text==========>");
			System.out.println(text);
			System.out.println("Ending all text==========>");
			altext.add(text);
		}
		Collections.sort(altext);
		for(String s:altext)
		{
			System.out.println(s);
	
	
		}
}}
