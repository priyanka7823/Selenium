package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class OrangeHRM2 {

	public static void main(String[] args) throws InterruptedException 
	{
	WebDriverManager.chromedriver().setup();
 WebDriver driver= new ChromeDriver();
  
 driver.navigate().to("http://total-qa.com/checkbox-example/");
 
 
 List<WebElement> a=driver.findElements(By.xpath("//*[@type='checkbox']"));
 
 System.out.println("Total checkbox"+ a.size());
 
 System.out.println(a);
 // click on all checkbox
 
 /*for(int i=0; i<a.size() ;i++)
 {
	 Thread.sleep(6000);
	 a.get(i).click();
 }
 for(int i=0; i<a.size() ;i++)
 {
	 Thread.sleep(6000);
	 a.get(i).click();
 }
// enhance
/* for(WebElement c:a)
 {
	c.click(); 
 } */
 // if you want select last 2 checkbox    then total checkbox- checkbox want to be clicked= remain
                                               //   7-2=2then index start from remain number of checkbox
 
 /*for (int i=2 ; i<a.size(); i++)
 {
	 a.get(i).click();
 }*/  
 
 // suppose first two select
 
/* for (int i=0; i<2 ;i++)
 {
	 a.get(i).click();
 } */
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
	}
}
