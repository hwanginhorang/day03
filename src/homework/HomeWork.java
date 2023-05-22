package homework;

import java.util.Scanner;

public class HomeWork {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int i, j;
		System.out.println("단: ");
		i = scan.nextInt();
		
		
		for(j=1; j<10; j++) {
			System.out.println(i+"X"+j+"="+i*j);
		}
	}
}
