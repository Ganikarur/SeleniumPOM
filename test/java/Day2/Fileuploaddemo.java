package Day2;

import org.apache.xmlbeans.impl.soap.Text;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fileuploaddemo {

	
public static void main(String[] args) throws InterruptedException {
		
        WebDriver driver=new ChromeDriver();
		
		driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
		driver.manage().window().maximize();
		
		/*driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys("C:\\Ganesha\\Text.txt");
		
		String text=driver.findElement(By.xpath("//ul[@id='fileList']//li")).getText();
		System.out.println(text);
		if(text.equals("Text.txt"))
		{
			System.out.println("Test pass");
		}
		else
		{
			System.out.println("Test Fail");
		}
        
}
		
		
		// 

	}*/

//multiple fules upload
		
		String file1="C:\\Ganesha\\Text.txt";
		String file2="C:\\Ganesha\\Text1.txt";
driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys(file1+"\n"+file2);
		
		int totalfiles=driver.findElements(By.xpath("//ul[@id='fileList']//li")).size();
		System.out.println(totalfiles);
		
			if(totalfiles==2)
			{
				System.out.println("All files are uploaded succesfully");
			}
			else
			{
				System.out.println("All files are not uploaded succesfully");
			}
			// checking the files names are matching
	        if(driver.findElement(By.xpath("//ul[@id='fileList']//li[1]")).getText().equals("Text.txt") && driver.findElement(By.xpath("//ul[@id='fileList']//li[2]")).getText().equals("Text1.txt"))
	        {
	        	System.out.println("File names are matchings");
			}
			else
			{
				System.out.println("File names are not matchings");
	        }
		}
			
}
