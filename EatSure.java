class EatSure{
public static double search(String foodItem){

if(foodItem == "kabab"){
return 50.00;
}
if(foodItem == "chicken masala"){
return 50.00;
}
if(foodItem == "chicken tikka"){
return 50.00;
}
if(foodItem == "palav"){
return 70.00;
}
if(foodItem == "idli"){
return 60.00;
}
if(foodItem == "dosa"){
return 60.00;
}
return 0.0;
}

public static double search(String foodItem,int quantity){
if(foodItem == "kabab"){
return 50.00;
}
if(foodItem == "chicken masala"){
return 50.00;
}
if(foodItem == "chicken tikka"){
return 50.00;
}
if(foodItem == "palav"){
return 70.00;
}
if(foodItem == "idli"){
return 60.00;
}
if(foodItem == "dosa"){
return 60.00;
}
return 0.0;
}
}