package org.test.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectPage extends Base{
public SelectPage() {
PageFactory.initElements(driver, this);
}
@FindBy(id="radiobutton_1")
private WebElement radio1;
@FindBy(id="continue")
private WebElement contBtn;
public WebElement getRadio1() {
	return radio1;
}
public WebElement getContBtn() {
	return contBtn;
}
}

