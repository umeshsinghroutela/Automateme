package practice.one.script;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SubdropDown 
{
	public static void main(String[] args) 
	{
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		
		WebElement dropDown= driver.findElement(By.id("month"));
		Select select = new Select(dropDown);
		select.selectByVisibleText("Aug");
	}

		
	


}
