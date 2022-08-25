package com.bridgelabday1;

public class CommandLineArguments {

	public static void main(String args[]) {
		try {
			
		int x = Integer.parseInt(args[0]);
		int y = Integer.parseInt(args[1]);
		int sum = x + y;
		System.out.println("Sum of: "+sum);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("ram");
		}
	}
}
