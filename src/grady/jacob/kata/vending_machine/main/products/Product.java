package grady.jacob.kata.vending_machine.main.products;

import java.math.BigDecimal;

public class Product {

	private String label;
	private Integer quantity = 0;
	private BigDecimal price = new BigDecimal("0.00");
	
	public Product() {
		this(1);
	}
	
	public Product(Integer quantity) {
		this.setQuantity(quantity);
	}
	
	public String getLabel() {
		return this.label;
	}
	
	protected void setLabel(String label) {
		this.label = label;
	}

	public Integer getQuantity() {
		return this.quantity;
	}
	
	protected void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public BigDecimal getPrice() {
		return price;
	}

	protected void setPrice(BigDecimal price) {
		this.price = price;
	}

}
