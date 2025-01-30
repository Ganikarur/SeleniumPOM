package Day2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Chromeoptionsdemo {

	public static void main(String[] args) throws InterruptedException {
    // ChromeOptions option=new  ChromeOptions();
     //headless mode--it will execute in backend not in AUI OR SINCE EXECUTION HAPPEND BACKEND
     //option.addArguments("--headless=new");
     //option.setAcceptInsecureCerts(true);// accepts sll certificates
		ChromeOptions options = new ChromeOptions();
        //options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});// "to remove "chrome is being controlled by automated test software"

		options.addArguments("--incognito");// launch the browser in incognito
        // Initialize WebDriver with options
        WebDriver driver = new ChromeDriver(options);

        // Open the URL and perform actions
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();
        Thread.sleep(3000);

        // Print the page title
        System.out.println(driver.getTitle());

        // Close the driver
        driver.quit();
    }
}
