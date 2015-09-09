package practice.one.script;

import java.io.File;
import java.util.HashMap;

public class HasmapFile {

	public static void main(String[] args) {
		
		
		
	}
	
	public void searchFile(File file, String fileName)
	{
		HashMap<String, String> hm = new HashMap<String , String >();
		File[] list = file.listFiles();
		File[] cfile;
		if(list!=null){
	        for (File fil : list){
	        	System.out.println(fil.getName());
		            if (fil.isDirectory()){
		            	searchFile(fil, fileName);
		            }
		            else{
		            	mapKeyValue(fil.getName(), fil.getAbsolutePath());
		            }
		    }
		}
	}
	
	public HashMap<String, String> mapKeyValue(String fileName, String filePath){
		HashMap<String, String> hm = null ;
		hm.put(fileName, filePath);	
		return hm;
	}
}
