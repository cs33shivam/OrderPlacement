
import java.util.HashMap;
import java.util.Map;

public class Constants {
	
	public static Map<String,MenuItem> allMenuItems()
	{
		MenuItem cofee = new MenuItem("Coffee", 5);
		MenuItem chai = new MenuItem("Chai", 4);
		MenuItem bananaSmoothie = new MenuItem("Banana Smoothie", 6);
		MenuItem strawberryShake = new MenuItem("Strawberry Shake", 7);
		MenuItem mojito = new MenuItem("Mojito", 7.5);
		Map<String,MenuItem> items =new HashMap<>();
		items.put(cofee.getName(),cofee);
		items.put(chai.getName(),chai);
		items.put(bananaSmoothie.getName(),bananaSmoothie);
		items.put(strawberryShake.getName(),strawberryShake);
		items.put(mojito.getName(),mojito);
		return items;
		
	}
	
	public static Map<String,Ingredient> allIngredients()
	{
		Ingredient milk = new Ingredient("milk", 1);
		Ingredient sugar = new Ingredient("sugar", 0.5);
		Ingredient soda = new Ingredient("soda", 0.5);
		Ingredient mint = new Ingredient("mint", 0.5);
		Ingredient water = new Ingredient("water", 0.5);			
		Map<String,Ingredient> inMap = new HashMap<>();
		inMap.put(milk.getName(), milk);
		inMap.put(sugar.getName(), sugar);
		inMap.put(soda.getName(), soda);
		inMap.put(mint.getName(), mint);
		inMap.put(water.getName(), water);
		return inMap;
		
	}

}
