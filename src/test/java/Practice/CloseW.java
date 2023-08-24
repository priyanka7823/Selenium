package Practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CloseW {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://support.google.com/mail/answer/56256?hl=en");
			
		
		driver.findElement(By.xpath("//*[@class='action-button']")).click();
		
	Set<String> windowHandles = driver.getWindowHandles();
		
		List<String> ids= new ArrayList(windowHandles);
		
		System.out.println(ids);
		
		String parent=ids.get(0);
		String child=	ids.get(1);
		
		for(String wid:ids)
		{
			
			String title= driver.switchTo().window(wid).getTitle();
		
			if(title.equals("Sign in - Google Accounts"))
			{
				//driver.findElement(By.xpath("//*[text()='Help']")).click();
				
				driver.close();
			}
		}
		
	}

}
