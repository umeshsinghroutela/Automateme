package practice.one.script;
//Only One instance of Class is returned 
public class SingletonClassDemo {
	
	
   public static void main(String[] args) {
	   SingleTonClass tmp = SingleTonClass.getInstance( );
	   System.out.println(tmp.getInstance());
	   
	   SingleTonClass tmp1 = SingleTonClass.getInstance( );
	   System.out.println(tmp1.getInstance());
	  }
   
}

//Oputput
//Hello This is new method
//practice.one.script.SingleTonClass@15db9742
//practice.one.script.SingleTonClass@15db9742



