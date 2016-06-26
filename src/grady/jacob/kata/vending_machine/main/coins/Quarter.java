package grady.jacob.kata.vending_machine.main.coins;

import java.math.BigDecimal;

public class Quarter extends Coin{
	
	public Quarter() {
		this.setValue(new BigDecimal("0.25"));
		this.setWeightInGrams(5.67);
		this.setDiameterInMillimeters(24.26);
		this.setThicknessInMillimeters(1.75);
	}
}
