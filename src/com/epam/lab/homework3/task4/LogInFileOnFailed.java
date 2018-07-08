package com.epam.lab.homework3.task4;

import org.apache.log4j.Logger;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;

public class LogInFileOnFailed extends TestWatcher {

	private static final Logger LOG = Logger.getLogger(LogInFileOnFailed.class);
	
	@Override
    protected void failed(Throwable e, Description description) {
		LOG.debug(e.toString());
		LOG.debug(description.toString());
		System.out.println(e.toString());
        System.out.println(description.toString());
    }
	
}
