package grady.jacob.kata.vending_machine.main.products;

import java.math.BigDecimal;

public class Rollos extends Product {
	
	public Rollos(Integer quantity) {
		super(quantity);
		this.setPrice(new BigDecimal("1.00"));
	}

}
