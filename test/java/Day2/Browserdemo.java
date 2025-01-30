package Day2;

import java.awt.Dimension;
import java.io.IOException;
import java.time.Duration;
import java.util.Scanner;

import org.apache.commons.math3.geometry.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Browserdemo {
	public static void main(String[] args) throws IOException {
		
		Scanner s=new Scanner(System.in);
		System.out.println("ENTER THE BROWER NAME: GC/ IE");
		
		String browser=s.next();
		
		WebDriver driver;
		
		if(browser.equals("GC"))
		{
			driver=new ChromeDriver();
			driver.get("http://www.deadlinkcity.com/");
		}
		else if(browser.equals("IE"))
		{
			driver=new EdgeDriver();
			driver.get("http://www.deadlinkcity.com/");
		}
		
		
	}}