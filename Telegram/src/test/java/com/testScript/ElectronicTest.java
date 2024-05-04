package com.testScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ElectronicTest {
	
	@Test(invocationCount = 5, threadPoolSize = 3, enabled = false) //(priority = 0)
	public void register() {
		 System.setProperty("webdriver.chrome.driver", "./src/main/resources/Drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		System.out.println("Register");
		driver.quit();
	}
	
	@Test(dependsOnMethods = "register")  //(priority = 1)
	public void login() {
		 System.setProperty("webdriver.chrome.driver", "./src/main/resources/Drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		System.out.println("Login");
		driver.quit();
	}
	
	@Test(dependsOnMethods = "login")  //(priority = 2)
	public void addToCart() {
		 System.setProperty("webdriver.chrome.driver", "./src/main/resources/Drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		System.out.println("Add to cart");
		driver.quit();
	}
	
	@Test(dependsOnMethods = "register")  //(priority = 3)
	public void payment() {
		 System.setProperty("webdriver.chrome.driver", "./src/main/resources/Drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		System.out.println("Payment");
		driver.quit();
	}
	@Test(dependsOnMethods = "payment")  //(priority = 4)
	public void confirmPayment() {
		 System.setProperty("webdriver.chrome.driver", "./src/main/resources/Drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		System.out.println("Confirm Payment");
		driver.quit();
	}

}
