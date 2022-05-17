package fibonacci;

import java.util.Scanner; // Import the Scanner class


public class nonrecursiveQ3 {

	public nonrecursiveQ3() {
		// TODO Auto-generated constructor stub
	}
	
	public static long n;
	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please enter n: ");
		n = scanner.nextLong();
		
		long num1 = 0; 
		long num2 = 1; 
		int counter = 0;
		  
		        // Iterate till counter is N
		while (counter < n) {
		// Print the number
		  System.out.print(num1 + " ");
		  // Swap 
		  long num3 = num2 + num1;
		  num1 = num2;
		  num2 = num3;
		  counter = counter +1;
		        }
		    }
		
	}
