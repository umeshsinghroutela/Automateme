package practice.one.script;

public class SingleTonClass
{
	private static SingleTonClass instance = null;
	
	private SingleTonClass() {
		System.out.println("Hello This is new method");
	}
   
	public static SingleTonClass getInstance() {
      if(instance == null) {
         instance = new SingleTonClass();
         
      }
      return instance;
      
	}
	
	
}

