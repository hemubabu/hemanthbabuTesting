package com.Tv;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LgTv {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HEMU\\eclipse-workspace2\\SeleniumConcept\\Driver&SeleniumPackage\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		WebElement search = driver.findElement(By.xpath("//input[@type='text']"));
		search.sendKeys("LGTV",Keys.ENTER);
		Thread.sleep(3000);

	
		List<WebElement> Tv = driver.findElements(By.xpath("//div[contains(text(),'LG')]"));
		Thread.sleep(3000);
		int size = Tv.size();
		System.out.println(size);
		
		for(int i=1;i<17;i++) {
			WebElement Tvnames = Tv.get(i);
			
			String Tvnameslist = Tvnames.getText();
			System.out.println(Tvnameslist);	
		}		
	
	}		
		


	

}
