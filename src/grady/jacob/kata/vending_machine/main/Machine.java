package grady.jacob.kata.vending_machine.main;

import java.math.BigDecimal;
import java.util.ArrayList;

import grady.jacob.kata.vending_machine.main.coins.Coin;
import grady.jacob.kata.vending_machine.main.coins.Dime;
import grady.jacob.kata.vending_machine.main.coins.Nickel;
import grady.jacob.kata.vending_machine.main.coins.Quarter;

public class Machine {
	
	private BigDecimal currentAmount = new BigDecimal("0.00");
	
	private ArrayList<Coin> acceptableCoins = new ArrayList<Coin>();
	
	public Machine() {
		Nickel Nickel = new Nickel();
		Dime Dime = new Dime();
		Quarter Quarter = new Quarter();
		
		this.acceptableCoins.add(Nickel);
		this.acceptableCoins.add(Dime);
		this.acceptableCoins.add(Quarter);
	}

	public boolean insertCoin(ArrayList<Double> coinWeightDiameterThickness) {
		for(Coin Coin : this.acceptableCoins) {
			if(coinWeightDiameterThickness.equals(Coin.getCoinWeightDiameterThickness())) {
				this.currentAmount = this.currentAmount.add(Coin.getValue());
				return true;
			}
		}
		
		return false;
	}

	public BigDecimal getCurrentAmount() {
		return this.currentAmount;
	}

}
