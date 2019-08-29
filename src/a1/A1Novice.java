package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		
		int customers = scan.nextInt();
		String[] first = new String[customers];
		String[] last = new String[customers];
		double[] vfinal = new double[customers];
		
		for (int i=0; i<customers; i++) {
			first[i] = scan.next();
			last[i] = scan.next();
			int items = scan.nextInt();
			int[] amount = new int[items];
			String[] type = new String[items];
			double[] price = new double[items];
			double[] total = new double[items];
			
			for (int j=0; j<items; j++) {
				amount[j] = scan.nextInt();
				type[j] = scan.next();
				price[j] = scan.nextDouble();
				total[j] = amount[j] * price[j];
				}
			
			//looked at a1 example for help on sum
			double sum = calculateValueSum(total);
			vfinal[i] = sum;
			}
			scan.close();
			
			for (int k=0; k<customers; k++) {
				System.out.println(first[k].charAt(0) + ". " + last[k] + ": " + String.format("%.2f", vfinal[k]));
			}
			
		
		}
	//look at a1 example for help
	static double calculateValueSum(double[] multiply) {
		
		double sum = 0;
		
		for (int i=0; i<multiply.length; i++) {
			sum += multiply[i];
		}
		
		return sum;
	}
	
}