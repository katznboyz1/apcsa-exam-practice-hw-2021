class Trio {
	private Sandwich sandwich;
	private Salad salad;
	private Drink drink;
	private double price;
	private String name;
	Trio(Sandwich sw, Salad sa, Drink dr) {
		sandwich = sw;
		salad = sa;
		drink = dr;
		name = sw.getName() + "/" + sa.getName() + "/" + dr.getName() + " Trio";
		double[] topTwoPrices = {0, 0};
		double[] prices = new double[3];
		prices[0] = sw.getPrice();
		prices[1] = sa.getPrice();
		prices[2] = dr.getPrice();
		for (int i = 0; i < prices.length; i++) {
            if (topTwoPrices[0] < prices[i]) {
                topTwoPrices[1] = topTwoPrices[0];
                topTwoPrices[0] = prices[i];
            } else if (topTwoPrices[1] < prices[i]) {
                topTwoPrices[1] = prices[i];
            }
		}
		price = topTwoPrices[0] + topTwoPrices[1];
	}
	String getName() {
		return name;
	}
	double getPrice() {
		return price;
	}
}