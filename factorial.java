package Hackerearth;

import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		
	        Scanner scn = new Scanner(System.in);
	        int n = scn.nextInt();
	        int fac = 1;
	        for(int i=1;i<=n;i++){
	            fac = fac*i;
	        }
	        System.out.print(fac);
	}

	

}
