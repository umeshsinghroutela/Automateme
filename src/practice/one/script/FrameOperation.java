package practice.one.script;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class FrameOperation {
	
	public static void main(String[] args) 
	{
	
		WebDriver driver = new FirefoxDriver();	
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);		
		driver.get("http://www.barnesandnoble.com");
		driver.findElement(By.id("signInLink")).click();
		driver.switchTo().frame(driver.findElement(By.xpath("//div/iframe"))); 
		driver.findElement(By.id("createAccountBtn")).click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame(4);
		driver.findElement(By.xpath("//input[@value='Create Account']")).click();
		
		
		
	
	}
	

}
