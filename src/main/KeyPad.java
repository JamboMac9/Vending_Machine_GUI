/**
 * A keypad class designed to imitate the use of real world
 * coins. Preventing customers from inserting foreign currency
 * in order to purchase the product.
 * 
 * @author Jamie McGrath
 */
public class KeyPad {
	static double balance = 0;
	// incremenent cash balance by 5p on selection
	private void fivePence() {
		balance += 0.05;
		VendingMachineGUI.moneyTf.setText(String.format("%.2f", balance));
	}
	// incremenent cash balance by 10p on selection
	private void tenPence() {
		balance += 0.10;
		VendingMachineGUI.moneyTf.setText(String.format("%.2f", balance));
	}
	// incremenent cash balance by 20p on selection
	private void twentyPence() {
		balance += 0.20;
		VendingMachineGUI.moneyTf.setText(String.format("%.2f", balance));
	}
	// incremenent cash balance by 50p on selection
	private void fiftyPence() {
		balance += 0.50;
		VendingMachineGUI.moneyTf.setText(String.format("%.2f", balance));
	}
	// incremenent cash balance by £1 on selection
	private void onePence() {
		balance += 1.00;
		VendingMachineGUI.moneyTf.setText(String.format("%.2f", balance));
	}
	// incremenent cash balance by £2 on selection
	private void twoPence() {
		balance += 2.00;
		VendingMachineGUI.moneyTf.setText(String.format("%.2f", balance));
	}
	
	//**** start of getters for use in other classes ****//
	protected void getFivePence() {
		this.fivePence();
	}
	
	protected void getTenPence() {
		this.tenPence();
	}
	
	protected void getTwentyPence() {
		this.twentyPence();
	}
	
	protected void getFiftyPence() {
		this.fiftyPence();
	}
	
	protected void getOnePence() {
		this.onePence();
	}
	
	protected void getTwoPence() {
		this.twoPence();
	}
	//**** end of getters ****//
	
	// set balance to 0 on clear button selection
	public void clearBalance() {
		balance = 0;
	}
}
