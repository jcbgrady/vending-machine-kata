package grady.jacob.kata.vending_machine.main.products;

import java.math.BigDecimal;

public class Cola extends Product {
	
	public Cola(Integer quantity) {
		super(quantity);
		this.setPrice(new BigDecimal("1.00"));
	}

}
