package com.weightwachers.base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
	
	public static WebDriver driver;
	public static void initialization() {
		System.setProperty("webdriver.chrome.driver", "..\\General_Scripting\\drivers\\chromedriver.exe");	
		driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.get("http://projects.annanovas.com/que2/food_serving.html");
	}

}
