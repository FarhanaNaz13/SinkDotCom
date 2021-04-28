
public class SimpleDotComGame {

	public static void main(String[] args) {
		
		int numOfGuesses = 0;
		GameHelper helper = new GameHelper();
		SimpleDotCom game = new SimpleDotCom();
		
		// generate and set DotCom location
		int randomNum = (int) (Math.random()*5);
		int[] locationCells = {randomNum, randomNum+1, randomNum+2};
		game.setLocationCells(locationCells);
		
		boolean isAlive = true;
		while (isAlive) {
			String guess = helper.getUserInput("enter a number");
			String result = game.checkYourself(guess);
			numOfGuesses++;
			if (result.equalsIgnoreCase("kill")) {
				isAlive = false;
				System.out.println("You took " + numOfGuesses + " guesses");
			}
		}
	}
}
