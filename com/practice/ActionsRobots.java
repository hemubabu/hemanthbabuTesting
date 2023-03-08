package com.practice;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.baseclass.CommonActions;

public class ActionsRobots  {
	public static void main(String[] args) throws Exception{
		CommonActions C = new CommonActions();
		C.launch("https://www.facebook.com/");
		Actions A = new Actions(C.Driver);
		WebElement username = C.Driver.findElement(By.id("email"));
		username.sendKeys("Hemanth");
		A.doubleClick(username).contextClick(username).build().perform();
		Robot R = new Robot();
		for(int i=0;i<2;i++) {
		R.keyPress(KeyEvent.VK_DOWN);	
		R.keyRelease(KeyEvent.VK_DOWN);
		}
		Thread.sleep(3000);
		R.keyPress(KeyEvent.VK_ENTER);	
		R.keyRelease(KeyEvent.VK_ENTER);
		R.keyPress(KeyEvent.VK_TAB);	
		R.keyRelease(KeyEvent.VK_TAB);
		WebElement password=C.Driver.findElement(By.id("pass"));
		R.keyPress(KeyEvent.VK_CONTROL);
		R.keyPress(KeyEvent.VK_V);
		R.keyRelease(KeyEvent.VK_CONTROL);
		R.keyRelease(KeyEvent.VK_V);
		String text = password.getText();
		System.out.println(text);
		boolean check = text.equals("Hemanth");
		System.out.println(check);
		
	}

}
