package com.NewToursLoginTest;

import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LogInTest 
{
	FirefoxDriver driver;
	
	@Given("^open the browser and navigate to newTours application$")
	public void open_the_browser_and_navigate_to_newTours_application() 
	{
	    driver = new FirefoxDriver();
	   driver.get("http://newtours.demoaut.com");
	}

	@When("^user enters vaild username and password and click on the signin button$")
	public void user_enters_vaild_username_and_password_and_click_on_the_signin_button() 
	{
		driver.findElementByName("userName").sendKeys("tutorial");
		driver.findElementByName("password").sendKeys("tutorial");
		driver.findElementByName("login").click(); 
	}

	@Then("^user should sucessfully login and close the application$")
	public void user_should_sucessfully_login_and_close_the_application() 
	{
	  
		String expected_title = "Find a Flight: Mercury Tours:";
		System.out.println(expected_title);
		
		String actual_title = driver.getTitle();
		System.out.println(actual_title);
		
		if(actual_title.equals(expected_title))
		{
			System.out.println("Title Matched---Pass");
		}
		else
		{
			System.out.println("Title Not Matched---Fail");
		}
	}


}
