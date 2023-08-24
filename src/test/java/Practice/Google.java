package Practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Google {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.id("APjFqb")).sendKeys("selenium");

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		List<WebElement> list = driver
				.findElements(By.xpath("(//*[text()='selenium']/ancestor::*)[10]"));
		System.out.println(list.size());

		for (int i = 0; i < list.size(); i++) 
		{
			System.out.println(list.get(i).getText());
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
			if(list.get(i).getText().contains("selenium download"))
			{
				list.get(i).click();
				
			}
		}}}