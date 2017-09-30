package Hackerearth;

import java.util.Scanner;

public class RoyProfilepic {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int L = s.nextInt();
		int width, height;
		int num = s.nextInt();
		for (int i = 1; i <= num; i++) {
			width = s.nextInt();
			height = s.nextInt();
			if (width >= L && height >= L) {
				if (width == height) {
					System.out.println("ACCEPTED");
				} else {
					System.out.println("CROP IT");
				}
			} else if (width < L || height < L) {

				System.out.println("UPLAOD ANOTHER");
			}
		}
	}
}
