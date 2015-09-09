package practice.one.script;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class RightClick {
	
	
	@Test
	public void Test()
	{
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://oes1.qa.remedyint.com/app/index.cfm?company_id=2A070B52-B026-11D4-A03F0050DAC475AF");
		WebElement ele = driver.findElement(By.id("AssignNewPasswordModal"));
		
		Actions action = new Actions(driver);		
		action.contextClick(ele).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
	}

}
