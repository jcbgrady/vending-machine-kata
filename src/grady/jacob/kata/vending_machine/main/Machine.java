package grady.jacob.kata.vending_machine.main;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;

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
		
		this.acceptableCoins.addAll(Arrays.asList(Nickel, Dime, Quarter));
	}

	public boolean insertCoin(ArrayList<Double> coinWeightDiameterThickness) {
		try {
			Coin Coin = isCoinAcceptable(coinWeightDiameterThickness);
			addCoinValueToCurrentAmount(Coin.getValue());
			return true;
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		return false;
	}

	private Coin isCoinAcceptable (ArrayList<Double> coinValues) throws Exception {
		for(Coin Coin : this.acceptableCoins)
			if(coinValues.equals(Coin.getCoinWeightDiameterThickness()))
				return Coin;
		
		throw new Exception("Coin is not acceptable");
	}

	private void addCoinValueToCurrentAmount(BigDecimal coinValue) throws Exception {
		this.currentAmount = this.currentAmount.add(coinValue);
	}

	public BigDecimal getCurrentAmount() {
		return this.currentAmount;
	}
}
