package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectDropdown2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://demos.jquerymobile.com/1.4.5/selectmenu/#ui-page-top");
		
//1
		WebElement a=	driver.findElement(By.xpath("//*[@id='select-native-1']"));
	
	//2
		Select sel= new Select(a);
	a.click();
	Thread.sleep(6000);
//3
	sel.selectByIndex(1);
	//4
	List<WebElement> options = sel.getOptions();
int number=	options.size();
System.out.println(number);

//5
for(int i=0; i<number;i++)
{      
	String list=options.get(i).getText();
	System.out.println(list);	
	

String name=options.get(i).getTagName();
System.out.println(name);
	}
	}
	}


