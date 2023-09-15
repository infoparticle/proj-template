package com.mygroup;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MyAppMain
{
	private static Logger logger = LogManager.getLogger(BpmInstallationHelper.class);
    public static void main( String[] args )
    {
		logger.info("---------- started -----------");
        System.out.println( "Hello World!" );
		logger.info("----------- completed! ----------");
    }
}
