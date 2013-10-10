public class Products {
	
	/**
	 * @author Killian Ormond
	 */
	
	//set variables
	int prodID;
	String prodDescription;
	double prodPrice;
	String prodDimension;
	int prodWeight;
	boolean prodInStock;
	boolean addToCart;
	
	/**
	 * sets the product ID
	 * @param prodID
	 */
	public void setProdID(int prodID){
		this.prodID = prodID;
	}
	
	/**
	 * returns the product ID
	 * @return prodID
	 */
	public int getProdID(){
		return prodID;
	}
	
	/**
	 * sets the product description
	 * @param prodDescription
	 */
	public void setProdDescription(String prodDescription){
		this.prodDescription = prodDescription;
	}
	
	/**
	 * returns the product description
	 * @return prodDescription
	 */
	public String getProdDescription(){
		return prodDescription;
	}
	
	/**
	 * sets the product price
	 * @param prodPrice
	 */
	public void setProdPrice(double prodPrice){
		this.prodPrice = prodPrice;
	}
	
	/**
	 * gets the product price
	 * @return prodPrice
	 */
	public double getProdPrice(){
		return prodPrice;
	}
	
	/**
	 * sets the product dimensions
	 * @param prodDimension
	 */
	public void setProdDimension(String prodDimension){
		this.prodDimension = prodDimension;
	}
	
	/**
	 * gets the product dimension
	 * @return prodDimension
	 */
	public String getProdDimension(){
		return prodDimension;
	}
	
	/** 
	 * sets the product weight
	 * @param prodWeight
	 */
	public void setProdWeight(int prodWeight){
		this.prodWeight = prodWeight;
	}
	
	/**
	 * gets the product weight
	 * @return prodWeight
	 */
	public int getProdWeight(){
		return prodWeight;
	}

	/**
	 * sets the product availability
	 * @param prodInStock
	 */
	public void setProdInStock(boolean prodInStock){
		this.prodInStock = prodInStock;
	}
	
	/**
	 * gets the product availability
	 * @return prodInStock
	 */
	public boolean getProdInStock(){
		return prodInStock;
	}

	/**
	 * sets the add to cart
	 * @param addToCart
	 */
	public void setAddToCart(boolean addToCart){
		this.addToCart = addToCart;
	}
	
	/**
	 * gets the add to cart
	 * @return addToCart
	 */
	public boolean getAddToCart(){
		return addToCart;
	}
	
	/**
	 * custom constructor
	 * @param prodID
	 * @param prodDescription
	 * @param prodPrice
	 * @param prodDimension
	 * @param prodWeight
	 * @param prodInStock
	 */
	public Products(int prodID, String prodDescription, double prodPrice, String prodDimension, int prodWeight, boolean prodInStock){
		super();
		this.prodID = prodID;
		this.prodDescription = prodDescription;
		this.prodPrice = prodPrice;
		this.prodDimension = prodDimension;
		this.prodWeight = prodWeight;
		this.prodInStock = prodInStock;
						
	}
	
}
