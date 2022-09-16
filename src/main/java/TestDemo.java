import java.util.Random;

/*
 * WEEK 12 CODING ASSIGNMENT - TestDemo Class
 * Editted by: Joseph Falzini
 */

public class TestDemo {
	
	/**
	 * This method takes in two Integer parameters, checks if they 
	 *  are both positive, and returns their sum. 
	 * @param a
	 * @param b
	 * @return the sum of A and B (if they both are positive).
	 */
	public int addPositive(int a, int b) {
		int sum;
		
		if (a <= 0 || b <=0) {
			throw new IllegalArgumentException("Both parameters must be positive!");
		} else {
			sum = a + b;
		}
		
		return sum;
	}
	
	/**
	 * This method squares a random number obtained from the getRandomInt() method.
	 * @return the random number multiplied by itself.
	 */
	public int randomNumberSquared() {
		int random = getRandomInt();
		return random * random;
	}

	/**
	 * This method generates and returns a random Integer between 1 and 10. 
	 * @return a random Integer.
	 */
	public int getRandomInt() {
		Random random = new Random();
		return random.nextInt(10) + 1;
	}
	
	
}
