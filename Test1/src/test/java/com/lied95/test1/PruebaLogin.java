package com.lied95.test1;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PruebaLogin {
	
	private WebDriver driver;
	By siginLinkLocator = By.linkText("Signin");
	By siginPageLocator = By.xpath("<h3 class=\"title-account\">Signin</h3>");
	
	By userLocator = By.name("username");
	By passLocator = By.name("password");
	By signInBtnLocator = By.name("submit");
	
	By homePageLocator = By.linkText("Discover great places in London");
	
	
	@Before
	public void setUp() throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://sistemas.ufidelitas.ac.cr/cityo-demo1/");
		
	}

	@Test
	public void login() throws InterruptedException {
		if(driver.findElement(userLocator).isDisplayed()) {
			driver.findElement(userLocator).sendKeys("prueba1");
			driver.findElement(passLocator).sendKeys("123456");
			driver.findElement(signInBtnLocator).click();
			Thread.sleep(2000);
			assertTrue(driver.findElement(homePageLocator).isDisplayed());
		}
		else
			System.out.println("username textbox was not present");
	
	}
	
	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

}
