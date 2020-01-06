package com.HomeStoreandMore.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
	 
	public class BasePage {
	     WebDriver driver;
	     WebDriverWait wait;
	 
	    //Constructor
	    public BasePage (WebDriver driver){
	        this.driver = driver;
	        wait = new WebDriverWait(driver,15);
	    }
	 
	    //Wait Wrapper Method
	    public void waitVisibility(WebElement elementBy) {
	        wait.until(ExpectedConditions.visibilityOfAllElements(elementBy));
	    }
	 
	    //Click Method
	    public void click (WebElement elementBy) {
	        waitVisibility(elementBy);
	        elementBy.click();
	    }
	 
	  
	 
	    //Assert
	   
	    }
	




