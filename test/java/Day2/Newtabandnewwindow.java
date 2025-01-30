package Day2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Newtabandnewwindow {

	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://demo.nopcommerce.com/");
		//driver.switchTo().newWindow(WindowType.WINDOW);
	}

}
