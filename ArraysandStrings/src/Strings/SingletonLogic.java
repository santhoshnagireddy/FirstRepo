package Strings;

import java.util.HashSet;
import java.util.Set;

public class SingletonLogic {
  private static  SingletonLogic b=null;
  
  private SingletonLogic() {
	  
  }
	public synchronized static  SingletonLogic add() {
		if(b==null) {
			b=new SingletonLogic();
		}
		else {
			return b;
			
		}
		return b;
	}
		public static void main(String[] args) {
              SingletonLogic a1=b.add();
              SingletonLogic a2=b.add();
			System.out.println(a1);
			System.out.println(a2);

		}
}
