package clients.cashier;

import catalogue.BetterBasket;
import middle.MiddleFactory;

/**
 * Implements the Model of the cashier client
 * @author  James Netto 2022
 * @version 1.0
 */
public class BetterCashierModel extends CashierModel{

	public BetterCashierModel(MiddleFactory mf) {
		super(mf);
	}

	/**
	 * return an instance of a new BetterBasket
	 * @return an instance of a new BetterBasket
	 */
	@Override
	protected BetterBasket makeBasket()
	{
		return new BetterBasket();
	}
}
