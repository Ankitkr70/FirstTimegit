package Hackerearth;

import java.util.Scanner;

public class countdivisor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int i = scn.nextInt();
		int j = scn.nextInt();
		int k = scn.nextInt();
		int count = 0;
		for(int a =i; a<=j;a++){
			if(a%k == 0){
				count++;
			}
		}
		System.out.println(count);
	}

}
