package PomDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainLoginpage {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		LoginpageDemo login=new LoginpageDemo(driver);
		login.SetLoginData("admin", "admin123");
		
		System.out.println(driver.getTitle());
		if(driver.getTitle().equals("OrangeHRM"))
		{
			System.out.println("Test case pass");
		}else {
			System.out.println("Test case fail");
		}
	}

}
