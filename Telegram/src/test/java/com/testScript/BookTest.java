package com.testScript;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import objectRepository.BookPage;
import objectRepository.WelcomePage;

public class BookTest {
	
	@Test
	public void books_001() {
		 System.setProperty("webdriver.chrome.driver", "./src/main/resources/Drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WelcomePage welcome = new WelcomePage(driver);
		BookPage book = new BookPage(driver);
		
		welcome.getBooksLink().click();

		if(book.getBookTitle().getText().equals("Books")) {
			System.out.println("Test case Pass");
		}
		
		else {
			System.out.println("Test case Fail");
		}
		
		driver.quit();
	}


}
