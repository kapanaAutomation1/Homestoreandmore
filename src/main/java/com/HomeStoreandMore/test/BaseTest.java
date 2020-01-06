package com.HomeStoreandMore.test;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

import org.apache.log4j.BasicConfigurator;
//import org.apache.log4j.BasicConfigurator;
//import org.apache.log4j.PropertyConfigurator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class BaseTest {
	public WebDriver driver;
	 Logger log = LogManager.getLogger(BaseTest.class);
	/*
	 * WebDriverWait wait; ReadConfig readconfig=new ReadConfig(); public static
	 * x
	 * 
	 * public String appURL=readconfig.getApplication(); public String
	 * username=readconfig.getUsername(); public String
	 * password=readconfig.getPassword(); public WebDriver getDriver() { return
	 * driver; }
	 */

	/*
	 * public BaseTest (WebDriver driver){ this.driver = driver; WebDriverWait wait
	 * = new WebDriverWait(driver,15); }
	 * 
	 * //@Parameters("browser")
	 * @BeforeClass
	 * 
	 */
	@BeforeClass
	public void setup() {// String br
		// Create a Chrome driver. All test classes use this.
		// driver = getDriver();
		
		  BasicConfigurator.configure();

		//String log4jConfpath="./Log4j2.Properties";

		// PropertyConfigurator.configure(log4jConfpath);
		// if(br.equals("chrome")) {
		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
		// readconfig.getChromePath());

		// WebDriverManager driver=new ChromeDriver();
		driver = new ChromeDriver();
		//log.log(Level.FINE, "testing");
       log.info("testing");

		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

		// Maximize Window
		//driver.manage().window().maximize();
		driver.get(driver.getCurrentUrl());

		driver.get("https://www.homestoreandmore.ie/");
		log.debug("Debug Message Logged");
		log.info("entering to the website");
	//	log.error("Error Message Logged !!!", new NullPointerException("NullError"));
	}

	/*
	 * @Test public void verifyHomePage() { System.out.println("Home page test...");
	 * BasePage basePage = new BasePage(driver);
	 * Assert.assertTrue(basePage.verifyBasePageTitle(),
	 * "Home page title doesn't match"); }
	 * 
	 */

	/*
	 * //Wait Wrapper Method public void waitVisibility(WebElement elementBy) {
	 * wait.until(ExpectedConditions.visibilityOfAllElements(elementBy)); }
	 * 
	 * 
	 * //Click Method public void click (WebElement elementBy) {
	 * waitVisibility(elementBy); elementBy.click(); }
	 */
	
	//@AfterClass
	public void teardown() {
		driver.quit();
	}

}
