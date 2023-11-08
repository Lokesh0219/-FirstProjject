package com.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public WebDriver driver;
	public Properties pro;
    public void browserlaunch() throws IOException {
	FileInputStream urlfile = new FileInputStream("src/test/resources/com.property/Propertyfile");
	Properties pro = new Properties();
	pro.load(urlfile);
	 
	 pro.getProperty("Browser").equalsIgnoreCase("edge");
	 WebDriverManager.edgedriver().setup();
   	 driver= new EdgeDriver();

	   
	 driver.get(pro.getProperty("url"));
	 driver.manage().window().maximize();
		
	
}
}
