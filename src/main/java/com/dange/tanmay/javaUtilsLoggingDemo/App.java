package com.dange.tanmay.javaUtilsLoggingDemo;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.logging.Level;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Hello world!
 *
 */
public class App 
{
	public static Logger Log = LoggerFactory.getLogger(App.class);
	
	
    public static void main( String[] args )
    {
    	Log.debug("Inside Main");
    	Log.info("Hello World!");
        int x=10;
        Log.info("Variable value is {}",x);
    }
}
