package application;

import java.util.Scanner;

import services.PrintService;

public class Program {
	
	public static void main(String[] agrs) {
		
		Scanner input = new Scanner(System.in);
		
		PrintService<Integer> ps = new PrintService<>();
		
		System.out.print("How many values? ");
		int value = input.nextInt();
		
		for (int i=1; i <= value; i++) {
			ps.addValue(input.nextInt());
		}
		
		try {
			System.out.println("First " + ps.first());
		} catch(IllegalStateException e) {
			System.out.println(e.getMessage());
		}
		
		ps.print();
		
		
		input.close();
	}
}
