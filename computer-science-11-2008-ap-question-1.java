public int getDuration() {
	int duration = 0;
	if (flights.size() > 0) {
		duration = flights.get(0).getDeparatureTime().minutesUntil(flights.get(flights.size() - 1).getArrivalTime());
	}
	return duration;
}

public int getShortestLayover() {
	int shortestLayover = 0;
	for (int i = 0; i < flights.size(); i++) {
		if (i < flights.size() - 1) {
			int layoverTime = flights.get(i).getArrivalTime().minutesUntil(flights.get(i + 1).getDepartureTime());
			if (layoverTime > shortestLayover) {
				shortestLayover = layoverTime;
			}
		}
	}
	return shortestLayover;
}