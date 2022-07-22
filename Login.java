package com.lied95.test1;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
	
	private WebDriver driver;
	
	@Before
	public void setUp() {
		
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://edropcr.com/mi-cuenta/");
		
	}
	
	@Test
	public void login() throws InterruptedException {
		
		Thread.sleep(5000);
		
		WebElement findUsername = driver.findElement(By.name("username"));
		
		findUsername.sendKeys("CSGrupo6");
		
		WebElement findPassword = driver.findElement(By.name("password"));
		
		findPassword.sendKeys("3dr0pcsg6");
		
		WebElement findAccederBt = driver.findElement(By.name("login"));
		
		findAccederBt.click();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
		}
		
	}
	
