package coinpurse;

/**
 * for run a program.
 * 
 * @author Pattara Phobasawakul.
 *
 */
public class Main {
	public static void main(String[] args) {
		Purse purse = new Purse(10);
		ConsoleDialog ui = new ConsoleDialog(purse);
		ui.run();
	}

}
