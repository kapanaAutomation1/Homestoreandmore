package com.HomeStoreandMore.test;


import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.HomeStoreandMore.pages.LoginPage;
import com.HomeStoreandMore.pages.StoreHomePage;


	
	public class LoginTest extends BaseTest {
		
		WebDriver driver;
	
		@Test //(priority = 0)
	    public void loginToStoreTest() throws IOException {
			//super.setup("chrome");
			this.driver = super.driver;
			StoreHomePage shp=new StoreHomePage(driver);
			shp.goToLoginIcon();
			//shp.goToLoginPage();
			
	        LoginPage in =new LoginPage(driver);
	      in.loginHomeStorePlusMore("kalpanavas16@gmail.com", "Ridhi416");
	      in.clickLogin();
	
	 
	     
		}       
	 
	  /*  @Test (priority = 1)
	    public void invalidLoginTest_EmptyUserEmptyPassword () {
	        
		    StoreHomePage homePage = new StoreHomePage(driver); 
	     */
	}
	        
	    
		
