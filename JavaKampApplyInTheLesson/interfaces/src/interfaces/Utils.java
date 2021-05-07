package interfaces;

public class Utils {
	
	public static void runLogger(Logger[] loggers, String customer) {
		
		for (Logger logger : loggers) {
			logger.log(customer);
		}
	}
}
