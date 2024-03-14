package com.Seema;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class demo_fblogin {

	public static void main(String[] args) {
		
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        options.addArguments("disable-infobars");
        WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.facebook.com/");
		//maximize the window
		driver.manage().window().maximize();
		
		driver.findElement(By.id("email")).sendKeys("9125201018");
		driver.findElement(By.name("pass")).sendKeys("123456");
		driver.findElement(By.className("login")).click();
		
		}

  } 
