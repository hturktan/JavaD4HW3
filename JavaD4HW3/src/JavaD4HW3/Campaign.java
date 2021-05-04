package JavaD4HW3;

public class Campaign {

	private String name;
	private double discountAmount;
	
	public Campaign() {
		
	}

	public Campaign(String name, double discountAmount) {
		super();
		this.name = name;
		this.discountAmount = discountAmount;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getDiscountAmount() {
		return discountAmount;
	}

	public void setDiscountAmount(double discountAmount) {
		this.discountAmount = discountAmount;
	}
	
	
}
