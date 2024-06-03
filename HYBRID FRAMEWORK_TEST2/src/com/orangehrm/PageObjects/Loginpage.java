package com.orangehrm.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage 
{
 @FindBy(name="username")
 private WebElement usn;
 
 @FindBy(name="password")
 private WebElement psw;
 
 @FindBy(xpath="//button[@type='submit']")
 private WebElement lgn;
 
 public Loginpage(WebDriver driver)
 {
	 PageFactory.initElements(driver, this);
 }
 public WebElement EnterUSN()
 {
	 return usn;
 }
 public WebElement EnterPSW()
 {
	 return psw;
 }
 public WebElement ClickLGN
 ()
	 {
		return lgn;
		 
	 }
}