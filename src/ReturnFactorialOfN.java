public class ReturnFactorialOfN {
	
	// Method 1
	// Big-Oh notation is O(n), since the linear algorithm's runtime complexity grows in proportion to n
	public static int factorial(int n) {
		// after n iterations, n will equal 0, ending the recursion
		if (n == 0) {
			return 1;
		} else {
			// recursively run the factorial method, decrementing the value of n in each recursion
			return factorial(n - 1) * n;
		}
	}

	// Method 2
	//Big-Oh notation is n, since the linear algorithms returns the totalProduct based directly on the value of n. But for this algorithm, totalProduct as a parameter must be initially set to 1, as is in the testing method
	public static int calculateFactorial(int n, int totalProduct) {
		// if n less than or equal 1, return the totalProduct
		if (n <= 1) {
			return totalProduct;
			// else, run the recursion again, decrementing the value of n
		} else {
			return calculateFactorial(n - 1, totalProduct * n);
		}
	}
}
