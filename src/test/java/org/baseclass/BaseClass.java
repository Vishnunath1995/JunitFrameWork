package org.baseclass;

import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;

	public static WebDriver browserLaunch(String bname) {
		if(bname.contains("chrome"))	
		{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		else
		{	
			if(bname.contains("edge"))
			{
				WebDriverManager.edgedriver().setup();
				driver=new EdgeDriver();
			}
			else
			{
				WebDriverManager.firefoxdriver().setup();
				driver=new FirefoxDriver();
			}
		}
		return driver;

	}

	public static void launchUrl(String url) {
		driver.get(url);

	}
	
	public static void maxWindow() {
		driver.manage().window().maximize();

	}
	
	public static String currentUl()
	{
		  String currentUrl = driver.getCurrentUrl();
		  return currentUrl;
	
	}
	public static void sendkeys(WebElement e,String value) {
	e.sendKeys(value);

}
	public static String attributeValue(WebElement e) {
		   String attribute = e.getAttribute("value");
		   return attribute;
		

	}
	
	public static String pageTitle() {
		String title = driver.getTitle();
		return title;

	}
	public static void btnClick(WebElement e) {
		e.click();

	}
	
	public static Date date() {
	
Date d=new Date();
return d;
	}
public static void navigateBack()
{
	driver.navigate().back();
}
public static void navigateForward()
{
	driver.navigate().forward();
	
}

public static void refersh()
{
	driver.navigate().refresh();
}
public static void waitt(long arg) throws InterruptedException
{
	Thread.sleep(arg);
}

public static  Timeouts implicitwait() {
	Timeouts implicitlyWait = driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	return implicitlyWait;
}

public static void quitebws() {
	driver.quit();

}
public static void closeBws() {
	driver.close();

}
}
