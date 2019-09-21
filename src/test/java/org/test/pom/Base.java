package org.test.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Base {
	public static WebDriver driver;
	public static WebDriver getDriver(){
		System.setProperty("webdriver.chrome.driver", "D:\\eclipse\\Anisha\\MavenProj1\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		return driver;
	}
	public static void loadUrl(String url){
		driver.get(url);
	}
	public static void type(WebElement element, String name){
		element.sendKeys(name);
	}
	public static void btnClick(WebElement element){
		element.click();
	}
	public static void selectByValue(WebElement e, String name){
		Select s = new Select(e);
		s.selectByValue(name);
	}
	public static String getText(WebElement e, String attribute){
	    String attrValue = e.getAttribute(attribute);
		return attrValue;
	}
	public static void quitBrowser(){
		driver.quit();
	}

}
