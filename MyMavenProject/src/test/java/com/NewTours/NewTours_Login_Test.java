package com.NewTours;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTours_Login_Test 
{
FirefoxDriver driver;
@BeforeTest
public void SetUp()
{
	driver = new FirefoxDriver();
	driver.get("http://newtours.demoaut.com");
}
@Test
public void LogIn()
{
	driver.findElementByName("userName").sendKeys("tutorial");
	driver.findElementByName("password").sendKeys("tutorial");
	driver.findElementByName("login").click();
}
@AfterTest
public void teardown()
{
	driver.quit();
}
}
