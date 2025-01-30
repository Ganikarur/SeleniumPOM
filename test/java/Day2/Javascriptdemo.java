package Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascriptdemo {

	public static void main(String[] args) throws InterruptedException {
		
        WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		//driver.findElement(By.xpath("//input[@id='small-searchterms']")).sendKeys("TEXT");
		
		//send to data
		WebElement text=driver.findElement(By.xpath("//input[@id='small-searchterms']"));
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute('value','ganesha')",text);
		
		//WebElement clk=driver.findElement(By.xpath("//a[normalize-space()='Register']"));
		//js.executeScript("arguments[0].click()",clk);
		Thread.sleep(5000);
		
		//click
		//js.executeScript("window.scrollBy(0,3000)", "");
	//	System.out.println(js.executeScript("return window.PageYoffset;"));
		// get the data particular screen
		WebElement word=driver.findElement(By.xpath("//strong[normalize-space()='News']"));
		js.executeScript("arguments[0].scrollIntoView();", word); 
		System.out.println(js.executeScript("return window.PageYOffset;"));
		
		// scrolling upto till end page
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
			System.out.println(js.executeScript("return window.PageYOffset;"));
			Thread.sleep(5000);
			// scrolling upto till top page
			js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
				System.out.println(js.executeScript("return window.PageYOffset;"));
			//zoom level
				js.executeScript("document.body.style.zoom='20%'");
				
			

	}

}
