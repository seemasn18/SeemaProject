package com.Seema;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Sample {
	
    @Test
	public void t_01_validate_login_zero_app() {
    	
		System.setProperty("Webdriver.chrome.driver", "C:\\SeleniumDrivers\\chromedriver_win32(1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://zero.webappsecurity.com/login.html");
		
		//Find user Name and set username 
		WebElement txtbx_username = driver.findElement(By.name("user_login"));
		
		txtbx_username.sendKeys("usename");
		
		//password is set
		driver.findElement(By.name("user_password")).sendKeys("password");
		
		driver.findElement(By.name("submit")).click();
		
		//another way of doing
		//driver.findElement(By.xpath("//input[@value='Sign in' and @type='submit']")).click();
		
		String expected_title = "Zero - Personal Banking - Loans - Credit Cards";
		String actual_title = driver.getTitle();
		
		Assert.assertEquals(expected_title, actual_title);
			
		
	}

}
