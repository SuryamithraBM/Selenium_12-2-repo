package genericutility;

import java.time.LocalDateTime;
import java.util.Random;
/**@author dell
 * 
 */
public class JavaUtility {
	/**
	 * This method is used to capture current system date and time
	 * @return system date and time
	 */
	public String getSystemTime() {
		return LocalDateTime.now().toString().replace(":","-");
	}
	
	/**
	 * This method will return random numbers within 1000
	 * @param bound
	 * @return int
	 */
	private int getRandomNumber(int bound) {
		Random ran = new Random();
		return ran.nextInt(bound);
	}
}
