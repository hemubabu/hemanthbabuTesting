package com.selenium2;

import java.io.IOException;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptexecutorConcept2 {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HEMU\\eclipse-workspace2\\SeleniumConcept\\Driver&SeleniumPackage\\chromedriver.exe");
		WebDriver Driver = new ChromeDriver();
		String url = "https://www.flipkart.com/";
		Driver.get(url);
		Driver.manage().window().maximize();
		Driver.findElement(By.xpath("//button[text()='✕']")).click();
		WebElement search = Driver.findElement(By.xpath("//input[@type='text']"));
		search.sendKeys("LGTV",Keys.ENTER);
		
		List<WebElement> Tv = Driver.findElements(By.xpath("//div[contains(text(),'LG')]"));
		int size = Tv.size();
		for(int i=0;i<size;i++) {
			WebElement Tvnames = Tv.get(i);
			String Tvnameslist = Tvnames.getText();
			System.out.println(Tvnameslist);	
		
		
		
		
	}
	}
}
	
	
	
	
	
	
	
	


