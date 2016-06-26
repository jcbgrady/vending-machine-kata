package grady.jacob.kata.vending_machine.main;

import java.util.ArrayList;

import grady.jacob.kata.vending_machine.main.coins.Dime;
import grady.jacob.kata.vending_machine.main.coins.Nickel;

public class Machine {

	public boolean insertCoin(ArrayList<Double> coinWeightDiameterThickness) {
		ArrayList<Double> nickelValues = new Nickel().getCoinWeightDiameterThickness();
		ArrayList<Double> dimeValues = new Dime().getCoinWeightDiameterThickness();
		
		if(coinWeightDiameterThickness.equals(nickelValues)) {
			return true;
		}
		
		if(coinWeightDiameterThickness.equals(dimeValues)) {
			return true;
		}
		
		return false;
	}

}
