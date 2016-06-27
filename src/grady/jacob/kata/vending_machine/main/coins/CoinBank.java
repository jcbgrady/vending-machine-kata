package grady.jacob.kata.vending_machine.main.coins;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;

public class CoinBank {
	
	private ArrayList<Coin> acceptableCoins = new ArrayList<Coin>();
	private ArrayList<Coin> collectedCoins = new ArrayList<Coin>();
	private ArrayList<Coin> returnedCoins = new ArrayList<Coin>();
	
	public CoinBank() {
		this.acceptableCoins.addAll(Arrays.asList(new Nickel(), new Dime(), new Quarter()));
	}
	
	public void processCoinOrReturnIt(ArrayList<Double> coinValues) throws Exception {
		try {
			Coin Coin = this.getCoinIfCoinIsAcceptable(coinValues);
			this.addCoinToCollectedCoins(Coin);
		} catch(Exception e) {
			this.returnedCoins.add(new Coin());
			throw e;
		}
	}
	
	private Coin getCoinIfCoinIsAcceptable(ArrayList<Double> coinValues) throws Exception {
		for(Coin Coin : this.acceptableCoins)
			if(coinValues.equals(Coin.getCoinWeightDiameterThickness()))
				return Coin;
		
		throw new Exception("Unable to identify coin");
	}
	
	private boolean addCoinToCollectedCoins(Coin Coin) throws Exception {
		if(this.collectedCoins.add(Coin)) {
			return true;
		}
		
		throw new Exception("Unable to add Coin to collected coins");
	}

	public BigDecimal getCurrentAmount() {
		BigDecimal currentAmount = new BigDecimal("0.00");
		
		for(Coin Coin : this.collectedCoins) {
				currentAmount = currentAmount.add(Coin.getValue());
		}
		
		return currentAmount;
	}
	
	public ArrayList<Coin> getReturnedCoins() {
		return this.returnedCoins;
	}
}
