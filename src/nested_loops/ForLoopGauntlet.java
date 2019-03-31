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
}}
