package com.practice;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverConcept {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HEMU\\eclipse-workspace2\\SeleniumConcept\\Driver&SeleniumPackage\\Driver\\chromedriver.exe");
		WebDriver Driver = new ChromeDriver();
		String url = "https://www.nykaaman.com/";
		Driver.get(url);
		Driver.manage().window().maximize();
		String currenturl = Driver.getCurrentUrl();
		boolean urlequals = currenturl.equals(url);
		System.out.println(urlequals);
		String title = Driver.getTitle();
		System.out.println(title);
		WebElement search = Driver.findElement(By.className("css-1upamjb"));
		search.sendKeys("Perfume",Keys.ENTER);
		String title2 = Driver.getTitle();
		System.out.println(title2);
		WebElement test = Driver.findElement(By.xpath("//a[text()='Testimonials']"));
		WebElement Nykaa = Driver.findElement(By.xpath("//a[text()='Nykaa Man']"));
		String pageSource = Driver.getPageSource();
		System.out.println(pageSource);
	
	
		
		JavascriptExecutor js = (JavascriptExecutor)Driver;
		
		js.executeScript("arguments[0].scrollIntoView(true)",test);
		Thread.sleep(3000);
		js.executeScript("arguments[0].scrollIntoView(false)",Nykaa);
		TakesScreenshot SC = (TakesScreenshot)Driver;
		File source = SC.getScreenshotAs(OutputType.FILE);
		File target = new File("C:\\Users\\HEMU\\eclipse-workspace2\\SeleniumConcept\\Screenshot\\Nykaa");		
		FileUtils.copyFile(source,target);		
		String pagesource = Driver.getPageSource();		System.out.println(pagesource); 

	}

}
