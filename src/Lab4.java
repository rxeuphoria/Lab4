import java.util.Scanner;

public class Lab4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scnr = new Scanner(System.in);
		System.out.println("Learn your squares and cubes!");
		String running;
		do {
			System.out.println("Please enter a number:");
		int userNum = scnr.nextInt();
		
		System.out.printf("%-10s | %-12s | %-12s\n", "Number", "Squared", "Cubed");
	    System.out.printf("-------------------------------------\n");
		for (int i = 1; i <= userNum; i++) {
			System.out.printf("%-10s | %-12s | %-12s\n",i, (i * i), (i * i * i));
			
		}
		System.out.println("Continue? y/n");
		running = scnr.next();
		} while (running.equalsIgnoreCase("y"));
		
		System.out.println("Later, gator.");
	}
	}


