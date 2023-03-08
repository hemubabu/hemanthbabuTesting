package com.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.baseclass.CommonActions;

public class FramesPractice {
	public static void main(String[] args)  {
		CommonActions C  = new CommonActions();
		C.launch("https://chercher.tech/practice/frames-example-selenium-webdriver");
		C.Driver.switchTo().frame(0);
		WebElement input = C.Driver.findElement(By.xpath("//b[@id='topic']/following-sibling::input"));
		input.sendKeys("Hemanth");
		C.Driver.switchTo().frame("frame3");
		WebElement input2 = C.Driver.findElement(By.xpath("//input[@type='checkbox']"));
		input2.click();
	}

}
