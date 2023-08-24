package testNgDemo;

import org.testng.annotations.Test;

public class Second 
{
	@Test(priority=1)
public void open()
{
System.out.println("App open successfully");	
}
@Test(priority=2)
public void login()
{
	System.out.println("Login Successfully");
	}
@Test(priority=3)
public void close()
{
	System.out.println("closed");
	}
}
