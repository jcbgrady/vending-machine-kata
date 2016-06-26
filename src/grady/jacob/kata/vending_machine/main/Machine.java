package grady.jacob.kata.vending_machine.main;

import java.util.ArrayList;

import grady.jacob.kata.vending_machine.main.coins.Coin;
import grady.jacob.kata.vending_machine.main.coins.Dime;
import grady.jacob.kata.vending_machine.main.coins.Nickel;

public class Machine {
	
	private ArrayList<Coin> acceptableCoins = new ArrayList<Coin>();
	
	public Machine() {
		Nickel Nickel = new Nickel();
		Dime Dime = new Dime();
		
		this.acceptableCoins.add(Nickel);
		this.acceptableCoins.add(Dime);
	}

	public boolean insertCoin(ArrayList<Double> coinWeightDiameterThickness) {
		for(Coin Coin : this.acceptableCoins) {
			if(coinWeightDiameterThickness.equals(Coin.getCoinWeightDiameterThickness())) {
				return true;
			}
		}
		
		return false;
	}

}
