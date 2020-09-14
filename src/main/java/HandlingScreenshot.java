import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingScreenshot {
	 
	static WebDriver driver;
public static void main(String[] args) throws IOException, InterruptedException {
	
	 driver = new FirefoxDriver();
	 driver.get("https://pankajsiracademy.com/");
	 Thread.sleep(5000);
	 takeScreenshot("PankajAcademyLoginPage");
	 
	
}
public static void takeScreenshot(String FileName) throws IOException {
	File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(srcFile, new File("D:\\Automation\\Screenshots\\Images\\"+FileName+".jpg"));
	
	
}
}