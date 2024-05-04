package com.testScript;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import objectRepository.BookPage;
import objectRepository.LoginPage;
import objectRepository.WelcomePage;

public class Assert {
	@Test
	public void books() {
		
		 System.setProperty("webdriver.chrome.driver", "./src/main/resources/Drivers/chromedriver.exe");

			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://demowebshop.tricentis.com/");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			WelcomePage welcome = new WelcomePage(driver);
			BookPage book = new BookPage(driver);
			
			welcome.getBooksLink().click();
			String actualResult = book.getBookTitle().getText();
			
			//HardAssert
			//Assert.assertEquals(actualResult, "Computers");
			
			//SoftAssert
			SoftAssert soft = new SoftAssert();
			soft.assertEquals(actualResult, "Computers");
			driver.quit();
		
	}

	
}
