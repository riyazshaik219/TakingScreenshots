package com.qa.seleniuAlphaFeature;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlphaFeature {

	static WebDriver driver;
	
	public static void main(String[] args) throws IOException {
	
		driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		
		WebElement email = driver.findElement(By.id("email"));
		WebElement password = driver.findElement(By.id("pass"));
		WebElement login = driver.findElement(By.name("login"));
		
		takeScreenshot(email,"EmailElement");
		takeScreenshot(password,"PasswordElement");
		takeScreenshot(login,"Button");
		driver.quit();
		
	}
		public static void takeScreenshot(WebElement element,String fileName) throws IOException {
			
		
		File src=element.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("D:\\Automation\\Screenshots\\Images\\"+fileName+".jpg"));
		

	}

}
