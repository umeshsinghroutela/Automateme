package practice.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import practice.generics.ScreenshotListener;

public class GuruHomePage extends ScreenshotListener
{
	private WebDriver driver;

	@FindBy( className = "page-title")
	private WebElement homePageTitle;

	@FindBy( className ="logo")
	private WebElement magnitoHome;
	
	@FindBy( xpath = "//div[@class='account-cart-wrapper']//span[text()='Account']")
	private WebElement accountLink;
	
	@FindBy( xpath = "//div[@class='header-minicart']/a")
	private WebElement cartLink;
	
	@FindBy( xpath = "//a[contains(.,'Mobile')]")
	private WebElement mobileMenuLink;
	
	public GuruHomePage(WebDriver driver) 
	{
		PageFactory.initElements(driver,this);
		this.driver = driver;
	}
	
	public String getHomePageTitle()
	{
		String homepageTitle = homePageTitle.getText();
		return homepageTitle;
		
	}
	
	public MobilePage mobileMenu()
	{
		mobileMenuLink.click();
		return new MobilePage(driver);
	}
	
}
