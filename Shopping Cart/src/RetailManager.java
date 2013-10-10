import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class RetailManager {


	/**
	 * @author Killian Ormond
	 */
	
	//These are functions that are used throughout the code. 
	static ArrayList<Products> products = new ArrayList<Products>();
	static ArrayList<ShoppingCart> shopCart = new ArrayList<ShoppingCart>();
	static ArrayList<ProductsChosen> prodsChosen = new ArrayList<ProductsChosen>();
	static Scanner in = new Scanner(System.in);
	
	//Create a method to add products for the user to choose.
	static ArrayList<Products> addProds(ArrayList<Products> products){
		products = new ArrayList<Products>();
		Products p = new Products(101, "Sony mp3 player", 65.95, "80x50x30mm", 400, true);
		products.add(p);
		Products p1 = new Products(102, "iPod mp3 player", 70.95, "75x45x30mm", 350, true);
		products.add(p1);
		Products p2 = new Products(103, "Samsung 32in TV", 349.95, "800x525x90mm", 7500, true);
		products.add(p2);
		Products p3 = new Products(104, "Philips 40in TV", 509.95, "900x575x90mm", 8000, true);
		products.add(p3);
		Products p4 = new Products(105, "Panasonic Digital Camera", 119.95, "100x100x100mm", 900, true);
		products.add(p4);
		Products p5 = new Products(106, "Sony Digital Camera", 139.95, "120x110x90mm", 850, true);
		products.add(p5);
		Products p6 = new Products(107, "Samsung Mobile Phone", 449.95, "150x10x80mm", 180, true);
		products.add(p6);
		Products p7 = new Products(108, "Blackberry Mobile Phone", 309.95, "115x10x65mm", 130, true);
		products.add(p7);
		Products p8 = new Products(109, "Bose Speakers", 299.95, "50x250x130mm", 1300, true);
		products.add(p8);
		Products p9 = new Products(110, "Sonos Speakers", 299.95, "130x270x160mm", 2600, true);
		products.add(p9);
		return products;
	}
	
	//Create a method to assign a prodID to the product number chosen by the user.
	static String whichProd(int prodID){
		String prodDesc = "";
		if(prodID == 101){
			prodDesc = "Sony mp3 player";
		}else if(prodID == 102){
			prodDesc = "iPod mp3 player";
		}else if(prodID == 103){
			prodDesc = "Samsung 32in TV";
		}else if(prodID == 104){
			prodDesc = "Philips 40in TV";
		}else if(prodID == 105){
			prodDesc = "Panasonic Digital Camera";
		}else if(prodID == 106){
			prodDesc = "Sony Digital Camera";
		}else if(prodID == 107){
			prodDesc = "Samsung Mobile Phone";
		}else if(prodID == 108){
			prodDesc = "Blackberry Mobile Phone";
		}else if(prodID == 109){
			prodDesc = "Bose Speakers";
		}else if(prodID == 110){
			prodDesc = "Sonos Speakers";
		}
		return prodDesc;
	}
	
	//Create a method to check the product number is valid.
	static void checkProd(int prod){
			if(prod >= 101 && prod <= 110){
				
			}else{
				System.out.println("Product number not recognised");
				}
			}
	
	//Create a method to check if the item is in stock.
	static boolean checkInStock(boolean inStock){
		if(inStock == true){
			return true;
		}else{
			return false;
		}
	}
	
	//Create a method to print list of the products available.
	static void listProds(ArrayList<Products> products) {
	
		products = addProds(products);
		for(int i=0; i<products.size(); i++){
			String available = "";
			Products current = products.get(i);
			//Checks if product is in stock and prints on product list
			boolean inStock = checkInStock(current.prodInStock);
			if(inStock==true){
				available = "In Stock";
			}else{
				available = "Not In Stock";
			}
			System.out.println("Product Number: "+current.prodID+"; "+current.prodDescription+"; €"+current.prodPrice+"; "
					+"; Size: "+current.prodDimension+"; Weight:"+current.prodWeight+"g; "+available);
		}		
	}
		
	//create a method to get the products the user wants to order and return those in an array
	static ArrayList<ProductsChosen> getProdID(){
		int productID = 0;
		String productDescription = "";
		double productPrice = 0;
		int productWeight = 0;
		products = addProds(products);
		int[] prods = new int[products.size()];
		prodsChosen = new ArrayList<ProductsChosen>();
		System.out.println("\nFor multiple orders of the same item just enter the number again.");
		//Run a loop to request the user input.
		for(int i=0; i<prods.length; i++){
			System.out.println("\nEnter the product number you want to order:");
			productID = in.nextInt();
			checkProd(productID);
			products = addProds(products);
			for(int j = 0; j<products.size(); j++){
				Products current = products.get(j);
				if(productID == current.prodID){
				productID = current.prodID;
				productDescription = current.prodDescription;
				productPrice = current.prodPrice;
				productWeight = current.prodWeight;
				ProductsChosen prodList = new ProductsChosen(productID, productDescription, productPrice, productWeight);
				prodsChosen.add(prodList);
				}else{
				}
			}		
			System.out.println("Do you want to continue shopping? Y/N");
			String ans = in.next();
			if(ans.equalsIgnoreCase("N")){
					break;
				}	
		}
		printProdsChosen(prodsChosen);
		return prodsChosen;
	}
	
	//Create a method to print out the products chosen by the user from the getProdID method.
	static void printProdsChosen(ArrayList<ProductsChosen> prodsList){
		prodsList = prodsChosen;
		System.out.println("\nThe products you have chosen are: ");
		for(int i=0; i<prodsList.size(); i++){ 
			ProductsChosen prodsToPrint = prodsList.get(i);
			System.out.println(prodsToPrint.productID+"; "+prodsToPrint.productDescription+"; €"+
				prodsToPrint.productPrice);
		}
	}
	
	//Create a method to get the total price using the arrayList created from user input.
	static double getTotPrice(){
		ArrayList<ProductsChosen> prodPrice = prodsChosen;
		double singPrice = 0;
		double totPrice =0;
		for(int i=0; i<prodPrice.size(); i++){
			ProductsChosen price = prodPrice.get(i);
			singPrice = price.productPrice;
			totPrice+=singPrice;	
		}
		return totPrice;
	}
	
	//Create a method to get the delivery cost using the arrayList created from user input.
	static double getDelivEstim(){
			ArrayList<ProductsChosen> prodWeight = prodsChosen;
			double singWeight = 0;
			double totWeight =0;
			double delivEstim = 0;
			for(int i=0; i<prodWeight.size(); i++){
				ProductsChosen weight = prodWeight.get(i);
				singWeight = weight.productWeight;
				totWeight+=singWeight;					
			}
			delivEstim = (totWeight*0.025);
			return delivEstim;
		}
	
	//Create a method to construct a shopping cart using the ShoppingCart class
	static ArrayList<ShoppingCart> addCart(){		
		ArrayList<ProductsChosen> prodsList = prodsChosen;
		//Get each of the elements to add to the cart.
		double prodID=0;
		double prodPrice=0;
		String prodDescription="";
		double delivEstim=getDelivEstim();
		double totCost = getTotPrice();	
		double VAT = (getTotPrice()*0.12);
		
		for(int i=0; i<prodsList.size(); i++){ 
			ProductsChosen current = prodsList.get(i);
			prodID = current.productID;
			prodPrice = current.productPrice;
		}			
		//Create the shopping cart.
		shopCart = new ArrayList<ShoppingCart>();
		ShoppingCart s = new ShoppingCart(prodID, prodPrice, prodDescription, delivEstim, totCost, VAT);
		shopCart.add(s);
		
		return shopCart;
	}
		
	//Create a method to print to screen the elements of the shopping cart and the total prices.
	static void showCart(ArrayList<ShoppingCart> cart){
		cart = addCart();
		for(int i=0; i<cart.size(); i++){
			ShoppingCart current = cart.get(i);
			System.out.print("\nSub Total: €");
			System.out.printf("%.2f", current.totCost);
			System.out.print("\nDelivery cost: €");
			System.out.printf("%.2f", current.delivEstim);
			System.out.println();
			System.out.print("Total Price: €");
			System.out.printf("%.2f", (current.totCost+current.delivEstim));
			System.out.println();
			System.out.print("\nVAT @ 12% is included in the price.\nVAT: €");
			System.out.printf("%.2f", current.VAT);
		}
	}
	
	//Create a method for the user to check out
	static void checkOut(){
		System.out.println("\n\nTo proceed to the checkout please enter your username and password.");

		//Get username and password and check it matches the records.
		//If it does match records print the details on file.
		System.out.println("Username (hint - try 'John'):");
		String username = in.next();
		System.out.println("Password (hint - try 'Password'):");
		String password = in.next();
		if(username.equalsIgnoreCase("John") && password.equalsIgnoreCase("Password")){
			System.out.println("\nWelcome back John Hannon");
			System.out.println("\nPlease confirm your details to purchase the items in your shopping cart.");
			System.out.println("\nAddress: Griffith College Dublin, South Circular Road, Dublin 8");
			System.out.println("\nCard number: 4401 **** **** 0123");
			System.out.println("Card Exp: 03/13");
			System.out.println("\nTo purchase your cart click Y.");
			System.out.println("To cancel click N.");
			String ans = in.next();
			if(ans.equalsIgnoreCase("Y")){
				System.out.println("Thank you. You're items will be delivered in 5-7 working days.");
				writeReceipt(convertProdsStr(prodsChosen), convertCartStr(shopCart));
				System.out.println("\nYour receipt is printed.");
			}else if(ans.equalsIgnoreCase("N")){
				System.out.println("Thank you for visiting us.\nWe will store this cart for your next visit.");
			}
		}else{
			//If the user confirms the purchase print a receipt.
			System.out.print("\nUsername and/or password incorrect.\nPlease try again");
			checkOut();
		}
	}
	
	//Convert the products chosen to a string.
	static String convertProdsStr(ArrayList<ProductsChosen> products){
		
		products = prodsChosen;
		String prodID = "";
		String prodDescription = "";
		String prodPrice = "";
		String convertStr = "";	
		String[] receipt = new String[products.size()];
				
		for(int i=0; i<receipt.length; i++){ 
			ProductsChosen prodList = products.get(i);
			prodID = String.valueOf(prodList.productID);
			prodPrice = String.format("%.2f", prodList.productPrice);					
			prodDescription = prodList.productDescription;	
			convertStr += prodID+"; "+prodDescription+"; €"+prodPrice+"\n";
			
		}
		return convertStr;
	}
		
	//Convert the shopping cart items to a string
	static String convertCartStr(ArrayList<ShoppingCart> cart){
		cart = shopCart;
		String receipt2 = "";
		String subtotCost = "";
		String deliveryEstim = "";
		String VATax = "";
		String totalCost ="";
		for(int i =0; i<cart.size(); i++){
			ShoppingCart receiptSC = cart.get(i);
			double subCost = receiptSC.totCost;
			subtotCost = String.format("%.2f", subCost);
			double delivEstim = receiptSC.delivEstim;
			deliveryEstim = String.format("%.2f", delivEstim);
			double VAT = receiptSC.VAT;
			VATax = String.format("%.2f", VAT);
			double totCost = (subCost+delivEstim);
			totalCost = String.format("%.2f", totCost);		
			}
		receipt2 = "\nSub Total: €"+subtotCost+"\nDelivery cost: €"+deliveryEstim+"\n\nTotal Price: €"+
					totalCost+"\n\nVAT @ 12% is included in the price.\nVAT: €"+VATax;
		
		return receipt2;
	}
	
	//Create a method to write the receipt to a file.
		static void writeReceipt(String receipt1, String receipt2){
			//String receiptNew 
			FileWriter fw;			
			try {	
					fw = new FileWriter("Receipt.txt", false);
					fw.write(receipt1 + "\n");
					fw.write(receipt2);
					fw.close();
					} catch (IOException e) {
					
					e.printStackTrace();
					}
			
		}
		
	public static void main(String[] args){	
		//Print the list of products for the user to choose. 
		listProds(products);
		
		//Create an array using the getProdID method which defines the products chosen by the user.
		getProdID();
		
		//Show the products and the cost totals using the showCart method.
		showCart(addCart());
		
		//Get the user login details to check out and print a receipt.
		checkOut();
		
	}
	
}
