package com.stepdefinition;

import java.io.IOException;

import com.page.PageClass;
import com.reusable.ReusableClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stepdefinition extends ReusableClass{
PageClass pa;

@Given("To launch url")
public void to_launch_url() throws IOException, InterruptedException {
   browserlaunch();
}

@When("To test click function of Our bank")
public void to_test_click_function_of_Our_bank() throws InterruptedException {
	 pa =new PageClass(driver);
	Thread.sleep(1000);
	doclick(pa.getO());
    
}

@Then("to validate dropdown page")
public void to_validate_dropdown_page() {
    
}

@When("to test click function of About us")
public void to_test_click_function_of_About_us() throws InterruptedException {
	Thread.sleep(1000);
    doclick(pa.getA());
    
}

@Then("to validate About us page")
public void to_validate_About_us_page() {
    
}

@When("To test scroll function of About us page")
public void to_test_scroll_function_of_About_us_page() throws InterruptedException {
	Thread.sleep(1000);
	doscroll(pa.getR());
    
}

@Then("to validate page scrolls down and up")
public void to_validate_page_scrolls_down_and_up() {
    
}



	
	
}
