package org.test.pom;



import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExecuteAll extends Base{
	

	@BeforeClass
	public static void beforelass() {
		getDriver();
		loadUrl("http://www.adactin.com/HotelApp/");
		
	}

	@Before
	public void beforeMethod() {
		Date date = new Date();
		System.out.println(date);
	}

	@Test
	public void test1() throws InterruptedException {
		Assert.assertTrue("Verifying URL",
				driver.getCurrentUrl().contains("adactin"));
		Assert.assertTrue("Verifying Title",
				driver.getTitle().contains("AdactIn"));
		
		LoginPage page1 = new LoginPage();
		type(page1.getUser(), "saravananr1190");
		type(page1.getPass(), "saravanan");
		
		Assert.assertEquals("Verifying Username", "saravananr1190",
				page1.getUser().getAttribute("value"));
		Assert.assertEquals("Verifying Password", "saravanan",
				page1.getPass().getAttribute("value"));
		page1.getBtnLogin();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		SearchPage page2 = new SearchPage();
		selectByValue(page2.getLoc(), "Melbourne");
		Assert.assertEquals("Verifying Location", "Melbourne",
				page2.getLoc().getAttribute("value"));
		selectByValue(page2.getRn(), "4");
		Assert.assertEquals("Verifying Room Number", "4",
				page2.getRn().getAttribute("value"));
		type(page2.getDin(), "28/09/2019");
		Assert.assertEquals("Verifying Checkin Date", "28/09/2019",
				page2.getDin().getAttribute("value"));
		type(page2.getDout(), "29/09/2019");
		Assert.assertEquals("Verifying Checkout Date", "29/09/2019",
				page2.getDout().getAttribute("value"));
		selectByValue(page2.getAr(), "1");
		Assert.assertEquals("Verifying Checkout Date", "1",
				page2.getAr().getAttribute("value"));
		btnClick(page2.getSub());
		
		
		
		
//		SelectPage page3 = new SelectPage();
//		btnClick(page3.getRadio1());
//		btnClick(page3.getContBtn());
//		
//		BookPage page4 = new BookPage();
//		type(page4.getfName(), "Chibi");
//		type(page4.getlName(), "DJ");
//		type(page4.getAddress(), "Chennai");
//		type(page4.getCardNum(), "1230654789789456");
//		selectByValue(page4.getCardType(), "VISA");
//		selectByValue(page4.getCardExpDate(), "3");
//		selectByValue(page4.getCardExpYear(), "2021");		
//		type(page4.getCardCvvNum(), "364");
//		btnClick(page4.getBook());
//		
//		Thread.sleep(10000);
//		
//		BookingConfirmation page5 = new BookingConfirmation();
//		String text = getText(page5.getOrderNum(),"value");
//		System.out.println("Booking order is " +text);
		
	}

	@After
	public void afterMethod() {
		Date date = new Date();
		System.out.println(date);
	}

	@AfterClass
	public static void afterClass() {
		quitBrowser();
	}

}

