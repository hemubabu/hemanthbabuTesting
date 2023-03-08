package com.practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.baseclass.CommonActions;

public class DropdownPractice extends CommonActions {
	public static void main(String[] args) throws InterruptedException  {
		CommonActions C = new CommonActions();
		C.launch("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
		WebElement dropdown = C.Driver.findElement(By.xpath("//select[@id='first']"));
		Thread.sleep(3000);
		Select S = new Select(dropdown);
		S.selectByIndex(1);
		List<WebElement> options = S.getOptions();	
		int size=options.size();
		System.out.println(size);
		for(WebElement X:options) {
			String opt = X.getText();
			System.out.println(opt);
		}
		WebElement multipledropdown = C.Driver.findElement(By.xpath("//select[@id='second']"));
		Select s1 = new Select(multipledropdown);
		boolean multiple = s1.isMultiple();
		System.out.println(multiple);
		s1.selectByIndex(1);
		Thread.sleep(1000);

		s1.selectByValue("pizza");
		Thread.sleep(1000);

		s1.selectByVisibleText("Burger");
		WebElement firstSelectedOption = s1.getFirstSelectedOption();
		System.out.println(firstSelectedOption.getText());
		List<WebElement> allSelectedOptions = s1.getAllSelectedOptions();
		for(WebElement M:allSelectedOptions) {
			System.out.println(M.getText());
			if(M.getText().equals("Burger")) {
				System.out.println("Success");
			}
		}
	}

}
