package grady.jacob.kata.vending_machine.main.products;

import java.math.BigDecimal;

public class Candy extends Product {
	
	public Candy(Integer quantity) {
		super(quantity);
		this.setPrice(new BigDecimal("1.00"));
	}

}
