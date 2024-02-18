public class TestFactorialRecursion {
	
	
	public static void main(String[] args) {
		
		int testValue = 5;
		int product = 1;
		
		int returnValue = ReturnFactorialOfN.factorial(testValue);
		int calculatedValue = ReturnFactorialOfN.calculateFactorial(testValue, product);
		
		System.out.println("Factorial product for using factorial(int n) method: " + returnValue);
		System.out.println("Factorial product for using the calculateFactorial(int n, int totalProduct) method: " + calculatedValue);
	}



}