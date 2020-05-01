//main method
public class result {

	public static void main(String[] args) {
		
		human lia = new human();
		
		cake vanilla = new cake();
		cupcake blueberry = new cupcake();

		customer person = new customer();

		//cafe is refering cafe type
		//bakery decor=new decor();
		cafe decor = new bakery();

		//encapsulation
		person.setCustomerName("Ria Cole");
		person.setCardNumber(1234567);

		System.out.println("Customer's name is " +person.getCustomerName());
		System.out.println("Customer's card number is " + person.getCardNumber());
		
		//polymorphism
		lia.order(vanilla);
		lia.order(blueberry);

		//abstract
		decor.music();
		
		
		
		

	}

}
