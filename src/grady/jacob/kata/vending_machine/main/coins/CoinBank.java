package grady.jacob.kata.vending_machine.main.coins;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;

public class CoinBank {
	
	private BigDecimal currentAmount = new BigDecimal("0.00");
	
	private ArrayList<Coin> acceptableCoins = new ArrayList<Coin>();
	private ArrayList<Coin> collectedCoins = new ArrayList<Coin>();
	private ArrayList<Coin> returnedCoins = new ArrayList<Coin>();
	
	public CoinBank() {
		this.acceptableCoins.addAll(Arrays.asList(new Nickel(), new Dime(), new Quarter()));
	}
	
	public void processCoin(ArrayList<Double> coinValues) throws Exception {
		Coin Coin = this.isCoinAcceptable(coinValues);
		this.addToCurrentAmount(Coin.getValue());
	}

	public Coin isCoinAcceptable (ArrayList<Double> coinValues) throws Exception {
		for(Coin Coin : this.acceptableCoins)
			if(coinValues.equals(Coin.getCoinWeightDiameterThickness())) {
				this.collectedCoins.add(Coin);
				return Coin;
			}
		
		// coin not identified, so add a generic coin to returned coins list
		this.returnedCoins.add(new Coin()); 
		
		throw new Exception("Coin is not acceptable");
	}
	
	public BigDecimal addToCurrentAmount(BigDecimal value) {
		this.setCurrentAmount(this.currentAmount.add(value));
		return this.currentAmount;
	}

	public BigDecimal getCurrentAmount() {
		return currentAmount;
	}

	public void setCurrentAmount(BigDecimal currentAmount) {
		this.currentAmount = currentAmount;
	}
	
	public ArrayList<Coin> getReturnedCoins() {
		return this.returnedCoins;
	}
}
