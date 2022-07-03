import java.math.BigDecimal;

/**
 * Controller interface to check the balance of either the cash
 * or card component against the cost of the product
 * 
 * @author Jamie McGrath
 */
interface SystemController {

	public static boolean checkBalance(BigDecimal balance, double sp) {
		// compare the balance entered to the price of the product (sp = selected product)
		if(balance.compareTo(BigDecimal.valueOf(sp)) < 0)
			return false;
		else {
			return true;
		}
	}
}