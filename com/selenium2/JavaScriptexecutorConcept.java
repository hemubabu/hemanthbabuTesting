package com.selenium2;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptexecutorConcept {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HEMU\\eclipse-workspace2\\SeleniumConcept\\Driver&SeleniumPackage\\chromedriver.exe");
		WebDriver Driver = new ChromeDriver();
		String url = "https://www.flipkart.com/";
		Driver.get(url);
		Driver.manage().window().maximize();
		String title = Driver.getTitle();
		WebElement close = Driver.findElement(By.xpath("//button[text()='✕']"));
		JavascriptExecutor js = (JavascriptExecutor)Driver;
		js.executeScript("arguments[0].click()",close);
		WebElement search = Driver.findElement(By.name("q"));
		js.executeScript("arguments[0].setAttribute('value','redmi')",search);
		Thread.sleep(3000);
		WebElement down = Driver.findElement(By.xpath("//a[text()='Contact Us']"));
		WebElement up = Driver.findElement(By.xpath("//div[text()='Top Offers']"));
		js.executeScript("arguments[0].scrollIntoView(true)",down);
		Thread.sleep(3000);
		js.executeScript("arguments[0].scrollIntoView(false)",up);
		Object text = js.executeScript("return arguments[0].getAttribute('value')",search);
		System.out.println(text);
				
		
		
		
		
	}
}
	
	
	
	
	
	
	
	


