import java.util.Scanner;
		 
import javax.swing.JOptionPane;

public class U1L02MakingChange {

	public static void main(String[] args) {
		
		double numQuarter = 0;
		double numDime = 0;
		double numNickel = 0;
		double numPenny = 0;
		JOptionPane.showMessageDialog(null, "Welcome to Making Change!");
		String number = JOptionPane.showInputDialog("Enter a monetary value (ex. 1.56): ");
		double money = Double.parseDouble(number);
		numPenny = (int)(money)*100;
		(int)(numPenny)/25 = numQuarter;
		numPenny%=25;
		numQuarter/10 = numDime;
		numPenny%=10;
		
		
			

		JOptionPane.showMessageDialog(null,"There are "+numQuarter+" quarters, "+numDime+" dimes, "
				+ numNickel+" nickels, and "+numPenny+" pennies in $"+money+".");


	}

}
