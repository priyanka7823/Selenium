package Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseOver {

	public static void main(String[] args) throws InterruptedException
	{
		
		ChromeOptions op=new ChromeOptions();
		op.setBrowserVersion("116");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.flipkart.com/");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);      
		driver.findElement(By.xpath("//*[@class='_2KpZ6l _2doB4z']")).click();

		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);      
		driver.findElement(By.xpath("//*[@class='Pke_EE']")).sendKeys("oppo f9 pro");
		
		
	}

}
