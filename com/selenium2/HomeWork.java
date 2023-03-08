package com.selenium2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWork {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HEMU\\eclipse-workspace2\\SeleniumConcept\\Driver&SeleniumPackage\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url = "https://demo.automationtesting.in/Alerts.html";
		driver.get(url);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']")).click()    ;
		driver.findElement(By.xpath("//button[text()='click the button to display a confirm box ']")).click();
		Alert A = driver.switchTo().alert();
		A.accept();
	}

}
