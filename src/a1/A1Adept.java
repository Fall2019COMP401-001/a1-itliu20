package a1;

import java.util.Arrays;
import java.util.Scanner;

public class A1Adept {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		int items = scan.nextInt();
		String[] food = new String[items];
		double[] price = new double[items];
		
		for (int i=0; i<items; i++) {
			food[i] = scan.next();
			price[i] = scan.nextDouble();
		}
	
		int customer = scan.nextInt();
		String[] first = new String[customer];
		String[] last = new String[customer];
		double[] vfinal = new double[customer];
		int[] totalbought = new int[customer];
		
		for (int i=0; i<customer; i++) {
			first[i] = scan.next();
			last[i] = scan.next();
			int bought = scan.nextInt();
			totalbought[i] = bought;
			
			int[] howmuch = new int[bought];
			String[] produce = new String[bought];
			double[] total = new double[bought];
			
			for (int j=0; j<bought; j++) {
				howmuch[j] = scan.nextInt();
				produce[j] = scan.next();
				
				
				//problem here
				for (int k=0; k<food.length-1; k++) {
					if (produce[j] == food[k]) {
						System.out.println(food[k]);
						total[j] = (howmuch[j]) * (price[k]);
					}
				
			}
		}
			
		double sum = calculateValueSum(total);
		vfinal[i] = sum;
		System.out.println(Arrays.toString(total));
	}
		scan.close();
		
		
		double min = findValueMin(vfinal);
		double max = findValueMax(vfinal);
		
		for (int i=0; i<vfinal.length; i++) {
			if (max == vfinal[i]) {
				System.out.println("Biggest: " + first[i] + " " + last[i] + 
						" (" + String.format("%.2f",max) + ")");
				
			}
		}
		for (int i=0; i<vfinal.length; i++) {
			if (min == vfinal[i]) {
				System.out.println("Smallest: " + first[i] + " " + last[i] + 
						" (" + String.format("%.2f", min) + ")");
			}
		}
		double avg = (calculateValueSum(vfinal)) / (calculateSum(totalbought));
		System.out.println("Average: " + String.format("%.2f", avg));
		
}
	
	//looked at a1 example for help on min sum and max
	static double findValueMin(double[] vals) {
		double cur_min = vals[0];
		
		for (int i=1; i < vals.length; i++) {
			if (vals[i] < cur_min) {
				cur_min = vals[i];
			}
		}
		return cur_min;
	}
	
	static double findValueMax(double[] vals) {
		double cur_max = vals[0];
		
		for (int i=1; i < vals.length; i++) {
			if (vals[i] > cur_max) {
				cur_max = vals[i];
			}
		}
		return cur_max;
	}
	
	static double calculateValueSum(double[] vals) {
		double sum = 0;
		for (int i=0; i<vals.length; i++) {
			sum += vals[i];
		}
		return sum;
	}
	static int calculateSum(int[] vals) {
		int sum = 0;
		for (int i=0; i<vals.length; i++) {
			sum += vals[i];
		}
		return sum;
	}
}
