package practice.two.script;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import practice.pom.GuruHomePage;
import practice.pom.MobilePage;

@Listeners(practice.generics.ScreenshotListener.class)
public class GuruTestCase1 extends GuruSuperTestNG 
{
	@Test
	public void verifyHomePage()
	{
		//Validating title of the page
		String exp_title = "THIS IS DEMO SITE";
		String act_title = new GuruHomePage(driver).getHomePageTitle();
		
		Assert.assertEquals(act_title.contains(exp_title), true , "FAILED" ); 
		//expected : '"+exp_title+"' Found '" +act_title+"'"
	}
	
	@Test
	public void verifyMobilePage()
	{
		String exp_title = "MOBILE";
		MobilePage mobilePage = new GuruHomePage(driver).mobileMenu();
		
		String act_title= mobilePage.getMobilePagetitle();
		
		Assert.assertEquals(act_title, exp_title);
	}
	
	@Test
	public void verifyMobileSortByName()
	{
		MobilePage mobile = new MobilePage(driver);
		mobile.sortMobileBy("Name");
		mobile.verifyMobileSortBy("Name");		
	}

}
