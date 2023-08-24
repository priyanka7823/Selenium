package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Iframe {

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://jqueryui.com/droppable/");
		
		
		Actions act= new Actions(driver);
		//driver.switchTo().frame(0);
		
		driver.switchTo().frame(driver.findElement(By.cssSelector(".demo-frame")));
		
	WebElement drag=	driver.findElement(By.xpath("//*[@id='draggable']"));
	WebElement drop=	driver.findElement(By.xpath("//*[@id='droppable']"));
	
	act.dragAndDrop(drag, drop).build().perform();
	
	}

}
