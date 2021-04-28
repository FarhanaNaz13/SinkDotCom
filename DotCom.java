import java.util.*;

public class DotCom {

	private ArrayList<String> locationCells;
	private String name;
	
	public void setLocationsCells(ArrayList<String> loc) {
		locationCells = loc;
	}
	public void setName(String n){
		name = n;
		System.out.println("Created DotCom: " + name);
	}
	public String getName(){
		return name;
	}
	String checkYourself(String userInput) {
		String result = "miss";
		int index = locationCells.indexOf(userInput);
		if (index >= 0){
			locationCells.remove(index);
			System.out.println("Good hit.");
			if (locationCells.isEmpty()) {
				result = "kill";
				System.out.println("Damn. you killed " + name);
			} else {
				result = "hit";
				System.out.println("You hit " + name);
			}
		}
		
		return result;
	}	
}
