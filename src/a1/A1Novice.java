package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		//Integers
		int count = scan.nextInt();
		int[] values = new int[count];
		
		for (int i=0; i<values.length; i++) {
			values[i] = scan.nextInt();
		}
		
		//Strings
		//String names = scan.next();
		String[] fullname = new String[2];
		
		for (int j=0; j<2; j++) {
			fullname[j] = scan.next();
		}
		
		//Doubles
		//double item = scan.nextDouble();
		double[] price = new double[values.length - 2];
		
		for (int k=0; k<price.length; k++) {
			price[k] = scan.nextDouble();
		}
		scan.close();
		
		double[] multiply = new double[price.length];
		
		for (int i=0; i<price.length; i++) {
			multiply[i] = price[i] * values[i+2];
		}
		
		double sum = calculateValueSum(multiply);
		
		for (int i=0; i<multiply.length; i++) {
		System.out.println(fullname[0].charAt(0) + ". " + fullname[1] + " " + sum);
		
		}
	}
	static double calculateValueSum(double[] multiply) {
		
		double sum = 0;
		
		for (int i=0; i<multiply.length; i++) {
			sum += multiply[i];
		}
		
		return sum;
	}
	
}