package fibonacci;

import java.util.Scanner;

public class recursiveQ3 {

	public static long n;
	
	static Scanner scanner = new Scanner(System.in);
    // Function to print the fibonacci series
    static long fib(long n)  {
        // Base Case
        if (n <= 1)
            return n;
  
        // Recursive call
        return fib(n - 1)
            + fib(n - 2);
    }
  
    // Driver Code
    public static void
    main(String args[])
    {
    	System.out.println("Please enter n: ");
		n = scanner.nextLong();
  
        // Print the first N numbers
        for (int i = 0; i < n; i++) {
  
            System.out.print(fib(i) + " ");
        }
    }
}

