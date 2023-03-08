package com.selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsConcept {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HEMU\\eclipse-workspace2\\SeleniumConcept\\Driver&SeleniumPackage\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url ="https://demo.automationtesting.in/Alerts.html";
		driver.get(url);
		driver.manage().window().maximize();
//		driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']")).click();
//		driver.findElement(By.xpath("//button[@onclick='confirmbox()']")).click();
		driver.findElement(By.xpath("//a[text()='Alert with Textbox ']")).click();
		driver.findElement(By.xpath("//button[@onclick='promptbox()']")).click();
		
		Thread.sleep(3000);
		
		Alert A = driver.switchTo().alert();
		A.sendKeys("Hemanthbabu");
		A.accept();
		WebElement text = driver.findElement(By.xpath("//p[@id='demo1']"));
		String Alerttext = text.getText();
		System.out.println(Alerttext);


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
				
	
	
	
	
	
	

}
