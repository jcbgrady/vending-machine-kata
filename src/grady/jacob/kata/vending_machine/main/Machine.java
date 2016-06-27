package grady.jacob.kata.vending_machine.main;

import java.math.BigDecimal;
import java.util.ArrayList;

import grady.jacob.kata.vending_machine.main.coins.*;
import grady.jacob.kata.vending_machine.main.products.*;

public class Machine {
	
	private CoinBank CoinBank = new CoinBank();
	private ProductInventory ProductInventory = new ProductInventory();
	
	private String displayMessage;
	private String displayMessageDefault = "INSERT COIN";

	public String insertCoin(ArrayList<Double> coinWeightDiameterThickness) {
		try {
			this.CoinBank.processCoin(coinWeightDiameterThickness);
			this.setDisplayMessage(this.CoinBank.getCurrentAmount().toString());
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		return this.getDisplayMessage();
	}

	public ArrayList<Coin> checkForReturnedCoins() {
		return this.CoinBank.getReturnedCoins();
	}

	public BigDecimal getCurrentAmount() {
		return this.CoinBank.getCurrentAmount();
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
		try {
			Product Product = this.ProductInventory.selectProduct(selection);
			if(Product != null)
				return true;
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		return false;
	}
}
