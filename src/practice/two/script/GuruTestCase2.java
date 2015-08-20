package practice.two.script;

import org.testng.annotations.Test;

import practice.pom.MobilePage;

public class GuruTestCase2 extends GuruSuperTestNG
{
	@Test
	public void addItemToCart()
	{
		MobilePage mobilePage = new MobilePage(driver).mobileMenu();
		mobilePage.addToCartItemByName("SONY XPERIA");
	}

}
