package interfaces;

public class Main {

	public static void main(String[] args) {
		CustomerManager customerManager = new CustomerManager(new EmailLogger(),new DatabaseLogger());
		
		Customer engin = new Customer(1,"Engin","Demiroð");
		
		customerManager.add(engin);
	}

}
