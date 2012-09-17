package com.accenture.spring;

import org.apache.log4j.Logger;

public class Logging {

	private static final Logger log = Logger.getLogger(Logging.class);
	
	public void before() {
		log.info("before");
	}
	
	public void after() {
		log.info("after");
	}
}
