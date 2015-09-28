package practice.one.script;

public class SingletonClassDemo {
	
   public static void main(String[] args) {
	   SingleTonClass tmp = SingleTonClass.getInstance( );
	   tmp.getInstance();
	   
	   SingleTonClass tmp1 = SingleTonClass.getInstance( );
	   tmp.getInstance();
	  }
   
   
   
   
   
}


