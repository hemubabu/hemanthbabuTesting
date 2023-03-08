package com.practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.baseclass.CommonActions;

public class AlertsPractice extends CommonActions {
	
	CommonActions C = new CommonActions();
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HEMU\\eclipse-workspace2\\SeleniumConcept\\Driver&SeleniumPackage\\Driver\\chromedriver.exe");
		WebDriver Driver = new ChromeDriver();
		Driver.get("https://demo.automationtesting.in/Alerts.html");
		Driver.manage().window().maximize();
		
//		Driver.findElement(By.xpath("//button[@onclick='alertbox()']")).click();
		
//		A.accept();
//		Thread.sleep(3000);
//
//		Driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']")).click();
//		Thread.sleep(3000);
//		Driver.findElement(By.xpath("//button[@onclick='confirmbox()']")).click();
//		A.dismiss();
		Driver.findElement(By.xpath("//a[text()='Alert with Textbox ']")).click();
		Driver.findElement(By.xpath("//button[@onclick='promptbox()']")).click();
		Thread.sleep(3000);
		Alert A = Driver.switchTo().alert();
		A.sendKeys("Hemanth");
		String text = A.getText();
		A.accept();
		WebElement G = Driver.findElement(By.xpath("//p[@id='demo1']"));
		Thread.sleep(3000);
		String text2 = G.getText();
		System.out.println(text2);
		boolean b = text.equals(text2);
		System.out.println(b);
		System.out.println(text);
		Driver.quit();
		

		
	}

}
