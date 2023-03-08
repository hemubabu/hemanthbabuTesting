package com.redbus;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class W3Schools {
	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HEMU\\eclipse-workspace2\\SeleniumConcept\\Driver&SeleniumPackage\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement search =driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		search.sendKeys("OOPS",Keys.ENTER);
		driver.findElement(By.xpath("(//a[@class='gs-title'])[1]")).click();
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		WebElement username = driver.findElement(By.xpath("//input[@name='email']"));
		username.sendKeys("hemanthkrish309@gmail.com");
		Robot R = new Robot();
		R.keyPress(KeyEvent.VK_TAB);
		R.keyRelease(KeyEvent.VK_TAB);
		WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
		password.sendKeys("Hemu3123*");
		R.keyPress(KeyEvent.VK_TAB);
		R.keyRelease(KeyEvent.VK_TAB);
		driver.findElement(By.xpath("(//button)[2]")).click();
		WebElement hi = driver.findElement(By.xpath("//h2[1]"));
		String text = hi.getText();
		System.out.println(text); //Hi, Hemanth

		

		


	
	
	
	
	
	
	}

}
