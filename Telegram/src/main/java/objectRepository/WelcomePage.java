package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage {
	
	public WelcomePage (WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText = "Log in")
	private WebElement loginLink;
	
	public WebElement getLoginLink() {
		return loginLink;
	}

	@FindBy(linkText = "Register")
	private WebElement registerLink;
	
	public WebElement getRegisterLink() {
		return registerLink;
	}

	@FindBy(linkText = "BOOKS")
	private WebElement booksLink;

	public WebElement getBooksLink() {
		return booksLink;
	}
	
	
	@FindBy(id = "newsletter-email")
	private WebElement newsLetter;

	@FindBy(id = "newsletter-subscribe-button")
	private WebElement subscribe;

	public WebElement getNewsLetter() {
		return newsLetter;
	}

	public WebElement getSubscribe() {
		return subscribe;
	}

	@FindBy(linkText  = "Only registered users can vote.")
	private WebElement error;
	
	public WebElement getError() {
		return error;
	}

	@FindBy(id = "pollanswers-2")
	private WebElement good;

	@FindBy(id = "vote-poll-1")
	private WebElement vote;

	public WebElement getGood() {
		return good;
	}

	public WebElement getVote() {
		return vote;
	}
	
	@FindBy (id = "small-searchterms")
	private WebElement searchBox;
	
	@FindBy (xpath = "//input[@value='Search']")
	private WebElement search;

	public WebElement getSearchBox() {
		return searchBox;
	}

	public WebElement getSearch() {
		return search;
	}

	@FindBy (linkText = "//a[.='YouTube']")
	private WebElement youtube;

	public WebElement getYoutube() {
		return youtube;
	}

	@FindBy (xpath = "(//input[@value='Add to cart'])[1]")
	private WebElement addToCart;
	
	@FindBy (id = "giftcard_2_RecipientName")
	private WebElement recipitentName;
	
	@FindBy (id = "giftcard_2_RecipientEmail")
	private WebElement recipitentEmail;

	public WebElement getAddToCart() {
		return addToCart;
	}

	public WebElement getRecipitentName() {
		return recipitentName;
	}

	public WebElement getRecipitentEmail() {
		return recipitentEmail;
	}
	
	@FindBy (id = "add-to-cart-button-2")
	private WebElement addToCartButton;

	public WebElement getAddToCartButton() {
		return addToCartButton;
	}
	
	@FindBy(linkText = "Books")
	private WebElement books;
	
	@FindBy(linkText = "Computers")
	private WebElement computers;
	
	@FindBy(linkText = "Electronics")
	private WebElement electronics;
	
	@FindBy(linkText = "Apparel & Shoes")
	private WebElement apparelShoes;
	
	@FindBy(linkText = "Digital downloads")
	private WebElement digitalDownloads;
	
	@FindBy(linkText = "Jewelry")
	private WebElement Jewelry;
	
	@FindBy(linkText = "Gift Cards")
	private WebElement giftCards;

	public WebElement getBooks() {
		return books;
	}

	public WebElement getComputers() {
		return computers;
	}

	public WebElement getElectronics() {
		return electronics;
	}

	public WebElement getApparelShoes() {
		return apparelShoes;
	}

	public WebElement getDigitalDownloads() {
		return digitalDownloads;
	}

	public WebElement getJewelry() {
		return Jewelry;
	}

	public WebElement getGiftCards() {
		return giftCards;
	}
	
	@FindBy(linkText = "Desktops")
	private WebElement desktops;
	
	@FindBy(linkText = "Notebooks")
	private WebElement notebooks;
	
	@FindBy(linkText = "Accessories")
	private WebElement accessories;
	
	@FindBy(linkText = "Camera, photo")
	private WebElement cameraPhoto;
	
	@FindBy(linkText = "Cell phones")
	private WebElement cellphones;

	public WebElement getDesktops() {
		return desktops;
	}

	public WebElement getNotebooks() {
		return notebooks;
	}

	public WebElement getAccessories() {
		return accessories;
	}

	public WebElement getCameraPhoto() {
		return cameraPhoto;
	}

	public WebElement getCellphones() {
		return cellphones;
	}
	
	@FindBy(xpath = "//a[@class='ico-logout']")
	private WebElement logout;

	public WebElement getLogout() {
		return logout;
	}
	
}

