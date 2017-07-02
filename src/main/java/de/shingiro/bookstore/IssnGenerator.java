	/**
 * 
 */
package de.shingiro.bookstore;

import java.util.Random;

/**
 * @author a.shingiro
 *
 */
public class IssnGenerator implements NumberGenerator {

	/* (non-Javadoc)
	 * @see de.shingiro.bookstore.NumberGenerator#generateNumber()
	 */
	public String generateNumber() {
		
		return "8-" + Math.abs(new Random().nextInt());
	}

}
