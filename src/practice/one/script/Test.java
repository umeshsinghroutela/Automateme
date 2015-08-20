package practice.one.script;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Test {
	
	public static void main(String[] args) {
		
		WebDriver driver = null;
		try 
		{
			DesiredCapabilities ffCap =  DesiredCapabilities.firefox();	
			ffCap.setPlatform(Platform.WINDOWS);
			ffCap.setBrowserName("firefox");
			ffCap.setVersion("39.0");	
			
			driver = new RemoteWebDriver(new URL("http://192.168.0.103:5556/wd/hub"),ffCap);		
			driver.get("https://www.google.co.in/webhp?sourceid=chrome-instant&ion=1&espv=2&ie=UTF-8");
			driver.manage().timeouts().implicitlyWait( 30, TimeUnit.SECONDS );
			driver.manage().window().maximize();
			
		} catch (MalformedURLException e) 
		{
//			e.printStackTrace();
			System.out.println("something wrong");
			System.out.println(e.getMessage());
		}
	
		
		
		
		WebElement input = driver.findElement(By.id("lst-ib"));
		
		input.sendKeys("WHAT ARE YOU DOING IN THIS COMPUTER----- ##  PANKAJ ## ");
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		input.clear();
		input.sendKeys("BYEEEEEEE HA HA HA !!!!!!!!!");
				
		driver.quit();
		
	}

}
