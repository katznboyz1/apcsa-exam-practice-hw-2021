public double getScore(ArrayList<String> key) {
	double score = 0;
	for (int i = 0; i < key.size(); ki++) {
		if (key.get(i).equals(answers.get(i))) {
			score++;
		} else if (!answers.get(i).equals("?")) {
			score -= .25;
		}
	}
	return score;
}

public String highestScoringStudent(ArrayList<String> key) {
	String highestScoringStudentName = "Error";
	double highestScoringStudentScore = (key.size() + 1) * -.25;
	for (int i = 0; i < sheets.size(); i++) {
		if (sheets.get(i).getScore(key) > highestScoringStudentScore) {
			highestScoringStudentScore = sheets.get(i).getScore(key);
			highestScoringStudentName = sheets.get(i).getName();
		}
	}
	return highestScoringStudentName;
}