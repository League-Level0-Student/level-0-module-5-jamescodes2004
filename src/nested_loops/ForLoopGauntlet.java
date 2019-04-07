package nested_loops;

import javax.swing.JOptionPane;

public class ForLoopGauntlet {
public static void main(String[] args) {
	for(int i = 0; i<100; i++) {
		System.out.println(i+1);


		}
		for(int l = 0; l<100; l++) {
			System.out.println(java.lang.Math.abs(l-100));
		}
		for(int j = 0; j<100; j++) {
			if(j%2==0 && j!=0) {
				System.out.println(j);
		}
	}
		for(int h = 0; h<100; h++) {
			if(h%2!=0) {
			System.out.println(h);
			}
			}
		for(int m = 0; m<500; m++) {
			if(m%2!=0) {
				System.out.println(m+1 + " is even");
			}
			if(m%2==0) {
				System.out.println(m+1 +" is odd");
			}
		}
		for(int y=0;y<778;y++) {
			if (y%7==0 && y/7!=0) {
				System.out.println(y);
			}
		}
		int year = 2004;
		for(int a=0; a< 14; a++) {
			
			System.out.println("In "  + year++ +" I was "+ a +" years old." );
		}
		for(int i=0; i<3; i++) {
		for(int j=0; j<3; j++) {
			System.out.println(i+" "+j);
		}
		
		}
		System.out.println("- - - - - - - - - - -");
		for(int i=0; i<9; i+=3) {
		for(int j=1; j<4; j++) {
		System.out.print(i+ j+" ");}
		System.out.println();
		}
		System.out.println("- - - - - - - - - - -");
		int[] row = new int[11];
		for(int i=0; i<=9; i++) {
		for(int j=1; j<=10; j++) {
			row[j] = (10*i)+j; 
			System.out.print(row[j] + " "); }
		System.out.println();
		}
		System.out.println("- - - - - - - - - - -");
		for(int i=0; i<100; i+=10) {
		for(int j=1; j<11; j++) {
		System.out.print(i+ j+" ");}
		System.out.println();
		}
		System.out.println("- - - - - - - - - - -");
		for(int i=1; i<8; i++) {
		for(int j=0; j<i; j++) {
		System.out.print("*"+ " ");}
		System.out.println();}
}}
