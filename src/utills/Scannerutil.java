package utills;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Scannerutil {
	private static Scanner scanner = new Scanner(System.in);
	
	public  static int scanInt() {
		int result = 0;
		boolean stop = false;
		while (stop == false) {
		try {
			result = scanner.nextInt();
			scanner.nextLine();
			stop = true;
		} catch (InputMismatchException e) {
			
			System.out.println("du lieu không phai so");
			scanner.nextLine();
		}
		}
		return result;
	}
}
