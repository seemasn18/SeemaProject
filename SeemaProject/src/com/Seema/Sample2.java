package com.Seema;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Sample2 {

	public static void main(String[] args) {
	
	        //WebDriverManager.chromedriver().setup();
	        ChromeOptions options = new ChromeOptions();
	        options.addArguments("start-maximized");
	        options.addArguments("disable-infobars");
	        WebDriver driver = new ChromeDriver(options);
	        driver.get("http://www.google.com");
	    }

	}


