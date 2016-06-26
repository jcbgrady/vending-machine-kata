package grady.jacob.kata.vending_machine.main.coins;

import java.math.BigDecimal;

public class Dime extends Coin{
	
	public Dime() {
		this.setValue(new BigDecimal("0.10"));
		this.setWeightInGrams(2.268);
		this.setDiameterInMillimeters(17.91);
		this.setThicknessInMillimeters(1.35);
	}
}
