package com.testScript;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import objectRepository.BookPage;
import objectRepository.LoginPage;
import objectRepository.RegisterPage;
import objectRepository.WelcomePage;

public class Project {
	
	@Test
	public void register() {
		 System.setProperty("webdriver.chrome.driver", "./src/main/resources/Drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WelcomePage welcome = new WelcomePage(driver);
		RegisterPage register = new RegisterPage(driver);
		
		welcome.getRegisterLink().click();
		
		register.getFemaleGender().click();

		register.getFirstName().sendKeys("Anu");
		
		register.getLastName().sendKeys("priya");
		
		register.getEmailText().sendKeys("anu2000sam@gmail.com");
		
		register.getPasswordText().sendKeys("anupriya25");
		
		register.getConfirmPasswordText().sendKeys("anupriya25");
		
		register.getRegisterButton().click();
		
		driver.quit();
}
	
	@Test
	public void login() {
		 System.setProperty("webdriver.chrome.driver", "./src/main/resources/Drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WelcomePage welcome = new WelcomePage(driver);
		LoginPage login = new LoginPage(driver);
		
		welcome.getLoginLink().click();
		
		login.getEmail().sendKeys("anu2000sam@gmail.com");
		
		login.getPassword().sendKeys("anupriya25");
		
		login.getLogin().click();
		
		driver.quit();
		
	}
	
	@Test
	public void newsLetter() {
		 System.setProperty("webdriver.chrome.driver", "./src/main/resources/Drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WelcomePage welcome = new WelcomePage(driver);
		
		welcome.getNewsLetter().sendKeys("anu2000sam@gmail.com");
		
		welcome.getSubscribe().click();
		
		driver.quit();
		
}
	@Test
	public void votingPoll() {
		 System.setProperty("webdriver.chrome.driver", "./src/main/resources/Drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WelcomePage welcome = new WelcomePage(driver);
		
		welcome.getGood().click();
		
		welcome.getVote().click();
		
		if(welcome.getError().getText().equals("Only registered users can vote.")) {
			System.out.println("Pass");
		}

		else {
			System.out.println("Fail");
		}
	
	driver.quit();
	}
	
	@Test
	public void search() {
		 System.setProperty("webdriver.chrome.driver", "./src/main/resources/Drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WelcomePage welcome = new WelcomePage(driver);
	
		welcome.getSearchBox().sendKeys("Computing and Internet");
		
		welcome.getSearch().click();
		
		driver.quit();
		
	}	
	
	@Test
	public void youtube() {
		 System.setProperty("webdriver.chrome.driver", "./src/main/resources/Drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WelcomePage welcome = new WelcomePage(driver);
	
		JavascriptExecutor scroll = (JavascriptExecutor)driver;
		
		scroll.executeScript("arguments[0].scrollIntoView(true)", welcome.getYoutube());

		welcome.getYoutube().click();
		
		driver.quit();
		
	}	

	@Test
	public void featuredProducts() {
		 System.setProperty("webdriver.chrome.driver", "./src/main/resources/Drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WelcomePage welcome = new WelcomePage(driver);
		LoginPage login = new LoginPage(driver);
		
		welcome.getLoginLink().click();
		
		login.getEmail().sendKeys("anu2000sam@gmail.com");
		login.getPassword().sendKeys("anupriya25");
		login.getLogin().click();
		
		welcome.getAddToCart().click();
		welcome.getRecipitentName().sendKeys("sam");
		welcome.getRecipitentEmail().sendKeys("anupriya25@gmail.com");
		welcome.getAddToCartButton().click();
		
		driver.quit();
		
	}	
	
	@Test
	public void category() {
		 System.setProperty("webdriver.chrome.driver", "./src/main/resources/Drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WelcomePage welcome = new WelcomePage(driver);
		
		welcome.getBooks().click();
		welcome.getComputers().click();
		welcome.getElectronics().click();
		welcome.getApparelShoes().click();
		welcome.getDigitalDownloads().click();
		welcome.getJewelry().click();
		welcome.getGiftCards().click();
		
		driver.quit();
	}
	
	@Test
	public void subCategory() {
		 System.setProperty("webdriver.chrome.driver", "./src/main/resources/Drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WelcomePage welcome = new WelcomePage(driver);
		
		welcome.getComputers().click();
		
		welcome.getDesktops().click();
		welcome.getNotebooks().click();
		welcome.getAccessories().click();
		
		welcome.getElectronics().click();
		
		welcome.getCameraPhoto().click();
		welcome.getCellphones().click();
		
		driver.quit();
}
	
	@Test
	public void logout() {
		 System.setProperty("webdriver.chrome.driver", "./src/main/resources/Drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WelcomePage welcome = new WelcomePage(driver);
		LoginPage login = new LoginPage(driver);
		
		welcome.getLoginLink().click();
		
		login.getEmail().sendKeys("anu2000sam@gmail.com");
		
		login.getPassword().sendKeys("anupriya25");
		
		login.getLogin().click();
		
		welcome.getLogout().click();
		
		driver.quit();
		
		
}
	
	@Test
	public void sortBY() {
		 System.setProperty("webdriver.chrome.driver", "./src/main/resources/Drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		BookPage book = new BookPage(driver);
		
		book.getBooks().click();
		
		book.getSortBy().click();
		book.getzTOa().click();
		
		book.getDisplay().click();
		book.getDisplaySize().click();
		
		book.getViewAs().click();
		book.getList().click();
		
		driver.quit();
		
	}
	@Test
	public void addToCart() {
		 System.setProperty("webdriver.chrome.driver", "./src/main/resources/Drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WelcomePage welcome = new WelcomePage(driver);
		LoginPage login = new LoginPage(driver);
		
		welcome.getLoginLink().click();
		BookPage book = new BookPage(driver);

		login.getEmail().sendKeys("anu2000sam@gmail.com");
		login.getPassword().sendKeys("anupriya25");
		login.getLogin().click();
		
		book.getBooks().click();
		book.getAddTOcart().click();
		book.getCart().click();
		
		driver.quit();	
		
	}
	
	@Test
	public void addReview() {
		 System.setProperty("webdriver.chrome.driver", "./src/main/resources/Drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WelcomePage welcome = new WelcomePage(driver);
		LoginPage login = new LoginPage(driver);
		BookPage book = new BookPage(driver);

		welcome.getLoginLink().click();

		login.getEmail().sendKeys("anu2000sam@gmail.com");
		login.getPassword().sendKeys("anupriya25");
		login.getLogin().click();
		
		book.getBooks().click();
		book.getBookImg().click();
		book.getAddReview().click();
		book.getReviewTitle().sendKeys("Good book");
		book.getReviewText().sendKeys("Very informative and easy understandable book.");
		book.getRating().click();
		book.getSubmit().click();
		
		driver.quit();		
}
	
	@Test
	public void order() {
		 System.setProperty("webdriver.chrome.driver", "./src/main/resources/Drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WelcomePage welcome = new WelcomePage(driver);
		LoginPage login = new LoginPage(driver);
		
		welcome.getLoginLink().click();
		BookPage book = new BookPage(driver);

		login.getEmail().sendKeys("anu2000sam@gmail.com");
		login.getPassword().sendKeys("anupriya25");
		login.getLogin().click();
		
		book.getBooks().click();
		book.getAddTOcart().click();
		book.getCart().click();
		book.getTerms().click();
		book.getCheckOut().click();
		book.getContinue1().click();
		book.getContinue2().click();
		book.getContinue3().click();
		book.getContinue4().click();
		book.getContinue5().click();
		book.getConfirm().click();
		book.getContinue6().click();
		
		driver.quit();	
		
	}
	
	@Test
	public void priceFilter() {
		 System.setProperty("webdriver.chrome.driver", "./src/main/resources/Drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		BookPage book = new BookPage(driver);

		book.getBooks().click();
		book.getUnder().click();
		book.getRemoveFilter().click();
		book.getBetween().click();
		book.getRemoveFilter().click();
		book.getOver().click();
		
		driver.quit();
		
	}
	@Test
	public void quantity() {
		 System.setProperty("webdriver.chrome.driver", "./src/main/resources/Drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		BookPage book = new BookPage(driver);

		book.getBooks().click();
		book.getBookImg().click();
		book.getQuantity().clear();
		book.getQuantity().sendKeys("5");
		book.getQuantity().clear();
		book.getQuantity().sendKeys("2");
		book.getQuantity().clear();
		book.getQuantity().sendKeys("4");
		book.getQuantity().clear();
		book.getQuantity().sendKeys("8");
		
		driver.quit();
	}
	
	@Test
	public void emailToFriend() {
		 System.setProperty("webdriver.chrome.driver", "./src/main/resources/Drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		BookPage book = new BookPage(driver);

		book.getBooks().click();
		book.getBookImg().click();
		book.getEmailAfriend().click();
		book.getFriendMail().sendKeys("anupriya25@gmail.com");
		book.getYourMail().sendKeys("anu2000sam@gmail.com");
		book.getSendMail().click();
		
		driver.quit();

}
	@Test
	public void compareProducts() {
		 System.setProperty("webdriver.chrome.driver", "./src/main/resources/Drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		BookPage book = new BookPage(driver);

		book.getBooks().click();
		book.getBook1().click();
		book.getCompare1().click();
		book.getBooks().click();
		book.getBook2().click();
		book.getCompare1().click();
		book.getBooks().click();
		book.getBook3().click();
		book.getCompare1().click();
		
		driver.quit();
	}
	
	@Test
	public void removeCompareProducts() {
		 System.setProperty("webdriver.chrome.driver", "./src/main/resources/Drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		BookPage book = new BookPage(driver);

		book.getBooks().click();
		book.getBook1().click();
		book.getCompare1().click();
		book.getBooks().click();
		book.getBook2().click();
		book.getCompare1().click();
		book.getBooks().click();
		book.getBook3().click();
		book.getCompare1().click();
		
		book.getRemoveCompare().click();
		book.getClearCompare().click();
		
		driver.quit();
	}	
	
	@Test
	public void Tricentis() {
		 System.setProperty("webdriver.chrome.driver", "./src/main/resources/Drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		BookPage book = new BookPage(driver);

		book.getBooks().click();
		book.getTri().click();
		
		driver.quit();
}
	}