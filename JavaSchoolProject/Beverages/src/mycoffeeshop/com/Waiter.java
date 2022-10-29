package mycoffeeshop.com;

public class Waiter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Beverage[] orders= new Beverage[100];		
		Beverage b1=new GreenTea();
		b1.setSize(1.5);
		orders[0]= b1;
				
		Beverage b2=new Coffee("Black","Instant Coffee");
		orders[1]= b2;
		Beverage b3= new FilterCoffee();
		orders[2]= b3;
		System.out.println("TOTAL COST " + CalculateCost(orders));
		
	}

	public static double CalculateCost(Beverage[] theorder) {
		double cost=0;
		for(int i=0;i<3;i++) {
			System.out.println(theorder[i]);
			cost+=theorder[i].getCost();
		}
		
		return cost;
		
	}
	
	
}
