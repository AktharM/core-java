package com.xworkx.programs;

public class Pattern5 {
public static void main(String[] args) {
	for(int row=1; row<=4; row++) {
		for(int col=1; col<=4;col++) {
			if(col==1|| row==1|| row==4) {
				System.out.print(" #");
			}else {
				System.out.print(" ");
			}
			
		}
		System.out.println();
	}
	
}
}
