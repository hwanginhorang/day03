package for_;

public class TestClass03 {
	public static void main(String[] args) {
		/*
		for(  ; ; ) {
			System.out.println("test");
		}
		*/
		int i = 0;
		for(  ; i<10 ; i++) {
			System.out.println("test");
		}
		
		i = 0;
		for(  ; ; ) {
			System.out.println("na");
			if(i >= 10)
				break;
			i++;
		}
	}
}
