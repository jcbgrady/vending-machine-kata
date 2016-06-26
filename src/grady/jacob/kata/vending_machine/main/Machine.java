package grady.jacob.kata.vending_machine.main;

import java.util.ArrayList;

import grady.jacob.kata.vending_machine.main.coins.Nickel;

public class Machine {

	public boolean insertCoin(ArrayList<Double> coinWeightDiameterThickness) {
		ArrayList<Double> nickelValues = new Nickel().getCoinWeightDiameterThickness();
		
		if(coinWeightDiameterThickness.equals(nickelValues)) {
			return true;
		}
		
		return false;
	}

}
