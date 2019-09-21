package org.test.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Sample extends Base{

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver = getDriver();
		loadUrl("http://www.adactin.com/HotelApp");
		
		LoginPage page1 = new LoginPage();
		
		type(page1.getUser(), "chibidjadactin");
		type(page1.getPass(), "Myadactin@123");
		btnClick(page1.getBtnLogin());
		
		SearchPage page2 = new SearchPage();
		selectByValue(page2.getLoc(), "Melbourne");
		selectByValue(page2.getRn(), "4");
		type(page2.getDin(), "28/09/2019");
		type(page2.getDout(), "29/09/2019");
		selectByValue(page2.getAr(), "1");
		btnClick(page2.getSub());
		
		SelectPage page3 = new SelectPage();
		btnClick(page3.getRadio1());
		btnClick(page3.getContBtn());
		
		BookPage page4 = new BookPage();
		type(page4.getfName(), "Chibi");
		type(page4.getlName(), "DJ");
		type(page4.getAddress(), "Chennai");
		type(page4.getCardNum(), "1230654789789456");
		selectByValue(page4.getCardType(), "VISA");
		selectByValue(page4.getCardExpDate(), "3");
		selectByValue(page4.getCardExpYear(), "2021");		
		type(page4.getCardCvvNum(), "364");
		btnClick(page4.getBook());
		
		Thread.sleep(10000);
		
		BookingConfirmation page5 = new BookingConfirmation();
		String text = getText(page5.getOrderNum(),"value");
		System.out.println("Booking order is " +text);
		
		//driver.quit();
		
		
		
	}

}
