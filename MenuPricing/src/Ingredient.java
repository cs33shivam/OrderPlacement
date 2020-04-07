
public class Ingredient {

	private String name;
	private double price;
	
	public Ingredient(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	@Override
	public boolean equals(Object obj) {
		Ingredient item = (Ingredient) obj;
		if(this.name.equalsIgnoreCase(item.getName()))
		{
			return true;
		}
         return false;
	}
	
}
