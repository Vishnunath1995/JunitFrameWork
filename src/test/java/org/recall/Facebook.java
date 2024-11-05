package org.recall;

import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.Pojoclass.Login;
import org.apache.hc.core5.http.nio.AsyncServerRequestHandler;
import org.baseclass.BaseClass;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;



public class Facebook extends BaseClass{
  Login l;
	@BeforeClass
	public static void LaunchFacebook() {
	browserLaunch("chrome");
	//launchUrl("https://www.facebook.com/");
	maxWindow();
	System.out.println("before class");
	
	

	}
	@Before
	public void BeforeTestExecution() throws InterruptedException  {
		Date date = date();
		System.out.println("BeforeTestExecution " +date);
		System.out.println("before");
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		Thread.sleep(2000);
		

	}
	@Test
	public void loginC() throws InterruptedException {
	l=new Login();
	launchUrl("https://www.facebook.com/");
	sendkeys(l.getUsername(), "vishnu");
	String att = attributeValue(l.getUsername());
	Assert.assertEquals("vishnu", att);
		sendkeys(l.getPassword(), "12345");
		btnClick(l.getButton());
		System.out.println("test");
	
		

	}
	@Ignore
	@Test
	public void loginA() {
	l=new Login();
	launchUrl("https://www.facebook.com/");
	sendkeys(l.getUsername(), "vishnunath");
	String att = attributeValue(l.getUsername());
	Assert.assertEquals("vishnunath", att);
		sendkeys(l.getPassword(), "123");
		btnClick(l.getButton());
		System.out.println("test2");
		
	}
	@Test
	public  void loginB() {
	l=new Login();
	launchUrl("https://www.facebook.com/");
	sendkeys(l.getUsername(), "vishnunath");
	String att = attributeValue(l.getUsername());
	Assert.assertEquals("vishnunath", att);
		sendkeys(l.getPassword(), "123");
		btnClick(l.getButton());
		System.out.println("test100");
		
	}
	@Test
	public void loginD() {
	l=new Login();
	launchUrl("https://www.facebook.com/");
	sendkeys(l.getUsername(), "vishnunath");
	String att = attributeValue(l.getUsername());
	Assert.assertEquals("vishnuna", att);
		sendkeys(l.getPassword(), "123");
		btnClick(l.getButton());
		System.out.println("test2");
		Assert.assertTrue(false);
	}
	@After
	public void AfterCompleteTestExecution() {
		Date date = date();
		System.out.println("AfterCompleteTestExecution " +date );
System.out.println("after");

	}
	@AfterClass
	public static void Browserclose() throws InterruptedException {
		Thread.sleep(2000);
		//driver.navigate().back();
		driver.close();
		System.out.println("afterclass");

	}

}
