package practice.java.programe;

public class Aanagram {

	
	public static void main(String[] args) {
		
		System.out.println(isAnagram("java", "vaJa"));
		
	}
	
	public static boolean isAnagram(String s, String t) {
	    if(s==null || t==null)
	        return false;
	 
	    if(s.length()!=t.length())
	        return false;
	 
	    s = s.toLowerCase();
	    t = t.toLowerCase();
	    int[] arr = new int[26];
	    for(int i=0; i<s.length(); i++){
	        arr[s.charAt(i)-'a']++;
	        arr[t.charAt(i)-'a']--;
	    }
	 
	    for(int i: arr){
	        if(i!=0)
	            return false;
	    }
	 
	    return true;
	}
}
