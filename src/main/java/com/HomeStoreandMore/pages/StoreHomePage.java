package com.HomeStoreandMore.pages;

 
 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.HomeStoreandMore.test.BaseTest;

import sun.rmi.runtime.Log;
 
public class StoreHomePage  {
	
   WebDriver driver;
		      

  //*********Web Elements*********
     @FindBy(xpath="//li[@class='user-info active']//a[@class='null'][contains(text(),'Login')]") 
     WebElement login; 
    @FindBy(xpath="//div[@class='columns small-4 user-menu nopad']//i[@class='icon-wishlist']")
    WebElement userLoginIcon;
   
   
    public StoreHomePage(WebDriver driver){

        this.driver = driver;

        //This initElements method will create all WebElements
        PageFactory.initElements(driver, this);
    }

    
    public void goToLoginIcon() {
    	  userLoginIcon.click();
    	
    }
 
   // Go to LoginPage
    public void goToLoginPage (){
       login.click();
     
    }
}

 


