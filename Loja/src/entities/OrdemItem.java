package entities;

public class OrdemItem {
	
	private Integer quantity;
	private Double price;
	
	//Composi��o com o produto
	private Product product;
	
	public OrdemItem() {
		
	}

	public OrdemItem(Integer quantity, Double price, Product product) {
		super();
		this.quantity = quantity;
		this.price = price;
		this.product = product;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}
	
	public double subTotal() {
		return price * quantity;
	}

	@Override
	public String toString() {
		return getProduct().getName()
				+ ", $ "
				+ String.format("%.2f", price)
				+ ", Quantity: "
				+ quantity
				+ " Subtotal: $ "
				+ String.format("%.2f", subTotal());
	}
	
	
	
	
}