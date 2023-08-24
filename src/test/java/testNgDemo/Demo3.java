package testNgDemo;

import org.testng.annotations.Test;

public class Demo3 
{
@Test(dependsOnMethods= {"ff"})
public void zz()
{
	System.out.println("logout");
	}
@Test
public void hh()
{
	System.out.println("username passs");
	}


@Test(dependsOnMethods= {"hh"})
public void ff()
{
	System.out.println("login");
	}
}
