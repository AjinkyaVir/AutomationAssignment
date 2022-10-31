package com.automationAssignment.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

public class Base {

	public static Properties prop;
	public static WebDriver driver;
	
	public static void loadConfig() throws IOException {
		
		prop = new Properties();
		
		try {
			
			FileInputStream fis = new FileInputStream(System.getProperty("use.dir") + "./configuration/config.properties");
			prop.load(fis);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
