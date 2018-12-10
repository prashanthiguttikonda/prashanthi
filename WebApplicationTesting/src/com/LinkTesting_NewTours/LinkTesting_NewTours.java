package com.LinkTesting_NewTours;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinkTesting_NewTours {

	public static void main(String[] args) 
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
		List<WebElement>links= driver.findElements(By.tagName("a"));
		int linkscount = links.size();
		System.out.println(linkscount);
		for(int i=0;i<linkscount;i++)
		{
			String linknames = links.get(i).getText();
			System.out.println(i+" "+linknames);
			links.get(i).click();
			driver.navigate().back();
			links = driver.findElements(By.tagName("a"));
			
		}
		driver.quit();
	}
}

