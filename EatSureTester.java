class EatSureTester{
public static void main(String foodItem[]){
	double price = EatSure.search("kabab");
	System.out.println("foodItem is kabab:" + price);
		
	double priceWithQuantity = EatSure.search("kabab",4);
	System.out.println("the price of kabab is:" + priceWithQuantity);

}
}