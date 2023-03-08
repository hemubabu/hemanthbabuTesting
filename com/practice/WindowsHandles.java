package com.practice;

import java.sql.Driver;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import com.baseclass.CommonActions;

public class WindowsHandles {

	public static void main(String[] args) throws InterruptedException {
		CommonActions C = new CommonActions();
		C.launch("https://www.flipkart.com/");
		C.closeButton();
		WebElement search = CommonActions.Driver.findElement(By.name("q"));
		C.waitConcept(search);
		search.sendKeys("redmi",Keys.ENTER);
		Thread.sleep(3000);
		C.Driver.findElement(By.xpath("(//div[contains(text(),'REDMI ')])[1]")).click();
		C.Driver.findElement(By.xpath("(//div[contains(text(),'REDMI ')])[2]")).click();
		C.Driver.findElement(By.xpath("(//div[contains(text(),'REDMI ')])[3]")).click();
		Thread.sleep(3000);
	//	String parent = C.Driver.getWindowHandle();
	//	System.out.println(parent);
		Set<String> child = C.Driver.getWindowHandles();
		
		List<String> l = new ArrayList<String>(child);
		String chi = l.get(1);
		
		C.Driver.switchTo().window(chi);

		
		

		//for (String X:child) {
		//	if (!parent.equals(child)) {
		//		C.Driver.switchTo().window(chi);
			}
		//}
		//C.Driver.findElement(By.xpath("//button[text()='Add to cart']")).click();
		
		
		
		
		
	}

