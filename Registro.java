package com.lied95.test1;


import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Registro {
	
	private WebDriver driver;
	
	@Before
	public void setUp() {
		
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://edropcr.com/registro/");
		
	}
	
	@Test
	public void registro() throws InterruptedException {
		
		Thread.sleep(9000);
		
		WebElement findUsername = driver.findElement(By.name("user_login"));
		
		findUsername.sendKeys("pruebaG6");
		
		WebElement findEmail = driver.findElement(By.name("user_email"));
		
		findEmail.sendKeys("prueba@prueba.com");
		
		findEmail.submit();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
			
		}
		
	}
	

