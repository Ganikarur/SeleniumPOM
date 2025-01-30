package Day2;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pageloadtimeoutdemo {

	public static void main(String[] args) {
		 WebDriver driver=new ChromeDriver();
		 driver.manage().timeouts().pageLoadTimeout(1, TimeUnit.SECONDS);	
		//
		 
		 try {
			 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"); 
			 System.out.println("page is loaded within 3 mints");
		 }
		 catch(Exception e)
		 {
			 System.out.println("page is not loaded within 3 mints");
		 }
	}

}
