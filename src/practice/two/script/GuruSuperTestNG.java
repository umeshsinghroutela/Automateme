package practice.two.script;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class GuruSuperTestNG 
{
	public static WebDriver driver;


	@BeforeClass
	public void initiateBrowser()
	{
		System.setProperty("webdriver.gecko.driver","C:/Users/UMESHROUTELA/git/Automateme/exe/geckodriver.exe");
		driver = new FirefoxDriver();
		//		driver.manage().window().maximize();
		driver.get("http://live.guru99.com");	
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}

	@AfterClass
	public void terminateBrowser()
	{
		driver.quit();
	}

	public static WebDriver getDriver()
	{
		return driver;
	}

}
