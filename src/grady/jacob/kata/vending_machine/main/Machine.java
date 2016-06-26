package grady.jacob.kata.vending_machine.main;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

import grady.jacob.kata.vending_machine.main.coins.Coin;
import grady.jacob.kata.vending_machine.main.coins.Dime;
import grady.jacob.kata.vending_machine.main.coins.Nickel;
import grady.jacob.kata.vending_machine.main.coins.Quarter;
import grady.jacob.kata.vending_machine.main.products.Product;

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

	public boolean selectProdct(String selection) {
		HashMap<String, Product> productInventory = new HashMap<String, Product>();
		
		productInventory.put("a1", new Product());
		productInventory.put("a2", new Product());
		productInventory.put("a3", new Product());
		productInventory.put("a4", new Product());
		productInventory.put("a5", new Product());
		
		productInventory.put("b1", new Product());
		productInventory.put("b2", new Product());
		productInventory.put("b3", new Product());
		productInventory.put("b4", new Product());
		productInventory.put("b5", new Product());
		
		productInventory.put("c1", new Product());
		productInventory.put("c2", new Product());
		productInventory.put("c3", new Product());
		productInventory.put("c4", new Product());
		productInventory.put("c5", new Product());
		
		if(productInventory.containsKey(selection)) {
			return true;
		}
		
		return false;
	}
}
