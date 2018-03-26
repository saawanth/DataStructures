//https://www.youtube.com/watch?v=Sny9Rta3k_Q
package problemsolving;

import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		for(int i=1; i <=6 ; i++) {
			for(int j=1; j<=i ; j++) {
				System.out.print(j);
			}
			for(int j=6; j>i ; j--) { 
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("===========================");
		
		for(int i=6; i >=1 ; i--) {
			for(int j=1; j<i ; j++) {
				System.out.print(j);
			}
			for(int k=6; k>=i ; k--) {
				System.out.print("&");
			}
			System.out.println();
		}
       
		System.out.println("===========================");
		
		
		System.out.println("@");
		for(int i=5; i >=1 ; i--) {
			System.out.print("@");
			for(int j=5; j>=i ; j--) {
				System.out.print(" ");
			}
			System.out.println("@");
		}
		for(int j=5; j>0 ; j--) {
			System.out.print("@ ");
		}
		
		System.out.println(" ");
		System.out.println("===========================");
		
		for (int a=1, b=10, c=11, d=20, e =21, f=30; a<=10; a++,b--,c++,d--,e++,f--) {
			System.out.println(a+ " " +b+ " " +c+ " " +d+ " " +e+ " ");
		}
		
		
		System.out.println("===========================");
		
//		Scanner sc = new Scanner(System.in);
//	    System.out.print("Rows: ");
//		int rows = sc.nextInt();
//		System.out.print("Col: ");
//		int col = sc.nextInt();
//		if(rows <= 0 || col <= 0) {
//			// print error
//		} else {
//			for(int i = 1; i <= rows; i++) {
//				for(int j = 1; j <= col; j++) {
//					System.out.print("B");
//				}
//				System.out.println();
//			}
//		}
		
//		System.out.println("===========================");
//		
//		Scanner sc = new Scanner(System.in);
//		int i = 2, small = 0, large = 0;
//		
//		System.out.print("Num 1: ");
//		int a = sc.nextInt();
//		small = a;
//		large = a;
//		
//		while(i <= 10) {
//			System.out.print("Num " + i + ": ");
//			int b =sc.nextInt();
//			if(b < small) {
//				small = b;
//			}
//			if(b > large) {
//				large = b;
//			}
//			
//			i++;
//		}
//
//     	System.out.print("Larger: " + large + "    Smaller: " + small);
		
		System.out.println("       #");
		for( int i=6; i>=1; i--) {
			for (int j=1; j<i ; j++) {
				System.out.print(" ");
			}
			System.out.print("#");
			for( int k=6; k>=i; k--) {
				System.out.print(" ");
			}
			for( int k=6; k>=i; k--) {
				System.out.print(" ");
			}
			
			System.out.print("#");
			System.out.println();
			
		}
		for( int k=8; k>=1; k--) {
			System.out.print("# ");
		}
	}
		
}


