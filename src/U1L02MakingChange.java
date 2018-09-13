import java.util.Scanner;
		 
import javax.swing.JOptionPane;

public class U1L02MakingChange {

	public static void main(String[] args) {
		int numQuarter = 0;
		int numDime = 0;
		int numNickel = 0;
		int numPenny = 0;
		JOptionPane.showMessageDialog(null, "Welcome to Making Change!");
		String number = JOptionPane.showInputDialog("Enter a monetary value: ");
		int money = Integer.parseInt(number);
		int origMoney = money;
		while(money > 0.25) {
			money -= 0.25;
			numQuarter +=1;
		}
		while(money > 0.1) {
			money -= 0.1;
			numDime += 1;
		}
		while(money > 0.05) {
			money -= 0.05;
			numNickel += 1;
		}
		numPenny = money*100;
		JOptionPane.showMessageDialog(null,"There are "+numQuarter+" quarters, "+numDime+" dimes, "
				+ numNickel+" nickels, and "+numPenny+" pennies in "+origMoney+".");


	}

}
