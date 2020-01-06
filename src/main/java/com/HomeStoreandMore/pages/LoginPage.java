package com.HomeStoreandMore.pages;

	import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
	import org.testng.Assert;
	 
	public class LoginPage {
		
		WebDriver driver;
	 
	    //*********Constructor*********
	    public LoginPage(WebDriver rdriver) {
	    	this.driver = rdriver;

	        //This initElements method will create all WebElements
	        PageFactory.initElements(rdriver, this);

	    }
	 
	
	 @FindBy(xpath="//p[contains(text(),'We could not log you in. Your email and/or passwor')]")
	   WebElement errorMessage;
	   // By errorMessagePasswordBy = By.xpath("//*[@id=\"loginForm\"]/div[2]/div/div ");
	    @FindBy(xpath=" //*[contains(@id,'dwfrm_checkoutaddress_login_username')]")
	    WebElement emailAddress;
	    
	    @FindBy(xpath="//*[contains(@id,'dwfrm_checkoutaddress_login_password')]")
	    WebElement homeStorePassword;
	    
	    @FindBy(xpath="//button[@name='dwfrm_checkoutaddress_login_login']")
	         WebElement clickLogin;
	    //*********Page Methods*********
	 
	    public void setUserName(String inputUserName) throws IOException{
			
            emailAddress.sendKeys(inputUserName);
            System.out.println("enter email:");
      }
      //Set password
      public void setPassword (String inputPassword){
          homeStorePassword.sendKeys(inputPassword);
          System.out.println("enter password");
      }

       public void clickLogin(){
          clickLogin.click();
          System.out.println("successfully logged into homeStore with credentials");
                } 
      // public String getAccountHeadder(){
    	 // return accountHeadder.getText();
      // }
 
       
      // public void loginArnotts(String inputUserName,String inputPassword) throws IOException{

           //Fill user name
       
       public void loginHomeStorePlusMore(String inputUserName,String inputPassword) throws IOException{
         System.out.println(inputUserName);
           this.setUserName(inputUserName);

           //Fill password

           this.setPassword(inputPassword);

       }
	 
	    //Verify Username Condition
	    public void verifyLoginUserName (String expectedText) {
	        assertEquals(errorMessage, expectedText);
	       
	    }

		public void verifyLoginPassword(String string) {
			// TODO Auto-generated method stub
		
		}

		

}
