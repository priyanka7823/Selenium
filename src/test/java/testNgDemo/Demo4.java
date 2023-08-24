package testNgDemo;

import org.testng.annotations.Test;


import com.beust.jcommander.Parameters;

public class Demo4 
{

 @Test
public void openApp(String urlname)
	{
		String link=urlname;
		System.out.println(link);
	}
}
