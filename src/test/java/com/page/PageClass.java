package com.page;

import org.base.Baseclass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class PageClass extends Baseclass{
	
	public PageClass(WebDriver driver) {
		
		this.driver= driver;
		
	PageFactory.initElements(driver, this);
	
	}
	
    @FindBy(className = "menu-item")
    WebElement o; 
    @FindBy(xpath="(//a[text()='About Us'])[1]")
    WebElement a;
    @FindBy(xpath="//a[text()='Get in touch with us Now!']")
    WebElement r;
    
	public WebElement getO() {
		return o;
	}
	public WebElement getA() {
		return a;
	}
	public WebElement getR() {
		return r;
	}
    
    
   
	
	
	
	
}
