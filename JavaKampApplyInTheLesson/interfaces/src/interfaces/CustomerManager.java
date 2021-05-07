package interfaces;

public class CustomerManager {
	
	//Ýki tip baðýmlýlýk var 
	//Loosly- Tightly coupled 
	
	private Logger[] loggers;
	
	public CustomerManager(Logger... loggers) {
		this.loggers = loggers;
	}

	public void add(Customer customer) {
		System.out.println("Müþteri eklendi: " + customer.getFirstName());
		Utils.runLogger(loggers, customer.getFirstName());
	}

	public void delete(Customer customer) {
		System.out.println("Müþteri eklendi " + customer.getFirstName());
		Utils.runLogger(loggers, customer.getFirstName());
	}
}
