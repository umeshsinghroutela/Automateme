package practice.one.script;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;



public class DemoSikul {

	public static void main(String[] args) throws FindFailed, InterruptedException 
	{
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30000, TimeUnit.SECONDS);
		driver.get("https://accounts.google.com/ServiceLogin?service=mail&passive=true&rm=false&continue=https:"
				+ "//mail.google.com/mail/&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1#identifier");
		
		Screen screen =  new Screen();
		
		System.out.println("about to click");


		screen.click("F:/Automation JHA project/Experimenting/image/username.png",10);
		screen.type("umeshroutela.singh@gmail.com");
		screen.click("F:/Automation JHA project/Experimenting/image/next.png",10);

		screen.click("F:/Automation JHA project/Experimenting/image/password.png",10);
		screen.type("umeshroutela.singh@gmail.com");

		screen.click("F:/Automation JHA project/Experimenting/image/signin.png",10);

		
		}

}