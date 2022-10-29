package mycoffeeshop.com;
public class Beverage {

	private double cost;
	private double size=1;
	
	
	public double getCost() {
		return cost;
	}


	public void setCost(double cost) {
		this.cost = cost;
	}


	public double getSize() {
		return size;
	}


	public void setSize(double size) {
		this.size = size;
	}


	private String name;
	private String desc;
	
	public Beverage(String name, 
					String desc) {
		this.name= name;
		this.desc= desc;
		this.cost=8.0;
			
	}
	
	
	public double cost() {	
		return size*cost;	
	}
	
	@Override
	public String toString() {
		
		return name + " "
					+ desc 
					+" size:" + getSize() 
					+" cost:" + getCost();
		
	}
	
	
	
}
