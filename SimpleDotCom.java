
public class SimpleDotCom {
	int[] locationCells;
	int numOfHits = 0;
	
	String checkYourself(String userGuess) {
		int g = Integer.parseInt(userGuess);
		String result = "miss";
		for (int cell : locationCells){
			if (g == cell) {
				result = "hit";
				numOfHits++;
				break;
			}
		}
		if (numOfHits == locationCells.length) {
			result = "kill";
		}
		System.out.println(result);
		return result;
	}
	
	void setLocationCells(int[] loc){
		locationCells = loc;
	}

	
}
