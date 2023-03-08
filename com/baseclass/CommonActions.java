package com.baseclass;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonActions {
	public static WebDriver Driver;
	public static WebDriverWait wait;
	public static WebElement close;
	public void launch(String url) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HEMU\\eclipse-workspace2\\SeleniumConcept\\Driver&SeleniumPackage\\Driver\\chromedriver.exe");
		Driver = new ChromeDriver();
		Driver.manage().window().maximize();
		Driver.get(url);
		//Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	public void closeButton() {
		  Driver.findElement(By.xpath("//button[text()='✕']")).click();
	}
	public void waitConcept( WebElement W) {
		WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(W));
		
	}
	public static void main(String[] args) throws Exception {
		CommonActions C = new CommonActions();
		
	}
	

}
