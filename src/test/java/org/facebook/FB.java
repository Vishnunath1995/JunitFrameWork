package org.facebook;

import static org.junit.Assert.assertEquals;

import java.util.Date;

import org.Pojoclass.Login;
import org.baseclass.BaseClass;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class FB extends BaseClass{
	
	@BeforeClass
	public static void openBrowser() {
		browserLaunch("chrome");
		launchUrl("https://www.facebook.com/");
		maxWindow();
		
		

	}
	@Before
	public void ExecutionStartTime() {
	
Date date = date();
System.out.println("ExecutionStartTime -------- > "+date);
	}
	
	@Test
	public void loginwithinvaliddatas()
	{
		Login l =new Login();
		sendkeys(l.getUsername(), "vishnunath");
		
	
		String attributeValue2 = attributeValue(l.getUsername());
		System.out.println(attributeValue2);
		
		sendkeys(l.getPassword(), "12345567890");
		String att = attributeValue(l.getPassword());
		Assert.assertEquals("12345567890", att);
		btnClick(l.getButton());
		
		
	}
	
	@Test
	public void checkInvalidpage() {
		Login l =new Login();
		sendkeys(l.getUsername(), "vishnunath");
		
	
		String attributeValue2 = attributeValue(l.getUsername());
		System.out.println(attributeValue2);
		
		sendkeys(l.getPassword(), "12345567890");
		String att = attributeValue(l.getPassword());
		Assert.assertEquals("12345567890", att);
		btnClick(l.getButton());
	     String pageTitle = pageTitle();
	     System.out.println(pageTitle);
	     String currentUl = currentUl();
	     System.out.println(currentUl);
	     boolean contains = currentUl.contains("privacy_mutation_token");
	     System.out.println(contains);

		
	}
	@After
	public void ExecutionEndingTime() throws InterruptedException 
	{
		 waitt(2000);
		refersh();
		
		navigateBack();
		
		refersh();
		
	Date date = date();
	System.out.println("ExecutionEndingTime-------------> "+date);
	}
	
	@AfterClass
	public static void CloseBrowser()
	{
	driver.close();
	}

}
