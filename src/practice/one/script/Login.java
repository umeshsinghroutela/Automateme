package practice.one.script;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import autoitx4java.AutoItX;

import com.jacob.com.LibraryLoader;

public class Login 
{

	
		public static void main(String[] args) throws InterruptedException {
			 String jacobDllVersionToUse;
			 if (System.getProperty("sun.arch.data.model").contains("32")){
			 jacobDllVersionToUse = "jacob-1.18-x86.dll";
			 }
			 else {
			 jacobDllVersionToUse = "jacob-1.18-x64.dll";
			 }
			 
			 File file = new File("F:\\Automation JHA project\\Automation\\lib", jacobDllVersionToUse);
			 System.setProperty(LibraryLoader.JACOB_DLL_PATH, file.getAbsolutePath());
						   
			 WebDriver driver = new FirefoxDriver();
			 driver.get("http://www.qavalidation.com/p/demo.html");
			 driver.findElement(By.name("datafile")).click();
			 Thread.sleep(1000);
			  
			 AutoItX x = new AutoItX();
			 x.winActivate("File Upload"); //File Upload, title of windows UI
			 x.ControlSetText("File Upload", "", "1148", "C:\\Users\\umesh\\Desktop\\Screenshots\\Test Image.png"); //Textbox for path, id is 1148
			 x.controlClick("File Upload", "", "1") ; //Open button, id is 1
	
			 
			 }
}

