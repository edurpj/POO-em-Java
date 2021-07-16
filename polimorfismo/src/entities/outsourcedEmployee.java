package entities;

public class outsourcedEmployee extends Employee{
	
	private Double adicionalCharge;
	
	public outsourcedEmployee() {
		super();
	}

	public outsourcedEmployee(String name, Integer hours, Double valuePerHour, Double adicionalCharge) {
		super(name, hours, valuePerHour);
		this.adicionalCharge = adicionalCharge;
	}

	public Double getAdicionalCharge() {
		return adicionalCharge;
	}

	public void setAdicionalCharge(Double adicionalCharge) {
		this.adicionalCharge = adicionalCharge;
	}
	
	@Override
	public double payment() {
		return super.payment() + adicionalCharge * 1.1;
	}
}
