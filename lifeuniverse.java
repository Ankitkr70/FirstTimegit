package Hackerearth;

import java.util.Scanner;

public class lifeuniverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n;
		for(int i =1; i<100;i++){
			n = scn.nextInt();
			if(n!=42){
				System.out.println(n);
			}else{
				break;
			}
		}
	}

}
