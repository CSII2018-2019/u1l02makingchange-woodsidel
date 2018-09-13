import java.util.Scanner;
		 
import javax.swing.JOptionPane;

public class U1L02MakingChange {

	public static void main(String[] args) {
		int numQuarter = 0;
		int numDime = 0;
		int numNickel = 0;
		int numPenny = 0;
		JOptionPane.showMessageDialog(null, "Welcome to Making Change!");
		String number = JOptionPane.showInputDialog("Enter a monetary value (ex. 1.56): ");
		double money = Double.parseDouble(number);
		numPenny = (int)(money*100);
		while(numPenny >= 25) {
			numQuarter++;
			numPenny -= 25;
			
		}
		while(numPenny >= 10) {
			numDime++;
			numPenny -= 10;
			
		}
		while(numPenny >= 5) {
			numNickel++;
			numPenny -= 5;
			
		}
		JOptionPane.showMessageDialog(null,"There are "+numQuarter+" quarters, "+numDime+" dimes, "
				+ numNickel+" nickels, and "+numPenny+" pennies in "+money+".");


	}

}
