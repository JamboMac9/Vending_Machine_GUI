import java.math.BigDecimal;
import java.math.RoundingMode;
import javax.swing.JOptionPane;

/**
 * Cash customer class, designed to reduce the amount of cash
 * a customer is left with on a successful purchase.
 * 
 * @author Jamie McGrath
 */
public class CashCustomer {

	// setting the balance to the money text field as a big decimal
	BigDecimal balance = new BigDecimal(Double.parseDouble(VendingMachineGUI.getMoneyTf()));
	// setting the initial discount product price
	double sp = 0;

	public void selectedProduct() {

		if(VendingMachineGUI.getCokeRb().isSelected()) {
			cokeProd();
			// displays the new balance to the customer once coke has been purchased
			VendingMachineGUI.moneyTf.setText(String.format("%.2f", balance));
		} else if (VendingMachineGUI.getLemonadeRb().isSelected()) {
			lemonProd();
			// displays the new balance to the customer once lemonade has been purchased
			VendingMachineGUI.moneyTf.setText(String.format("%.2f", balance));
		} else if (VendingMachineGUI.getTangoRb().isSelected()) {
			tangoProd();
			// displays the new balance to the customer once tango has been purchased
			VendingMachineGUI.moneyTf.setText(String.format("%.2f", balance));
		} else if (VendingMachineGUI.getWaterRb().isSelected()) {
			waterProd();
			// displays the new balance to the customer once water has been purchased
			VendingMachineGUI.moneyTf.setText(String.format("%.2f", balance));
		} else if (VendingMachineGUI.getSpriteRb().isSelected()) {
			spriteProd();
			// displays the new balance to the customer once sprite has been purchased
			VendingMachineGUI.moneyTf.setText(String.format("%.2f", balance));
		} else if (VendingMachineGUI.getPepsiRb().isSelected()) {
			pepsiProd();
			// displays the new balance to the customer once pepsi has been purchased
			VendingMachineGUI.moneyTf.setText(String.format("%.2f", balance));
		}
	}
	
	protected void cokeProd() {
		// setting the price set to coke, including the "£"
		double cost = Double.valueOf(VendingMachineGUI.getCokePrice().getText().substring(1));
		sp = cost;
		// if a product has been purchased
		if (SystemController.checkBalance(balance, sp)) {
			// subtract the cost of the coke from the balance
			balance = balance.subtract(BigDecimal.valueOf(cost)).setScale(2, RoundingMode.HALF_EVEN);
			JOptionPane.showMessageDialog(null, "COKE - Product Dispensed"); 
		} else
			JOptionPane.showMessageDialog(null, "Not enough money inserted");
	}
	
	protected void lemonProd() {

		double cost = Double.valueOf(VendingMachineGUI.getLemonPrice().getText().substring(1));
		sp = cost;
		// if a product has been purchased
		if (SystemController.checkBalance(balance, sp)) {
			// subtract the cost of the lemonade from the balance
			balance = balance.subtract(BigDecimal.valueOf(cost)).setScale(2, RoundingMode.HALF_EVEN);
			JOptionPane.showMessageDialog(null, "LEMONADE - Product Dispensed"); 
		} else
			JOptionPane.showMessageDialog(null, "Not enough money inserted");
	}

	protected void tangoProd() {

		double cost = Double.valueOf(VendingMachineGUI.getTangoPrice().getText().substring(1));
		sp = cost;
		// if a product has been purchased
		if (SystemController.checkBalance(balance, sp)) {
			// subtract the cost of the tango from the balance
			balance = balance.subtract(BigDecimal.valueOf(cost)).setScale(2, RoundingMode.HALF_EVEN);
			JOptionPane.showMessageDialog(null, "TANGO - Product Dispensed"); 
		} else
			JOptionPane.showMessageDialog(null, "Not enough money inserted");
	}

	protected void waterProd() {

		double cost = Double.valueOf(VendingMachineGUI.getWaterPrice().getText().substring(1));
		sp = cost;
		// if a product has been purchased
		if (SystemController.checkBalance(balance, sp)) {
			// subtract the cost of the water from the balance
			balance = balance.subtract(BigDecimal.valueOf(cost)).setScale(2, RoundingMode.HALF_EVEN);
			JOptionPane.showMessageDialog(null, "WATER - Product Dispensed"); 
		} else
			JOptionPane.showMessageDialog(null, "Not enough money inserted");
	}

	protected void spriteProd() {

		double cost = Double.valueOf(VendingMachineGUI.getSpritePrice().getText().substring(1));
		sp = cost;
		// if a product has been purchased
		if (SystemController.checkBalance(balance, sp)) {
			// subtract the cost of the sprite from the balance
			balance = balance.subtract(BigDecimal.valueOf(cost)).setScale(2, RoundingMode.HALF_EVEN);
			JOptionPane.showMessageDialog(null, "SPRITE - Product Dispensed"); 
		} else
			JOptionPane.showMessageDialog(null, "Not enough money inserted");
	}

	protected void pepsiProd() {

		double cost = Double.valueOf(VendingMachineGUI.getPepsiPrice().getText().substring(1));
		sp = cost;
		// if a product has been purchased
		if (SystemController.checkBalance(balance, sp)) {
			// subtract the cost of the pepsi from the balance
			balance = balance.subtract(BigDecimal.valueOf(cost)).setScale(2, RoundingMode.HALF_EVEN);
			JOptionPane.showMessageDialog(null, "PEPSI - Product Dispensed"); 
		} else
			JOptionPane.showMessageDialog(null, "Not enough money inserted");
	}
}
