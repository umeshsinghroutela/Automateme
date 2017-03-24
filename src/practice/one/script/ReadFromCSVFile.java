package practice.one.script;

import java.io.FileReader;
import java.util.Iterator;
import java.util.List;

import com.opencsv.CSVReader;

public class ReadFromCSVFile 
{
	public static void main(String[] args) 
	{
		
		List<String[]> data;
		
		try {
			
			CSVReader myFile = new CSVReader(new FileReader("C:/Users/umesh/Desktop/TestFile.csv"));
			data =myFile.readAll();
			Iterator<String[]> it = data.iterator();
			
			while(it.hasNext())
			{
				 String[] fileData = it.next();
				 
				for (int j = 0; j < fileData.length; j++) {				
				
					 System.out.println(fileData[j]);
					 
				 }
				
				
			}
			myFile.close();
		}
		catch (Exception e) 
		{
			
			System.out.println(e.getMessage());
		
		}
		
		
	}


}
