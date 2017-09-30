package Hackerearth;

import java.util.Scanner;

public class productofarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		long ans =1;
		int[] arr = new int[size];
		for(int i=0;i<arr.length;i++){
			int data = s.nextInt();
			arr[i] = data;
			
			
		}
		
		System.out.println();
		for(int i =0; i<arr.length;i++){
			ans = (long)((ans*arr[i])%(Math.pow(10,9)+7));
		}
		System.out.println(ans);

	}

}
