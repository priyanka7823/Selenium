package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectDropdown {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://demos.jquerymobile.com/1.4.5/selectmenu/#ui-page-top");
		
	WebElement a=	driver.findElement(By.xpath("//*[@id='select-native-1']"));
	Thread.sleep(6000);
	Select sel= new Select(a);
	a.click();
	sel.selectByIndex(1);
	
	List<WebElement> options = sel.getOptions();
	System.out.println(options.size());
	
	
	for(int i=0; i<options.size(); i++)
	{
		String s=options.get(i).getText();
		System.out.println(s);
		
	}

	}

}
