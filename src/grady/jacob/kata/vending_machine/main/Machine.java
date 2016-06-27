package grady.jacob.kata.vending_machine.main;

import java.util.ArrayList;

import grady.jacob.kata.vending_machine.main.coins.*;
import grady.jacob.kata.vending_machine.main.products.*;

public class Machine {
	
	private CoinBank CoinBank = new CoinBank();
	private ProductInventory ProductInventory = new ProductInventory();
	
	private String displayMessage;
	private String displayMessageDefault = "INSERT COIN";

	private Product dispensedProduct = null;

	public String insertCoin(ArrayList<Double> coinWeightDiameterThickness) {
		try {
			this.CoinBank.processCoinOrReturnIt(coinWeightDiameterThickness);
			this.setDisplayMessage(this.CoinBank.getCurrentAmount().toString());
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		return this.getDisplayMessage();
	}

	public ArrayList<Coin> checkForReturnedCoins() {
		return this.CoinBank.getReturnedCoins();
	}

	private void setDisplayMessage(String message) {
		this.displayMessage = message;
	}

	public String getDisplayMessage() {
		if(this.displayMessage == null)
			this.setDisplayMessage(this.displayMessageDefault);
		
		return this.displayMessage;
	}

	public boolean selectProdct(String selection) {
		try {
			Product Product = this.ProductInventory.selectProduct(selection);
			this.dispensedProduct = Product;
			this.setDisplayMessage("THANK YOU");
			
			return true;
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		return false;
	}

	public Product checkDispenser() {
		return this.dispensedProduct;
	}
}
