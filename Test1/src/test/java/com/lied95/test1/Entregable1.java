package com.lied95.test1;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

//import static org.junit.Assert.assertEquals;

//import java.util.concurrent.TimeUnit;

//import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Entregable1 {
	
	private WebDriver driver;
	
	//By registerLinkLocator = By.linkText("Registrarse");
	//By tagLocator = By.linkText("Registrarse");
	
	//By usernameLocator = By.id("inputFirstName");
	//By lastnameLocator = By.id("inputLastName");
	//By emailLocator = By.id("inputEmail");
	
	@Before
	public void setUp() {
		
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://edropcr.com/");
		
	}
	
	@Test
	public void searchProduct() throws InterruptedException {
		
		Thread.sleep(9000);
		
		WebElement searchbox = driver.findElement(By.name("s"));
		
		searchbox.clear();
		
		searchbox.sendKeys("Perfume");
		
		searchbox.submit();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		assertEquals("Perfume", driver.getTitle());
			
		}
		
	}
	
	//@After
	//public void tearDown() {
		//driver.quit();
	//}

//}
