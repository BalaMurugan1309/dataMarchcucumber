package com.Baseclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Baseclass {
	
	public static  WebDriver driver;
	public static String value;
	public static WebDriver getbrowser(String type) {
		
		//getting the webbrowser page
		if (type.equalsIgnoreCase("chrome")) {
			
			System.setProperty("webdriver.chrome.driver","C:\\Users\\dell\\eclipse-workspace\\Cucumber\\chrome\\chromedriver.exe");
			
			driver= new ChromeDriver();
		} 
		else if (type.equalsIgnoreCase("firefox")) {
				
				System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"\\Driver1\\chromedriver.exe");
				
				driver= new FirefoxDriver();
			 	
		}
		driver.manage().window().maximize();
		
		return driver;
	}
	
	//To get Url
	public static void getUrl(String url) {
		
		driver.get(url);
		
	}
	//To click on Element
	public static void Clickonbutton(WebElement element) {
		element.click();
	}

	//To pass sendkeys
	public static void Inputforvalue(WebElement element,String value) {
		element.sendKeys(value);
	}
	//To close a webpage
	public static WebDriver CloseElement() {
		
		driver.close();
		
		return driver;

	}
	//To quit from a web page 
	public static void QuitElement() {
		driver.quit();
	}
	//Navigate to a webpage
	public static void Navigateto(String value) {
		driver.navigate().to(value);
	}
	//Navigate back to webpage
	public static void Navigateback() {
		driver.navigate().back();
	}
	//Navigate forward to webpage
	public static void NavigateForward() {
		driver.navigate().forward();
	}
	//Refresh a page
	public static void Refreshapage() {
		driver.navigate().refresh();
	}
	//Radiobutton
	public static void Radiobutton(WebElement element) {
		element.click();
	}
	//Actions
	//mouse
	public static void Actionsmethod(WebElement element,String value) {
		Actions ac = new Actions(driver);
		if (value.equalsIgnoreCase("click")) {
			ac.click(element).build().perform();
		}
		else if (value.equalsIgnoreCase("contextclick")) {
			ac.contextClick(element).build().perform();
		}
		else if (value.equalsIgnoreCase("doubleclick")) {
			ac.doubleClick(element).build().perform();
		}
		else if (value.equalsIgnoreCase("move to element")) {
			ac.moveToElement(element).build().perform();
		}
		else if (value.equalsIgnoreCase("drag and drop")) {
			ac.dragAndDrop(element,element).build().perform();
		}
	}
	
	//Keyboard
	//Robot
	//down
	public static void Robotdown() throws AWTException {
		Robot h = new Robot();
		h.keyPress(KeyEvent.VK_DOWN);
		h.keyRelease(KeyEvent.VK_DOWN);
	}
	//Enter
	public static void RobotEnter() throws AWTException {
		Robot h = new Robot();
		h.keyPress(KeyEvent.VK_ENTER);
		h.keyRelease(KeyEvent.VK_ENTER);
		
	}
	
	//Alerts
	public static void Alertmethod(String value) {
		Alert a = driver.switchTo().alert();
		if (value.equalsIgnoreCase("accept")) {
			a.accept();
		}
		else if (value.equalsIgnoreCase("dismiss")) {
			a.dismiss();
		}
		else if (value.equalsIgnoreCase("gettext")) {
			String text = a.getText();
			System.out.println(text);
		}
		else if (value.equalsIgnoreCase("sendkeys")) {
			a.sendKeys(value);
			a.accept();
		}
	}
	
	//Screenshot
	public static void screenshot(String value) throws IOException {
		TakesScreenshot bc = (TakesScreenshot) driver;
		File scr = bc.getScreenshotAs(OutputType.FILE);
		File des = new File(value);
		FileUtils.copyFile(scr,des);
	}
	
	//threadsleep
	public static void sleep(int seconds) throws InterruptedException {
		Thread.sleep(seconds);
	}
	
	//implicit wait
	public static void implicitwait(int time) {
		driver.manage().timeouts().implicitlyWait(time,TimeUnit.SECONDS);
	}
	
	//frame
	public static void Frameelement(int number) {
		driver.switchTo().frame(number);
	}
	//Javascripexecutor
	//scrolldown
	public static void javascriptexecutor_scrolldown() {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,3000);");
		js.executeScript("window.scrollBy(0,9000);");
	}
	//scroll up
	private void javascriptexecutor_scrollup() {
		JavascriptExecutor j = (JavascriptExecutor)driver;
		j.executeScript("window.scrollBy(0,-4500);");
	}
	
	//clear
	public static void clear(WebElement element) {
		element.clear();
	}
	
	//Get Text
	public static void gettext(WebElement element) {
		String text = element.getText();
		System.out.println(text);
	}
	
	//Attribute
	public static void getAttribute(WebElement element,String value) {
		String attribute = element.getAttribute(value);
		System.out.println(attribute);
	}
	
	//windowhandle
	public static void Windowhandle() {
		String cs = driver.getWindowHandle();
		System.out.println(cs);
	}
	
	
	//dropdown
	public static void dropdown(WebElement element,String value,String attributename) {
		Select H = new Select(element);
		if (value.equalsIgnoreCase("by value")) {
			H.selectByValue(attributename);
		}
		else if (value.equalsIgnoreCase("by visibletext")) {
			H.selectByVisibleText(attributename);
		}
		else if (value.equalsIgnoreCase("by index")) {
			int data = Integer.parseInt(attributename);
			H.selectByIndex(data);
		}
	}
	
	//windowhandles
	public static void Windowhandles() {
		Set<String> cb = driver.getWindowHandles();
		for (String bs : cb) {
			System.out.println(bs);
		}
		
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}




































