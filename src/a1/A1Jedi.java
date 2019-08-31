package a1;

import java.util.Arrays;
import java.util.Scanner;

public class A1Jedi {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		int items = scan.nextInt();
		String[] food = new String[items];
		double[] price = new double[items];
		int[] amount = new int[items];
		int[] totalcustomers = new int[items];
		
		for (int i=0; i<items; i++) {
			food[i] = scan.next();
			price[i] = scan.nextDouble();
		}
	
		int customer = scan.nextInt();
		String[] first = new String[customer];
		String[] last = new String[customer];
		double[] vfinal = new double[customer];
	
		
		for (int i=0; i<customer; i++) {
			first[i] = scan.next();
			last[i] = scan.next();
			int bought = scan.nextInt();

			int[] howmuch = new int[bought];
			String[] produce = new String[bought];
		
			
			for (int j=0; j<bought; j++) {
				howmuch[j] = scan.nextInt();
				produce[j] = scan.next();
				
				for (int k=0; k<food.length; k++) {
					if (produce[j].equals(food[k])) {
						amount[k] += howmuch[j];
						
						totalcustomers[k] += 1;
						
						for (int l=0; l<produce.length; l++) {
							if (produce[j].equals(produce[l]) && j!=l) {
								totalcustomers[k] -= 1;
								/* if found repeating items, subtract 1 from totalcustomers then stops
								process so if item shows up again, won't keep subtracting
								*/ break;
							}
						}
						
					
					}
				}
			}
		} scan.close();
		
		for (int i=0; i<food.length; i++) {
			if (amount[i] == 0) {
				System.out.println("No customers bought " + food[i]);
			} else System.out.println(totalcustomers[i] + " customers bought " + amount[i] + " " + food[i]);
		}
	}
}
