package com.Grid;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Newtours_LoginTest 
{
@Parameters("Browser")
@Test
public void login(String browser)
{
	System.out.println("the current browser is:"+ browser);
	
	DesiredCapabilities cap = null;
	if(browser.equalsIgnoreCase("firefox"))
	{
		cap=DesiredCapabilities.firefox();
		cap.setBrowserName("firefox");
		cap.setPlatform(Platform.WINDOWS);
	}
	else 
		if(browser.equalsIgnoreCase("chrome"))
		{
			cap=DesiredCapabilities.chrome();
			cap.setBrowserName("chrome");
			cap.setPlatform(Platform.WINDOWS);
			}
	RemoteWebDriver driver = new RemoteWebDriver(new URL("http://192.168.0.82:4444/wd/hub"),cap);
	driver.get("http://newtours.demoaut.com");
	driver.manage().window().maximize();
	
	
	//<input type="text" name="userName" size="10">
	//<input type="password" name="password" size="10">
	//<input type="image" name="login" value="Login" src="/images/btn_signin.gif?osCsid=76a90622efdf54ff1c407ab812e222fa" width="58" height="17" alt="Sign-In" border="0">
	
	driver.findElementByName("userName").sendKeys("tutorial");
	driver.findElementByName("password").sendKeys("tutorial");
	driver.findElementByName("login").click();
	

}
}