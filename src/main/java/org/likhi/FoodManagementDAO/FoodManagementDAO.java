package org.likhi.FoodManagementDAO;

import orgi.likhi.beans.OrderItemBean;

public class FoodManagementDAO {
	
	public static boolean inserItemIntoOrderDB(OrderItemBean validatedRequestBean) {
		
		System.out.println("Saving item to DB");
		
		// Add storing to DB Data here
		
		System.out.println("Saved item to DB");
		
		return true;
		
	}

}
