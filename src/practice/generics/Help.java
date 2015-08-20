package practice.generics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.WebElement;

public class Help 
{
	public static List<String> sortListWebelements(List<WebElement> elementList)
	{
		List<String> data = new ArrayList<String>();
		
		if(elementList != null)
		{			
			for (WebElement element	: elementList) 
			{
				data.add(element.getText());
			}
			
			Collections.sort(data);
			for (String string : data) 
			{	
				System.out.println(string);
			}
			return data;
		}
		else
		{
			data.add("Failed");
			return data;
		}
	}

	public static List<String> convertElementListToArray(List<WebElement> elementList)
	{
		List<String> data = new ArrayList<String>();
		
		if(elementList != null)
		{			
			for (WebElement element	: elementList) 
			{
				data.add(element.getText());
			}
			
			for (String string : data) 
			{	
				System.out.println(string);
			}
			return data;
		
		}
		else
		{
			return data;
		}
	}

}
