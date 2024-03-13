import java.util.Arrays;
class Accessories{
	
	static String name = "Phone";
	static String accessories[] = {null,null,null,null,null,null};
	static String modelName ="samsung";
	static String modelSeriesName = "s21 fe 5g";
	static  int index;
	
	public static boolean addAccessories(String accessorie){
		System.out.println("inside addAccessories():");
		boolean isAdded = false;
		if(accessories !=null){
			
			accessories[index]= accessorie;
			index++;
			isAdded = true;
			System.out.println("Accessories are added");	
		}
		else{
			System.out.println("Accesories are not added");
		}
		System.out.println("End of addAccessories()");
		return isAdded;
		
	}
	
	   public static void getAccessories(){
		   for (int index=0; index<accessories.length; index++){
			   System.out.println(accessories [index]);
		   }
	   }
     public static boolean updateAccessories(String newAccessories, String oldAccessories){
		    boolean isUpdated = false;
			System.out.println("Before updating"); 
			 for(int index =0; index<accessories.length; index++){
				 if(accessories[index] == oldAccessories){
					  accessories [index] = newAccessories;
                      isUpdated = true ;
               System.out.println("Mobile Accessories is added");
			   
				 }
			 }
			 System.out.println("After updating");
			        return isUpdated;
	 }
	
	public static void deleteAccessories(String accessorie){
		System.out.println("Before deleting"); 
		int newIndex, oldIndex;
		for(newIndex=0,oldIndex=0; oldIndex < accessories.length;oldIndex++){
			if(accessories[oldIndex] != accessorie){
				accessories[newIndex++] = accessories[oldIndex];
			}
		}
		System.out.println("After deleting"); 
        accessories = Arrays.copyOf(accessories,newIndex);
		return;
	}

}


