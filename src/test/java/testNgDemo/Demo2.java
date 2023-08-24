package testNgDemo;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Demo2 
{
	
	@AfterMethod
public void data1()
{
	System.out.println("First but last");
	
	}

	@Test(groups= {"smoke"})
public void data2()
{
	
	System.out.println("smoke test");
	}

@BeforeMethod
public void data3()
{
	System.out.println(" last but first");
	
	}
}
