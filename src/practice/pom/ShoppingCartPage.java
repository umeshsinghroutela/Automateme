package practice.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCartPage extends GuruHomePage
{
	private WebDriver driver;
	
	@FindBy( xpath = "//div[@class='page-title title-buttons']/h1")
	private WebElement CartpageTitle;
	

	public ShoppingCartPage(WebDriver driver) 
	{
		super(driver);
		PageFactory.initElements(driver , this);
		this.driver = driver;
	}
	
	

}
