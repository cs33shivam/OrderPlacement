import java.util.List;

import org.junit.Assert;
import org.junit.Test;


public class Testing {

    @Test
	public void testBulkOrderPlacement() {
		
		OrderPlacement orderPlacement = new OrderPlacement();
		String[] order= {"Chai,-sugar", "Chai", "Coffee,-milk","Mojito,-water,-mint,-soda"};
		List<Order> orders = orderPlacement.makeAOrder(order);
		Assert.assertEquals(3.5, orders.get(0).getPrice(),0.0);
		Assert.assertEquals(4.0, orders.get(1).getPrice(),0.0);
		Assert.assertEquals(4.0, orders.get(2).getPrice(),0.0);
		Assert.assertEquals(6.0, orders.get(3).getPrice(),0.0);
	}
    
    @Test
	public void testSingleOrderPlacementWithMultipleReplacement() {	
		OrderPlacement orderPlacement = new OrderPlacement();
		String[] order= {"Banana Smoothie,-milk,-water"};
		List<Order> orders = orderPlacement.makeAOrder(order);
		Assert.assertEquals(4.5, orders.get(0).getPrice(),0.0);
	}
    
    @Test
   	public void testSingleOrderPlacementWithNoReplacement() { 		
   		OrderPlacement orderPlacement = new OrderPlacement();
   		String[] order= {"Strawberry Shake"};
   		List<Order> orders = orderPlacement.makeAOrder(order);
   		Assert.assertEquals(7.0, orders.get(0).getPrice(),0.0);
   	}
	
}
