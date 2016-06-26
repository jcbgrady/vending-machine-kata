package grady.jacob.kata.vending_machine.main;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;

import grady.jacob.kata.vending_machine.main.coins.Coin;
import grady.jacob.kata.vending_machine.main.coins.Dime;
import grady.jacob.kata.vending_machine.main.coins.Nickel;
import grady.jacob.kata.vending_machine.main.coins.Quarter;

public class Machine {
	
	private String displayMessage;
	private String displayMessageDefault = "INSERT COIN";
	
	private BigDecimal currentAmount = new BigDecimal("0.00");
	
	private ArrayList<Coin> acceptableCoins = new ArrayList<Coin>();
	private ArrayList<Coin> collectedCoins = new ArrayList<Coin>();
	private ArrayList<Coin> returnedCoins = new ArrayList<Coin>();
	
	public Machine() {
		this.acceptableCoins.addAll(Arrays.asList(new Nickel(), new Dime(), new Quarter()));
	}

	public String insertCoin(ArrayList<Double> coinWeightDiameterThickness) {
		try {
			Coin Coin = this.isCoinAcceptable(coinWeightDiameterThickness);
			this.addCoinValueToCurrentAmount(Coin.getValue());
			this.setDisplayMessage(this.currentAmount.toString());
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		return this.getDisplayMessage();
	}

	private Coin isCoinAcceptable (ArrayList<Double> coinValues) throws Exception {
		for(Coin Coin : this.acceptableCoins)
			if(coinValues.equals(Coin.getCoinWeightDiameterThickness())) {
				this.collectedCoins.add(Coin);
				return Coin;
			}
		
		this.returnedCoins.add(new Coin());
		throw new Exception("Coin is not acceptable");
	}

	public ArrayList<Coin> getReturnedCoins() {
		return this.returnedCoins;
	}

	private void addCoinValueToCurrentAmount(BigDecimal coinValue) {
		this.currentAmount = this.currentAmount.add(coinValue);
	}

	public BigDecimal getCurrentAmount() {
		return this.currentAmount;
	}

	public void setDisplayMessage(String message) {
		this.displayMessage = message;
	}

	public String getDisplayMessage() {
		if(this.displayMessage == null) {
			this.setDisplayMessage(this.displayMessageDefault);
		}
		
		return this.displayMessage;
	}
}
