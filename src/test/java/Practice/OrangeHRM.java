package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class OrangeHRM {

	public static void main(String[] args) throws InterruptedException 
	{
	WebDriverManager.chromedriver().setup();
WebDriver driver= new ChromeDriver();

driver.get("http://primusbank.qedgetech.com/");

driver.findElement(By.cssSelector("input#txtuId")).sendKeys("admin");
driver.findElement(By.cssSelector("input.style7[id='txtPword']")).sendKeys("Admin");
//driver.close();

String get=driver.getCurrentUrl();
System.out.println(get);

String actual="http://primusbank.qedgetech.com/";

if(get.equalsIgnoreCase(actual))
{
	System.out.println("pass"); 
	}


 String title=driver.getTitle();
 System.out.println(title+" Title of page");
 
 System.out.println( "  ID OF "+driver.getWindowHandle()); 
 
boolean a=driver.findElement(By.xpath("//*[@src='images/TopFrame_01.jpg']")).isDisplayed();
System.out.println(a); 
 
	}

}
