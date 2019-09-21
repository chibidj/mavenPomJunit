package org.test.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends Base{
	 public LoginPage() {
	PageFactory.initElements(driver, this);	
	}
	@FindBy(id="username")
	private WebElement user;
	@FindBy(id="password")
	private WebElement pass;
	public WebElement getUser() {
		return user;
	}
	public WebElement getPass() {
		return pass;
	}
	public WebElement getBtnLogin() {
		return btnLogin;
	}
	@FindBy(id="login")
	private WebElement btnLogin;
}
