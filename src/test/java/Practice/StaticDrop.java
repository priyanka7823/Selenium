package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class StaticDrop {

	public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver= new ChromeDriver();
	driver.get("https://demoqa.com/select-menu");
	
	driver.findElement(By.xpath("(//*[@class=' css-1wa3eu0-placeholder'])[1]")).click();
	
	List<WebElement> options= driver.findElements(By.xpath("//*[@class=' css-yk16xz-control']//div[@class=' css-1uccc91-singleValue']"));

	System.out.println(options.size());
	
	/*for(WebElement list:options)
	{
	String name=	list.getText();
	
	System.out.println(name);
	}
		*/	
	
	for(int i=0; i<options.size(); i++)
	{
		System.out.println(options.get(i).getText());
		
		
	}

	}

}
