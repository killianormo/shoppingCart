
public class ShoppingCart {
	
	/**
	 * @author Killian Ormond
	 */
	
	double prodID;
	double prodPrice;
	String prodDescription;	
	double delivEstim;
	double totCost;
	double VAT;
	
	/**
	 * Returns the product IDs for the cart
	 * @return prodID
	 */
	public double getProdID() {
		return prodID;
	}

	/**
	 * Sets the Product IDs for the cart 
	 * @param prodID
	 */
	public void setProdID(double prodID) {
		this.prodID = prodID;
	}

	/**
	 * Returns the prices of the products in the cart
	 * @return prodPrice
	 */
	public double getProdPrice() {
		return prodPrice;
	}

	/**
	 * Sets the prices of the products in the cart
	 * @param prodPrice
	 */
	public void setProdPrice(double prodPrice) {
		this.prodPrice = prodPrice;
	}

	/**
	 * Returns the description of each product in the cart
	 * @return prodDescription
	 */
	public String getProdDescription() {
		return prodDescription;
	}

	/**
	 * Sets the description of each product in the cart
	 * @param prodDescription
	 */
	public void setProdDescription(String prodDescription) {
		this.prodDescription = prodDescription;
	}
	
	/**
	 * Returns the estimated delivery cost for the cart
	 * @return delivEstim
	 */
	public double getDelivEstim() {
		return delivEstim;
	}

	/**
	 * Sets the estimated delivery cost for the cart
	 * @param delivEstim
	 */
	public void setDelivEstim(double delivEstim) {
		this.delivEstim = delivEstim;
	}
	/**
	 * Returns the total cost of the shopping cart
	 * @return totCost
	 */
	public double getTotCost() {
		return totCost;
	}

	/**
	 * Sets the total cost of the shopping cart
	 * @param totCost
	 */
	public void setTotCost(double totCost) {
		this.totCost = totCost;
	}
	
	/**
	 * Return the total VAT for the shopping cart
	 * @return VAT
	 */
	public double getVAT() {
		return VAT;
	}

	/**
	 * Sets the VAT for the shopping cart
	 * @param vAT
	 */
	public void setVAT(double vAT) {
		VAT = vAT;
	}

	/**
	 * Set the custom constructor
	 * @param prodID
	 * @param prodPrice
	 * @param prodDescription
	 * @param totPrice
	 * @param delivEstim
	 * @param totCost
	 * @param VAT
	 */
	public ShoppingCart(double prodID, double prodPrice, String prodDescription, double delivEstim, double totCost, double VAT){
		super();
		this.prodID = prodID;
		this.prodPrice = prodPrice;
		this.prodDescription = prodDescription;	
		this.delivEstim = delivEstim;
		this.totCost = totCost;
		this.VAT = VAT;
								
	}
}
