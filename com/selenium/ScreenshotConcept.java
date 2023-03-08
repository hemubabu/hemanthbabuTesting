package com.selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotConcept {
		public static void main(String[] args) throws InterruptedException, IOException {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\HEMU\\eclipse-workspace2\\SeleniumConcept\\Driver&SeleniumPackage\\chromedriver.exe");
			WebDriver Driver = new ChromeDriver();
			String url = "https://www.flipkart.com/";
			Driver.get(url);
			Driver.manage().window().maximize();
			
		
		
		
		
		
		
		
		
		String title = Driver.getTitle();
		Driver.findElement(By.xpath("//button[text()='✕']")).click();
		TakesScreenshot ts = (TakesScreenshot)Driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File("C:\\Users\\HEMU\\eclipse-workspace2\\SeleniumConcept\\Screenshot\\Flipkart"+title+".png");
		FileUtils.copyFile(source,target);
}
 
}
