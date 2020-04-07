import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class OrderPlacement {

	public List<Order> makeAOrder(String[] orderList) {
		Map<String,MenuItem> items = Constants.allMenuItems();
		Map<String,Ingredient> ingredients = Constants.allIngredients();
		List<Order> finalOrder = new ArrayList<>();
		if(orderList!=null)
		{
			for(String currOrder:orderList)
			{
				String[] orders = currOrder.split(",");
				MenuItem item = items.get(orders[0]);
				List<Ingredient> missingIngredients = new ArrayList<>();
				for(int i=1;i<orders.length;i++)
				{
					missingIngredients.add(ingredients.get(orders[i].substring(1,orders[i].length())));
				}
				Order order = new Order(item, missingIngredients);
				finalOrder.add(order);		
			}		
		}		
		return finalOrder;
	}
	
}
