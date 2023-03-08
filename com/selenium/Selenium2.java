package com.selenium;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HEMU\\eclipse-workspace2\\SeleniumConcept\\Driver&SeleniumPackage\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url ="https://www.flipkart.com/";
		driver.navigate().to(url);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		WebElement search = driver.findElement(By.xpath("//input[@type='text']"));		
		search.sendKeys("redmi",Keys.ENTER);
		Thread.sleep(3000);
		List<WebElement> Mi = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
		for(int i=0;i<Mi.size();i++) {
			WebElement Mobiles = Mi.get(i);
			String RedmiList = Mobiles.getText();
			System.out.println(RedmiList);
		}
		// Windows Handle
		
//		driver.findElement(By.xpath("(//div[@class='_4rR01T'])[1]")).click();
//		String ParentWindow = driver.getWindowHandle();
//		Set<String> ChildWindows = driver.getWindowHandles();
//		for(String x:ChildWindows) {
//			if(!x.equals(ParentWindow)) {
//				driver.switchTo().window(x);
//
//			
//		}	
//		}
//			
//			driver.findElement(By.xpath("//button[text()='ADD TO CART']")).click();
		

		
		
	}
	

}
