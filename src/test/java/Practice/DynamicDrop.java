package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DynamicDrop {

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.jquery-az.com/");
		
		driver.manage().window().maximize();
		
		Actions act= new Actions (driver);
		
	WebElement a=	driver.findElement(By.xpath("//*[@id='menu-item-7090']"));
	
	act.moveToElement(a).build().perform();
	
	//
	
	List<WebElement >list=driver.findElements(By.xpath("//li[@class='menu-item menu-item-type-custom menu-item-object-custom ']//a"));
	int number=	list.size();
				System.out.println(number);
				
			/*	for(int i=0; i<number; i++)
				    {
					String name=list.get(i).getText();
					System.out.println(name);
					
					if(list.get(i).getText().equalsIgnoreCase("Java"))
					{
						System.out.println("in if block");
					list.get(i).click();
					break;
					}
				}*/
				
				for(WebElement option:list)
				{
				String name=	option.getText();
				
				if(name.equalsIgnoreCase("java"))
				{
					option.click();
					break;
				}
				}
		
	}

}
