package com.lied95.test1;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BuscarProducto {
	
	private WebDriver driver;
	
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
			
		}
		
	}
	
