import javax.swing.JOptionPane;

/**
 * Customer discount class for customers that scan a
 * pre-pay loyalty card. 10% discount is applied
 * when the button is clicked.
 * 
 * @author Jamie McGrath
 */
public class CustomerDiscount {

	public void cardBalance() {
		JOptionPane.showMessageDialog(null, "10% Discount Applied");
		// setting the balance to £10 when the customer scans the card
		VendingMachineGUI.changeTf.setText("5.00");
		// setting the price on a click of the card payment button
		VendingMachineGUI.getCokePrice().setText("£1.35");
		VendingMachineGUI.getWaterPrice().setText("£0.90");
		VendingMachineGUI.getTangoPrice().setText("£1.26");
		VendingMachineGUI.getLemonPrice().setText("£1.08");
		VendingMachineGUI.getPepsiPrice().setText("£1.17");
		VendingMachineGUI.getSpritePrice().setText("£1.08");
	}
}
