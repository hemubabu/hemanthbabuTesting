package com.selenium2;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsConcept {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HEMU\\eclipse-workspace2\\SeleniumConcept\\Driver&SeleniumPackage\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url2 = "http://demoguru99.com/test/drag-drop.html";
		driver.get(url2);
//		String url1 = "https://www.flipkart.com/";
//		driver.get(url1);
//		driver.manage().window().maximize();
//		driver.findElement(By.xpath("//button[text()='✕']")).click();
//		WebElement login = driver.findElement(By.xpath("//a[text()='Login']"));
//		Actions A = new Actions(driver);
//		A.moveToElement(login).perform();
//		driver.quit();

		String url = "https://www.facebook.com/";
		driver.get(url);
		driver.manage().window().maximize();
		WebElement username = driver.findElement(By.name("email"));
		username.sendKeys("hemanthbabu");
		String Usertext = username.getText();
		Actions A1 = new Actions(driver);
		A1.doubleClick(username).contextClick().build().perform();
		Thread.sleep(3000);
		Robot R = new Robot();
		for (int i=0;i<2;i++) {
		R.keyPress(KeyEvent.VK_DOWN);
		R.keyRelease(KeyEvent.VK_DOWN);
		}
		Thread.sleep(2000);
		R.keyPress(KeyEvent.VK_ENTER);
		R.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		R.keyPress(KeyEvent.VK_TAB);
		R.keyRelease(KeyEvent.VK_TAB); 
		R.keyPress(KeyEvent.VK_CONTROL);
		R.keyPress(KeyEvent.VK_V);
		R.keyRelease(KeyEvent.VK_CONTROL);
		R.keyRelease(KeyEvent.VK_V);
		WebElement password = driver.findElement(By.id("pass"));
		String Passwordtext = password.getText();
		System.out.println();
		boolean textcheck = Passwordtext.equals(Usertext);
		System.out.println(textcheck);
	
		
		


		

		
		
	}

	}
