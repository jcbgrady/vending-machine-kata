package grady.jacob.kata.vending_machine.main.coins;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Coin {
	
	private BigDecimal value = new BigDecimal("0.00");
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
	
	protected void setWeightInGrams(Double weight) {
		this.weightInGrams = weight;
	}
	
	protected void setDiameterInMillimeters(Double diameter) {
		this.diameterInMillimeters = diameter;
	}
	
	protected void setThicknessInMillimeters(Double thickness) {
		this.thicknessInMillimeters = thickness;
	}

	protected void setValue(BigDecimal value) {
		this.value = value;
	}

	public BigDecimal getValue() {
		return this.value;
	}

}
