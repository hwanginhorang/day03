package switch_;

import java.util.Scanner;

public class Practice02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String a=null, b=null;
		int num;
		
		while(true) {
			System.out.println("1.우리집 등록");
			System.out.println("2.회사 등록");
			System.out.println("3.등록 보기");
			num = scan.nextInt();
			
			switch(num) {
			case 1: System.out.println("우리집 등록: ");
			a = scan.next(); 
			System.out.println("등록성공");break;
			
			case 2: System.out.println("회사 등록: ");
			b = scan.next(); 
			System.out.println("등록성공");break;
			
			case 3: System.out.println("우리집: "+a);
			System.out.println("회사: "+b); 
			}
			if(num == 3) {
				break;
			}
		}
	}
}
