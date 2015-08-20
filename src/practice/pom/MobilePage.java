package practice.pom;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import practice.generics.Help;


public class MobilePage extends GuruHomePage
{
	private WebDriver driver;
	
	@FindBy( xpath = "//div[@class='page-title category-title']/h1")
	private WebElement mobilePageTitle;
	
	@FindBy( xpath = "(//div[@class='sort-by']/select)[position()=1]")
	private WebElement sortByDropDown;
	
	@FindBy( xpath = "//h2[@class='product-name']/a")
	private List<WebElement> mobileNames;
	
	@FindBy( xpath = "//button[@class='button btn-cart']")
	private List<WebElement> addToCartButon;
	
	
	public MobilePage(WebDriver driver) 
	{
		super(driver);
		PageFactory.initElements(driver, this);
		this.driver= driver;
		
	}	
	
	public String getMobilePagetitle()
	{
		return mobilePageTitle.getText();
		
	}
	
	public void sortMobileBy(String value) 
	{
		Select dropDown= new Select(sortByDropDown);
		dropDown.selectByVisibleText(value);
	}
	
	public void verifyMobileSortBy(String value)
	{
		
		if(value.matches("Name"))
		{
			List<String> actual = Help.sortListWebelements(mobileNames);
			List<String> expected = Help.convertElementListToArray(mobileNames);
	
			Assert.assertEquals(actual, expected);
		}		
		else if(value.matches("Position")) //NOT IMPLEMENTED
		{
			List<String> actual = Help.sortListWebelements(mobileNames);
			List<String> expected = Help.convertElementListToArray(mobileNames);
			Assert.assertEquals(actual, expected);
			
		}		
		else if(value.matches("Price")) //NOT IMPLEMENTED
		{
			List<String> actual = Help.sortListWebelements(mobileNames);
			List<String> expected = Help.convertElementListToArray(mobileNames);
			Assert.assertEquals(actual, expected);
			
		}		
		else
		{
			System.out.println("No Such Value in the sort");
			
		}
		
	}
	
	public void addToCartItemByName(String item)
	{
		int i=0;
		
		List<String> mobileList = Help.convertElementListToArray(mobileNames);
		
		while(i<=mobileList.size())
		{
			if(mobileList.get(i).equals(item))
			{				
				String addToCart = "(//button[@class='button btn-cart'])[position()="+(++i)+"]"; 
				System.out.println(addToCart);
				driver.findElement(By.xpath(addToCart)).click();
				break;
			
			}
			else
			{
				++i;				
			}
		}
		
	
	}
	
}
