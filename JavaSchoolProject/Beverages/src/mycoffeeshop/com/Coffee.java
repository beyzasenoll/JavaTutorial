package mycoffeeshop.com;


public class Coffee extends Beverage {

	public Coffee(String Name,String desc) {
		super(Name, desc);
		setCost(super.getCost()*1.2);
		
		// TODO Auto-generated constructor stub
	}

}
