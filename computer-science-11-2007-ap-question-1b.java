public static int[] firstNumSelfDivisors(int start, int num) {
	int[] output = new int[num];
	int selfDivisorsAddedToArray = 0;
	int currentNum = start;
	while (selfDivisorsAddedToArray < num) {
		currentNum++;
		if (isSelfDivisor(currentNum)) {
			output[selfDivisorsAddedToArray] = currentNum;
			selfDivisorsAddedToArray++;
		}
	}
	return output;
}