package Day2;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksDemo {

	public static void main(String[] args) throws IOException {
		
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://www.deadlinkcity.com/");
		driver.manage().window().maximize();
		
		//capture all the links from website
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println("Total number of links:"+ links.size());
		int noofbrokenlinks=0;
		for(WebElement linlwebelemts:links)
		{
			String hrefat=linlwebelemts.getAttribute("href");
			if(hrefat==null || hrefat.isEmpty())
			{
				System.out.println("href attribute value is null or empty. So Not possible to check ");
				continue;
			}
			
			try {
				
			URL linkurl=new URL(hrefat);// converted href value from string to URL format
			HttpURLConnection conn=(HttpURLConnection)linkurl.openConnection();// open connection to the server
			conn.connect(); //connect to server and sent request  the server
			
			if(conn.getResponseCode()>=400)
			{
				System.out.println(hrefat +"======>all the links are broken");
				
				noofbrokenlinks++;
			}
			else
			{
				System.out.println(hrefat+ "====>all the links are not broken");
			}
			
		}
		catch (Exception e)
			{
			
			}
		}
		System.out.println("Number of broken links:"+ noofbrokenlinks);
	
	}}
			
		
		
		
		
	
	

		

	


