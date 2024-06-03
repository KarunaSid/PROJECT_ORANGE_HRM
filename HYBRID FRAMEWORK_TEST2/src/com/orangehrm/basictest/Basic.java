package com.orangehrm.basictest;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.orangehrm.PageObjects.Homepage;
import com.orangehrm.PageObjects.Loginpage;
import com.orangehrm.PageObjects.Logout;

public class Basic implements AppConstants
    {
	public WebDriver driver;
	Properties pro;
	WebDriverWait w;
	Homepage HP;
	Loginpage l;
	Logout lo;
	FileInputStream fis;
	@BeforeClass
	
	public void base() throws IOException 
	{
	 System.setProperty(gecko_key,gecko_value);
     driver = new FirefoxDriver();
     driver.manage().window().maximize();
     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
     w = new WebDriverWait(driver, WaitTime);
     pro = new Properties();
     fis = new FileInputStream("./DATA/test.properties");
     pro.load(fis);
     driver.get(pro.getProperty("url"));
    
	}
 
	@BeforeMethod
	public void signin()
	{
		 l=new Loginpage(driver);
	     l.EnterUSN().sendKeys(pro.getProperty("usn"));
	     l.EnterPSW().sendKeys(pro.getProperty("pwd"));
	     WebDriverWait w = new WebDriverWait(driver, WaitTime);
	     w.until(ExpectedConditions.visibilityOf(l.ClickLGN()));
	     l.ClickLGN().click();
	
	}
    @AfterMethod
    public void signout()
    {
    	lo=new Logout();
    	lo.Clicklgo().click();
    	lo.Clicklgt().click();
    }	
    }  
     
