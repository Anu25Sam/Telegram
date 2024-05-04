package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {

	public RegisterPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(id = "gender-male")
	private WebElement maleGender;
	
	@FindBy(id = "gender-female")
	private WebElement femaleGender;
	
	@FindBy(id = "FirstName")
	private WebElement firstName;
	
	@FindBy(id = "LastName")
	private WebElement lastName;
	
	@FindBy(id = "Email")
	private WebElement emailText;
	
	@FindBy(id = "Password")
	private WebElement passwordText;
	
	@FindBy(id = "ConfirmPassword")
	private WebElement confirmPasswordText;
	
	@FindBy(id = "register-button")
	private WebElement registerButton;

	public WebElement getMaleGender() {
		return maleGender;
	}

	public WebElement getFemaleGender() {
		return femaleGender;
	}

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getEmailText() {
		return emailText;
	}

	public WebElement getPasswordText() {
		return passwordText;
	}

	public WebElement getConfirmPasswordText() {
		return confirmPasswordText;
	}

	public WebElement getRegisterButton() {
		return registerButton;
	}
	
}
