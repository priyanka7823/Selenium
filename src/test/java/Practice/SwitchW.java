package Practice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class SwitchW {

	public static void main(String[] args) 
	{
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.gmail.com/");
		driver.findElement(By.xpath("//*[text()='Help']")).click();
		Set <String> ab=driver.getWindowHandles();
		System.out.println(ab);
		
		Iterator<String> itr= ab.iterator();
		   itr.next();
		//   itr.next();
		driver.switchTo().window(itr.next());
		
		   driver.findElement(By.xpath("//*[text()='Google Account']")).click(); 
		   
		   
	Set <String>third=	   driver.getWindowHandles();
	System.out.println(third + " Third window id ");
	
	Iterator<String> itr1= third.iterator();
	   itr1.next();
	 driver.switchTo().window(itr1.next());
	 
	String name= driver.getTitle();
	
	System.out.println(name);
	
	
	
		
		
	}

}
