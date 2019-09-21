package org.test.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage extends Base{
public SearchPage() {
PageFactory.initElements(driver, this);
}
@FindBy(id="location")
private WebElement loc;
@FindBy(id="room_nos")
private WebElement rn;
public WebElement getLoc() {
	return loc;
}
public WebElement getRn() {
	return rn;
}
public WebElement getDin() {
	return din;
}
public WebElement getDout() {
	return dout;
}
public WebElement getAr() {
	return ar;
}
@FindBy(id="datepick_in")
private WebElement din;
@FindBy(id="datepick_out")
private WebElement dout;
@FindBy(id="adult_room")
private WebElement ar;
@FindBy(id="Submit")
private WebElement sub;
public WebElement getSub() {
	return sub;
}



}
