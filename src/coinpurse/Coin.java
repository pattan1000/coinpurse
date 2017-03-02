package coinpurse;

/**
 * a coin with a monetary value and currency
 * 
 * @author Pattara Phobasawakul
 */

public class Coin implements Comparable<Coin> {
	public static final String DEFAULT_CURRENCY = "Baht";
	/** Value of the coin. */
	private final double value;
	/** The currency, of course. */
	private final String currency;

	/**
	 * A coin with given value using the default currency.
	 * 
	 * @param value
	 *            is the value that you want to initialize.
	 */
	public Coin(double value) {
		this.value = value;
		this.currency = "Bath";

	}

	/**
	 * A coin with given value and currency.
	 * 
	 * @param value
	 *            is the value that you want to initialize.
	 * @param currency
	 *            is the currency that you want to initialize.
	 */
	public Coin(double value, String currency) {
		this.value = value;
		this.currency = currency;

	}

	/**
	 * get the value money.
	 * 
	 * @return value of money.
	 */
	public double getValue() {
		return this.value;
	}

	/**
	 * get he currency of money.
	 * 
	 * @return the currency of money.
	 */
	public String getCurrency() {
		return this.currency;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (this.getClass() != obj.getClass()) {
			return false;
		}
		Coin other = (Coin) obj;
		if (this.value == other.value && this.currency.equals(other.currency)) {
			return true;
		} else
			return false;

	}

	public String toString() {
		return this.value + "-" + this.currency;
	}

	/**
	 * Compare two coin with value, return -1 if object is null or this coin is
	 * less than another coin, return 1 if this coin value more than another
	 * coin, return 0 if it has a same value.
	 * 
	 * @param other
	 *            is the coin object that you want to compare with
	 * @return return -1 if object is null or this coin is less than another
	 *         coin, return 1 if this coin value more than another coin, return
	 *         0 if it has a same value.
	 */
	@Override
	public int compareTo(Coin other) {
		if (other == null)
			return -1;
		if (this.getValue() > other.getValue())
			return 1;
		else if (this.getValue() == other.getValue())
			return 0;
		else
			return -1;
	}

}
