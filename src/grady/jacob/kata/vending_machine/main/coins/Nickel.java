package grady.jacob.kata.vending_machine.main.coins;

import java.math.BigDecimal;

public class Nickel extends Coin{
	
	public Nickel() {
		this.setValue(new BigDecimal("0.05"));
		this.setWeightInGrams(5.0);
		this.setDiameterInMillimeters(21.21);
		this.setThicknessInMillimeters(1.95);
	}
}
