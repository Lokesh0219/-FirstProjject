package com.reusable;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.base.BaseClass;

public class ReusableClass extends BaseClass{
	
public  void doclick(WebElement e) {
	e.click();
	}
	
public void doscroll(WebElement e) {
	JavascriptExecutor j=(JavascriptExecutor)driver;
	j.executeScript("arguments[0].scrollIntoView(true)",e);
}
	

}
