package org.test.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookPage extends Base{
	public BookPage() {

		PageFactory.initElements(driver, this);
	}
	@FindBy(id="first_name")
	private WebElement fName;
	@FindBy(id="last_name")
	private WebElement lName;
	@FindBy(id="address")
	private WebElement address;
	@FindBy(id="cc_num")
	private WebElement cardNum;
	@FindBy(id="cc_type")
	private WebElement cardType;
	@FindBy(id="cc_exp_month")
	private WebElement cardExpDate;
	@FindBy(id="cc_exp_year")
	private WebElement cardExpYear;
	@FindBy(id="cc_cvv")
	private WebElement cardCvvNum;
	@FindBy(id="book_now")
	private WebElement book;
	public WebElement getfName() {
		return fName;
	}
	public WebElement getlName() {
		return lName;
	}
	public WebElement getAddress() {
		return address;
	}
	public WebElement getCardNum() {
		return cardNum;
	}
	public WebElement getCardType() {
		return cardType;
	}
	public WebElement getCardExpDate() {
		return cardExpDate;
	}
	public WebElement getCardExpYear() {
		return cardExpYear;
	}
	public WebElement getCardCvvNum() {
		return cardCvvNum;
	}
	public WebElement getBook() {
		return book;
	}
	
	

}
