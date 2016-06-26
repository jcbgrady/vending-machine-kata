package grady.jacob.kata.vending_machine.main;

import java.util.ArrayList;
import java.util.Arrays;

public class Machine {

	public boolean insertCoin(ArrayList<Double> nickelValues) {
		ArrayList<Double> nickelWeightDiameterThickness = new ArrayList<Double>(Arrays.asList(5.0, 21.21, 1.95));
		
		if(nickelValues.equals(nickelWeightDiameterThickness)) {
			return true;
		}
		
		return false;
	}

}
