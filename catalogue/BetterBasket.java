package catalogue;

import java.io.Serializable;
import java.util.Collections;
import java.util.Comparator;

/**
 * Write a description of class BetterBasket here.
 * 
 * @author  Your Name 
 * @version 1.0
 */
public class BetterBasket extends Basket implements Serializable
{
	private static final long serialVersionUID = 1L;


	@Override
	public boolean add(Product pr)
	{                              
		boolean added = false; 
		for (int i = 0; i < size(); i++) {
			Product p = get(i);
			if(p.getProductNum().equals(pr.getProductNum())) {
				set(indexOf(p), new Product(p.getProductNum(), p.getDescription(), p.getPrice(), p.getQuantity() + pr.getQuantity()));
				added = true;
			}	  
		}
		if(added == false) {
			super.add(pr);  
		}
		Collections.sort(this, new Comparator<Product>() {
			public int compare(Product pr1, Product pr2) {
				return pr1.getProductNum().compareTo(pr2.getProductNum());
			}
		});
		return true;
	}
}
