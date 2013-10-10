
public class ProductsChosen {

	/**
	 * @author Killian Ormond
	 */
	
	//set variables
	int productID;
	String productDescription;
	double productPrice;
	int productWeight;
	
	/**
	 * returns the product ID
	 * @return productID
	 */
	public int getproductID() {
		return productID;
	}
	
	/**
	 * sets the product ID
	 * @param productID
	 */
	public void setproductID(int productID) {
		this.productID = productID;
	}
	
	/**
	 * returns the product description
	 * @return productDescription
	 */
	public String getproductDescription() {
		return productDescription;
	}
	
	/**
	 * sets the product description
	 * @param productDescription
	 */
	public void setproductDescription(String productDescription) {
		this.productDescription = productDescription;
	}
	
	/**
	 * returns the product price
	 * @return productPrice
	 */
	public double getproductPrice() {
		return productPrice;
	}
	
	/**
	 * sets the product price
	 * @param productPrice
	 */
	public void setproductPrice(double productPrice) {
		this.productPrice = productPrice;
	}
	
	/**
	 * returns the product weight
	 * @return productWeight
	 */
	public int getproductWeight() {
		return productWeight;
	}
	
	/**
	 * sets the product weight
	 * @param productWeight
	 */
	public void setproductWeight(int productWeight) {
		this.productWeight = productWeight;
	}
	
	/**
	 * custom constructor
	 * @param productID
	 * @param productDescription
	 * @param productPrice
	 * @param productWeight
	 */
	public ProductsChosen(int productID, String productDescription, double productPrice, int productWeight){
		super();
		this.productID = productID;
		this.productDescription = productDescription;
		this.productPrice = productPrice;
		this.productWeight = productWeight;
						
	}
	
	
}
