import java.util.List;

public class Order {

	private MenuItem item;
	private List<Ingredient> missingIngredient;
	private double price;
	
	
	public Order(MenuItem item, List<Ingredient> missingIngredient) {	
		this.item = item;
		this.missingIngredient = missingIngredient;
	}
	

	public double getPrice() {
		this.price = item.getPrice();
		if(missingIngredient!=null)
		{
			missingIngredient.forEach(item->this.price = this.price-item.getPrice());
		}
		return this.price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	public MenuItem getItem() {
		return item;
	}
	public void setItem(MenuItem item) {
		this.item = item;
	}
	public List<Ingredient> getMissingIngredient() {
		return missingIngredient;
	}
	public void setMissingIngredient(List<Ingredient> missingIngredient) {
		this.missingIngredient = missingIngredient;
	}
	
	
	
}
