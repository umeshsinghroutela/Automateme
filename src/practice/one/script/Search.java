package practice.one.script;

import java.io.File;

public class Search
{	
	public static void main(String[] args) {
		 File file = new File(System.getProperty("user.dir"));
		 String fileName = "TestData.xls";
		 
		 System.out.println(searchFile(file, fileName, null));
	}
	
	static String searchFile(File dir, String name, String foundFilePath){
		String temp = null;
			File[] files = dir.listFiles();
			for(File f : files){
	            if (f.isDirectory())
	            	if((temp = searchFile(f, name, foundFilePath )) == null)
	            		continue;
	            	else{
	            		foundFilePath = temp;
	            		break;
	            	}
	            else
	            	if ( name.equalsIgnoreCase(f.getName()))
	            		foundFilePath = f.getAbsolutePath();
			}
			return foundFilePath;
	}
	
}


