package com.orangehrm.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage 
{
	@FindBy(xpath="//span[.='PIM']")
	private WebElement ClickBtn;
	
	@FindBy(xpath="//a[.='Add Employee]")
	private WebElement ClickBtn1;
	
	 @FindBy(name="firstName")
	 private WebElement ClickFN;
	 
	 @FindBy(name="middleName")
	 private WebElement ClickMN;
	 
	 @FindBy(name="lastName")
	 private WebElement ClickLN;
	 
	 @FindBy(xpath="//button[@type='submit']")
	 private WebElement ClickSV;

	private WebElement ClickAdd; 
	 
	 public Homepage (WebDriver driver)
	 {
		 PageFactory.initElements(driver, this);
	 }
	 public WebElement ClickPim()
	 {
		 return ClickBtn;
	 }
	 public WebElement ClickonAdd()
	 {
		 return ClickAdd;
	 }
	 public WebElement EnterFN()
	{
		return ClickFN;
	}
			
	public WebElement EnterMN()
	 {
		return ClickMN;	
	 }
    public WebElement EnterLN()
	{
		return ClickLN;	
	}
	public WebElement EnterSV()
		{
			return ClickSV;		
		}
	
        {
        	System.out.println("save");
        }
}