package com.redbus;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedBus {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HEMU\\eclipse-workspace2\\SeleniumConcept\\Driver&SeleniumPackage\\Driver\\chromedriver.exe");
		WebDriver D = new ChromeDriver();
		D.get("https://www.redbus.in/");
		D.manage().window().maximize();
		D.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		WebElement from = D.findElement(By.xpath("//input[@id='src']"));
		from.sendKeys("Chennai",Keys.ENTER);
		WebElement to = D.findElement(By.xpath("//input[@id='dest']"));
		to.sendKeys("Madurai",Keys.ENTER);
		WebElement date = D.findElement(By.xpath("(//input[@class='db'])[3]"));
		date.click();
		D.findElement(By.xpath("//td[@class='current day']")).click();
		Thread.sleep(3000);
		D.findElement(By.xpath("//button[text()='Search Buses']")).click();
		
		
		
		
		
	}
	

}
