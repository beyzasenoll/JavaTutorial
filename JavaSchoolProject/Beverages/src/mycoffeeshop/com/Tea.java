package mycoffeeshop.com;

public class Tea extends Beverage {

	public Tea(String Name,String desc) {
		super(Name, desc );
		
		setCost(super.getCost()*1.1);
		// TODO Auto-generated constructor stub
	}

}
