package de.shingiro.bookstore;

import java.util.Random;

@ThirteenDigits
public class IsbnGenerator implements NumberGenerator {

	public String generateNumber() {
		return "13-84356-" + Math.abs( new Random().nextInt() );
	}

}
