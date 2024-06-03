package com.orangehrm.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout
	{
	@FindBy(xpath="//span[@class='oxd-userdropdown-tab']")  
	 private WebElement logo;
	 
	 @FindBy(xpath="//a[.='Logout']")
	 private WebElement lgt;
	 
	 public void LoginPage(WebDriver driver)
	 {
		 PageFactory.initElements(driver, this);
	 }
	 public WebElement Clicklgo()
	 {
		 return logo;
	 }
	 public WebElement Clicklgt()
	 {
		 return lgt;
	 }
}