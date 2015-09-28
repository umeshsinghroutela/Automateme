//TAKE SCREENSHOT WHENEVER THE TEST FAILS
package practice.generics;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

import practice.two.script.GuruSuperTestNG;


public class ScreenshotListener extends TestListenerAdapter
{
	@Override
	public void onTestFailure(ITestResult tr)
	{
		System.out.println("***** TEST FAILED CAPTURING SCREENSHOTS......*****");
		super.onTestFailure(tr);
		String nameClass = tr.getClass().getSimpleName();
		String nameTest = tr.getMethod().getMethodName();
		takeScreenshot(nameClass, nameTest);
	}

	public void takeScreenshot(String nameClass, String nameTest)
	{
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd-HH_mm_ss");
//		System.out.println(sdf.format(date));
		
		try
		{	
			String dest = createFolderForScreenshotsCaptured() 
								+ nameClass + "-" + nameTest + "-" + sdf.format(date)
								+ "-screenshot.jpg";
			File screenshot = ((TakesScreenshot) GuruSuperTestNG.getDriver()).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(screenshot, new File( dest));
			System.out.println( "****** Screenshot destination is ******* : " +  dest );
		} 
		catch (Exception e)
		{
			System.out.println(" No screenshot taken : Browser not Found  ");
			e.printStackTrace();
		}
	}
	
	private String createFolderForScreenshotsCaptured() 
	{
		File newDir = new File( "Screenshots" );
		
		if (!newDir.exists()) 
		{
		    System.out.print( "creating directory........" );
		    boolean result = false;
		
			try
			{
				newDir.mkdir();
			    result = true;
			}
			catch(SecurityException se)
			{
			  System.out.println(" Failed to create New directory " ); 
			}        
		 
			if(result) 
			{    
				System.out.println( ".........  Directory created!!!!" );  
			}
			else
			{
				System.out.println( "Directory Already Exist" );
			}
		}
	
		String path = System.getProperty( "user.dir" ) + "\\" + "Screenshots" +  "\\";
		return path;
	  	
	}
}

