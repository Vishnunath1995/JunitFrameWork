package org.runner;

import java.util.List;

import org.facebook.FB;
import org.facebook.FB1;
import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.RunWith;
import org.junit.runner.notification.Failure;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

//@RunWith(Suite.class)
//@SuiteClasses({FB.class,FB1.class})

public class TestRunner {
	
	@Test
	public void RunAll() {
		Result r = JUnitCore.runClasses(FB.class,FB1.class);
	System.out.println("RunCount--->"+r.getRunCount());
	System.out.println("failure count--->"+r.getFailureCount());
	System.out.println("Ignore count--->"+r.getIgnoreCount());
	
System.out.println("sucessful or not "+r.wasSuccessful());
System.out.println("Run Time------> "+r.getRunTime());
	List<Failure> failures = r.getFailures();
	for(Failure faile:failures)
	{
		System.out.println("failures count--->"+faile);
	}
	}

}
