package testNgDemo;

import org.testng.annotations.Test;

public class Demo1 
{
	@Test(enabled=false)
public void testCase1()
{
	System.out.println("TC1 will execute");
}
	@Test
public void testCase2()
{
	System.out.println("TC2 will execute");
}
	@Test
public void testCase3()
{
	System.out.println("TC3 will execute");
}
	@Test(dependsOnMethods= {"testCase3"})
public void method()
{
	System.out.println("method will execute");
}
}
