public static boolean isSelfDivisor(int number) {
	String numberAsString = number.toString();
	boolean output = true;
	for (int character = 0; character < numberAsString.length(); character++) {
		if (number % (int)numberAsString.substring(character, character + 1) != 0) {
			output = false;
		}
	}
	return output;
}