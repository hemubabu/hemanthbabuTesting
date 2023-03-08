package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DriverLaunching {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HEMU\\eclipse-workspace2\\SeleniumConcept\\Driver&SeleniumPackage\\Driver\\chromedriver.exe");
		WebDriver Driver = new ChromeDriver();
//		String url = "https://www.flipkart.com/";
//		Driver.get(url);
//		Driver.manage().window().maximize();
//		String Curl= Driver.getCurrentUrl();
//		System.out.println(Curl);
//		boolean equals = Curl.equals(url);
//		System.out.println(equals);
//		String title = Driver.getTitle(); // tab text
//		System.out.println(title);
//		Driver.findElement(By.xpath("//button[text()='✕']")).click();
//		WebElement search = Driver.findElement(By.xpath("//input[@type='text']"));
//		search.sendKeys("redmi",Keys.ENTER);
//		Driver.quit();
//		String url2 = "https://www.youtube.com/");
//		Driver.get(url2);
//		Driver.manage().window().maximize();
//		WebElement Y = Driver.findElement(By.xpath("//input[@type='text']"));
//		Y.sendKeys("thenmozhi");
//		Driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
//		WebElement then = Driver.findElement(By.xpath("(//yt-formatted-string[contains(text(),'Thenmozhi')])[1]"));
//		then.click();

//		Actions A = new Actions(Driver);
//		
//		A.moveToElement(login).perform();
		String url3 = "https://www.facebook.com/";
		Driver.get(url3);
		Driver.manage().window().maximize();
		WebElement FBtext = Driver.findElement(By.xpath("//h2[@class='_8eso']"));
		String text = FBtext.getText();
		System.out.println(text);
		String Attribute = FBtext.getAttribute("class");
		System.out.println(Attribute);
		String TabTitle = Driver.getTitle();
		System.out.println(TabTitle); 
		String CU = Driver.getCurrentUrl();
		System.out.println(CU);
		Driver.close();
		
		
		
		
		
		
	}

}
