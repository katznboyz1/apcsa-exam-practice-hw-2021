public String decodeString(ArrayList<StringPart> parts) {
	String output = "";
	for (int i = 0; i < parts.length(); parts++) {
		int start = parts.get(i).getStart();
		int length = parts.get(i).getLength();
		output += masterString.substring(start, start + length);
	}
	return output;
}

public ArrayList<StringPart> encodeString(String word) {
	ArrayList<StringPart> stringParts = new ArrayList<StringPart>();
	for () // confused about this part
	return stringParts;
}