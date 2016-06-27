package grady.jacob.kata.vending_machine.main.products;

import java.math.BigDecimal;

public class Chips extends Product {
	
	public Chips(Integer quantity) {
		super(quantity);
		this.setLabel("chips");
		this.setPrice(new BigDecimal("1.00"));
	}

}
