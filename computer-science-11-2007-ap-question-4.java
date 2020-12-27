public class RandomPlayer extends Player {
	private String name;
	public RandomPlayer(String playerName) {
		name = playerName;
	}
	@Override
	public String getNextMove(GameState state) {
		Random randomGenerator = new Random();
		return state.getCurrentMoves.get((int)(Math.random * state.getCurrentMoves.size()));
	}
}