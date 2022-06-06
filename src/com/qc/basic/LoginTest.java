package com.qc.basic;

import java.util.concurrent.TimeUnit;

import org.apache.xpath.operations.Equals;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class LoginTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver_v112.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3000,TimeUnit.SECONDS);
		driver.get("file:///H:/Automation%20Testing/program%20file%20pre/Files/Offline%20Website/index.html");
		
		WebElement email= driver.findElement(By.id("email"));
		email.sendKeys("queuecodes@gmail.com");
		
		driver.findElement(By.id("password")).sendKeys("123456");
		
		driver.findElement(By.id("submit")).click();
		Thread.sleep(2000);
		System.out.println("Page title: "+driver.getTitle());
		Assert.assertEquals(driver.getTitle(), "Queue Codes | Dashboard");

		
		driver.findElement(By.id("hlogout")).click();
		Thread.sleep(2000);
		
		System.out.println("Page title: "+driver.getTitle());
		
		driver.close();
	}

}
