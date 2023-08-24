package Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class StaticTable {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		//find total rows of table
		
	int rows=	driver.findElements(By.xpath("//*[@name='BookTable']//tr")).size();
	
	System.out.println(rows);
	
//	driver.findElements(By.tagName("tr")).size();     it gives sometimes wrong webelement
	
	

	//find total coloumn of table
	int coloumn=	driver.findElements(By.xpath("//*[@name='BookTable']//th")).size();
	
	System.out.println(coloumn);
	
	// data of table
int data=driver.findElements(By.xpath("//*[@name='BookTable']//td")).size();
	
	System.out.println(data);
	// Read specific row and coloumn data
String value=	driver.findElement(By.xpath("//*[@name='BookTable']//tr[5]//td[1]")).getText();
System.out.println(value);


//Read data from all row and coloumn data

/*for(int r=2;r<=rows;r++)
{
	for(int c=1;c<=coloumn;c++)
	{
		String value1=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td["+c+"]")).getText();
		System.out.print(value1+"\t"); 
	}
	System.out.println();
}
*/

// print book names whose author is Mukesh
for(int r=2;r<=rows;r++)
{
	String author=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]/td[2]")).getText();
	
	if(author.equals("Mukesh"))
	{
		String bookname=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]/td[1]")).getText();
		System.out.println(author+"    "+bookname);
	}
}


	}
}

