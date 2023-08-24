package Practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browsers {

	public static void main(String[] args) {
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
		
		driver.switchTo().window(child);
	driver.findElement(By.xpath("//*[text()='Help']")).click();
	
	 Set<String> windowHandles2 = driver.getWindowHandles();
		
		List<String> ids2= new ArrayList(windowHandles2);
		
		System.out.println(ids2);
		
		String parent1=ids.get(0);
		
		driver.switchTo().window(parent1);
	
	
	}
	

}
