package practice.one.script;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.WebElement;

public class SortTest 
{
	
	public static void main(String[] args)
	{
		String[] elementList = {"Umesh", "Ganesh", "Naveen" , "Digar", "Parwati"};
		List<String> sortedData = sortListWebelements(elementList);
		
		for (String string : sortedData)
		{
			System.out.println(string);
		}
	}

	
	
	public static List<String> sortListWebelements(String[] elementList)
	{
		List<String> data = new ArrayList<String>();
		
		if(elementList != null)
		{			
			for (String element	: elementList) 
			{
				data.add(element);
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
			return data;
		}
		
	}
}
