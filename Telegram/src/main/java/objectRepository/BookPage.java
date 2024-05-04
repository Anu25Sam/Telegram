package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookPage {
	
public BookPage (WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//div[@class='page-title']/h1")
	private WebElement bookTitle;

	public WebElement getBookTitle() {
		return bookTitle;
	}
	
	@FindBy(linkText = "Books")
	private WebElement books;
	
	public WebElement getBooks() {
		return books;
	}

	@FindBy(id = "products-orderby")
	private WebElement sortBy;
	
	@FindBy(xpath = "//option[.='Name: Z to A']")
	private WebElement zTOa;
	
	@FindBy(id = "products-pagesize")
	private WebElement display;
	
	@FindBy(xpath = "//option[.='12']")
	private WebElement displaySize;
	
	@FindBy(id = "products-viewmode")
	private WebElement viewAs;
	
	@FindBy(xpath = "//option[.='List']")
	private WebElement list;

	public WebElement getSortBy() {
		return sortBy;
	}

	public WebElement getzTOa() {
		return zTOa;
	}

	public WebElement getDisplay() {
		return display;
	}

	public WebElement getDisplaySize() {
		return displaySize;
	}

	public WebElement getViewAs() {
		return viewAs;
	}

	public WebElement getList() {
		return list;
	}
	
	@FindBy(xpath ="(//input[@value='Add to cart'])[1]")
	private WebElement addTOcart;
	
	@FindBy (linkText = "Shopping cart")
	private WebElement cart;
	
	@FindBy(id = "termsofservice")
	private WebElement terms;
	
	@FindBy(id = "checkout")
	private WebElement checkOut;
	
	@FindBy(xpath = "//input[@onclick='Billing.save()']")
	private WebElement continue1;
	
	@FindBy(xpath = "//input[@onclick='Shipping.save()']")
	private WebElement continue2;
	
	@FindBy(xpath = "//input[@onclick='ShippingMethod.save()']")
	private WebElement continue3;
	
	@FindBy(xpath = "//input[@onclick='PaymentMethod.save()']")
	private WebElement continue4;
	
	@FindBy(xpath = "//input[@onclick='PaymentInfo.save()']")
	private WebElement continue5;
	
	@FindBy(xpath = "//input[@onclick='ConfirmOrder.save()']")
	private WebElement confirm;
	
	@FindBy(xpath = "//input[@type='button']")
	private WebElement continue6;

	public WebElement getAddTOcart() {
		return addTOcart;
	}

	public WebElement getCart() {
		return cart;
	}

	public WebElement getTerms() {
		return terms;
	}

	public WebElement getCheckOut() {
		return checkOut;
	}

	public WebElement getContinue1() {
		return continue1;
	}

	public WebElement getContinue2() {
		return continue2;
	}

	public WebElement getContinue3() {
		return continue3;
	}

	public WebElement getContinue4() {
		return continue4;
	}

	public WebElement getContinue5() {
		return continue5;
	}

	public WebElement getConfirm() {
		return confirm;
	}

	public WebElement getContinue6() {
		return continue6;
	}
	
	@FindBy(xpath = "//div[@data-productid='13']")
	private WebElement book1;
	
	@FindBy(linkText = "Add your review")
	private WebElement addReview;
	
	@FindBy(id = "AddProductReview_Title")
	private WebElement reviewTitle;
	
	@FindBy(id = "AddProductReview_ReviewText")
	private WebElement reviewText;
	
	@FindBy(id = "addproductrating_4")
	private WebElement rating;
	
	@FindBy(xpath = "//input[@value='Submit review']")
	private WebElement submit;

	public WebElement getBookImg() {
		return book1;
	}

	public WebElement getAddReview() {
		return addReview;
	}

	public WebElement getReviewTitle() {
		return reviewTitle;
	}

	public WebElement getReviewText() {
		return reviewText;
	}

	public WebElement getRating() {
		return rating;
	}

	public WebElement getSubmit() {
		return submit;
	}

	@FindBy (xpath = "(//span[@class='PriceRange'])[1]")
	private WebElement under;
	
	@FindBy (xpath = "//a[@class='remove-price-range-filter']")
	private WebElement removeFilter;

	@FindBy (xpath = "(//span[@class='PriceRange'])[3]")
	private WebElement between;
	
	public WebElement getUnder() {
		return under;
	}

	public WebElement getRemoveFilter() {
		return removeFilter;
	}

	public WebElement getBetween() {
		return between;
	}

	public WebElement getOver() {
		return over;
	}

	@FindBy (xpath = "(//span[@class='PriceRange'])[4]")
	private WebElement over;
	
	@FindBy(id = "addtocart_13_EnteredQuantity")
	private WebElement qty;
	
	public WebElement getQty() {
		return qty;
	}

	public WebElement getEmailAfriend() {
		return emailAfriend;
	}

	public WebElement getFriendMail() {
		return friendMail;
	}

	public WebElement getYourMail() {
		return yourMail;
	}

	public WebElement getSendMail() {
		return sendMail;
	}

	public WebElement getQuantity() {
		return quantity;
	}

	@FindBy(xpath = "//input[@value='Email a friend']")
	private WebElement emailAfriend;
	
	@FindBy(id = "FriendEmail")
	private WebElement friendMail;
	
	@FindBy(id = "YourEmailAddress")
	private WebElement yourMail;
	
	@FindBy(xpath = "//input[@value='Send email']")
	private WebElement sendMail;
	
	@FindBy(id = "addtocart_13_EnteredQuantity")
	private WebElement quantity;
	
	@FindBy(xpath = "//input[@class='button-2 add-to-compare-list-button']")
	private WebElement compare1;
	
	public WebElement getBook1() {
		return book1;
	}

	public WebElement getCompare1() {
		return compare1;
	}

	public WebElement getBook2() {
		return book2;
	}

	public WebElement getBook3() {
		return book3;
	}

	@FindBy(xpath ="//div[@data-productid='45']")
	private WebElement book2;
	
	@FindBy(xpath ="//div[@data-productid='78']")
	private WebElement book3;
	
	@FindBy(xpath = "//input[@value='Remove']")
	private WebElement removeCompare;
	
	@FindBy(linkText = "Clear list")
	private WebElement clearCompare;
	
	@FindBy(linkText = "Tricentis")
	private WebElement tri;

	public WebElement getRemoveCompare() {
		return removeCompare;
	}

	public WebElement getClearCompare() {
		return clearCompare;
	}

	public WebElement getTri() {
		return tri;
	}
	

	

}
