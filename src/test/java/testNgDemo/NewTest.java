package testNgDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.webdriver.WebDriverCreator;

public class NewTest 
{  public WebDriver driver=null;
  @Test(priority=1)
  public void openApp() 
  {
	  WebDriverManager.chromedriver().setup();
	  
	 driver= new ChromeDriver();
	  driver.get("http://primusbank.qedgetech.com/");
  }
  @Test(priority=2)
  public void login() 
  {

driver.findElement(By.cssSelector("input#txtuId")).sendKeys("Admin");
driver.findElement(By.cssSelector("input.style7[id='txtPword']")).sendKeys("Admin");

//driver.findElement(By.cssSelector("*#login")).click();

driver.findElement(By.xpath("//*[@id='login']")).click();


  }
  @Test(priority=3)
private void close() 
  { 
}
}