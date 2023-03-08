package com.selenium2;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsDragDrop {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HEMU\\eclipse-workspace2\\SeleniumConcept\\Driver&SeleniumPackage\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		String url= "http://demo.guru99.com/test/drag_drop.html";
		driver.get(url);
		driver.manage().window().maximize();
		WebElement Drag1 = driver.findElement(By.xpath("//a[text()=' BANK ']"));
		WebElement Drop1 = driver.findElement(By.xpath("(//li[@class='placeholder'])"));
		WebElement Drag2 = driver.findElement(By.xpath("//a[text()=' 5000 ']"));	
		WebElement Drop2 = driver.findElement(By.xpath("//ol[@id='amt7']/li"));
		WebElement Drag3 = driver.findElement(By.xpath("//a[text()=' SALES ']"));
		WebElement Drop3 = driver.findElement(By.xpath("//ol[@id='loan']/li"));
		WebElement Drag4 = driver.findElement(By.xpath("//a[text()=' 5000']"));
		WebElement Drop4 = driver.findElement(By.xpath("//ol[@id='amt8']/li"));

		
	
		Actions A = new Actions(driver);
		A.dragAndDrop(Drag1, Drop1).perform();
		Thread.sleep(3000);
		A.dragAndDrop(Drag2, Drop2).perform();
		Thread.sleep(3000);
		A.dragAndDrop(Drag3, Drop3).perform();
		Thread.sleep(3000);
		A.dragAndDrop(Drag4, Drop4).perform();
		WebElement Ptext = driver.findElement(By.xpath("//a[text()='Perfect!']"));
		String text = Ptext.getText();
		System.out.println(text);


				
		
		
	}



}
