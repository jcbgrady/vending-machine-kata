package grady.jacob.kata.vending_machine.main.coins;

import java.util.ArrayList;

public class Coin {
	
	private Double weightInGrams = 0.0;
	private Double diameterInMillimeters = 0.0;
	private Double thicknessInMillimeters = 0.0;
	
	public ArrayList<Double> getCoinWeightDiameterThickness() {
		ArrayList<Double> coinValues = new ArrayList<Double>();
		coinValues.add(this.weightInGrams);
		coinValues.add(this.diameterInMillimeters);
		coinValues.add(this.thicknessInMillimeters);
		
		return coinValues;
	}
	
	protected void setWeightInGrams(Double weightInGrams) {
		this.weightInGrams = weightInGrams;
	}
	
	protected void setDiameterInMillimeters(Double diameterInMillimeters) {
		this.diameterInMillimeters = diameterInMillimeters;
	}
	
	protected void setThicknessInMillimeters(Double thicknessInMillimeters) {
		this.thicknessInMillimeters = thicknessInMillimeters;
	}

}
