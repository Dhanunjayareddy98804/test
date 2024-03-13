class AccessoriesTester{

public static void main(String[] accessories)
{
	
	Accessories.addAccessories("holder");
	Accessories.addAccessories("selfie stick");
	Accessories.addAccessories("power bank");
	Accessories.addAccessories("case");
	Accessories.addAccessories("earphones");
	Accessories.addAccessories("cable");

	Accessories.getAccessories();
	boolean isAccessoriesAdded = Accessories.updateAccessories("pendrive","case");

	Accessories.getAccessories();
	Accessories.deleteAccessories("cable");	
	Accessories.getAccessories();
}
}