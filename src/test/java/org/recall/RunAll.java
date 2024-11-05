package org.recall;

import java.util.List;

import org.facebook.FB;
import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.RunWith;
import org.junit.runner.notification.Failure;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

//@RunWith(Suite.class)
//@SuiteClasses({Facebook.class})
public class RunAll {
	
	@Test
	public void RunALL() {
		Result r = JUnitCore.runClasses(Facebook.class);
		System.out.println("run count " +r.getRunCount());
		System.out.println("run time " +r.getRunTime());
		System.out.println("faileure count " +r.getFailureCount());
		System.out.println("ignore count " +r.getIgnoreCount());
		
		List<Failure> failures = r.getFailures();
		for(Failure f:failures)
		{
			System.out.println("failures count " +f);
		}
System.out.println("Run count way2 " +(r.getRunCount()-r.getFailureCount()));

int assumptionFailureCount = r.getAssumptionFailureCount();
System.out.println(assumptionFailureCount);
	}

}
