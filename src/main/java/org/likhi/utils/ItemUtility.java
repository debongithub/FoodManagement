package org.likhi.utils;

import java.util.Arrays;
import java.util.List;

import org.likhi.FoodManagementDAO.FoodManagementDAO;
import org.springframework.stereotype.Service;

import orgi.likhi.beans.MyItem;
import orgi.likhi.beans.OrderItemBean;
@Service
public class ItemUtility {

	public static boolean validateMyItem(OrderItemBean requestInputAsBean) {
		
		boolean myCheckResults = false;
		
		if(requestInputAsBean.getNumberOfItems().length() ==0 ||requestInputAsBean.getNumberOfItems() == null )
			myCheckResults = false;
		else
			myCheckResults = true;
		
		if(requestInputAsBean.getItemName().length() ==0 ||requestInputAsBean.getItemName() == null )
			myCheckResults = false;
		else
			myCheckResults = true;
		
		if(requestInputAsBean.getRestaurantName().length() ==0 ||requestInputAsBean.getRestaurantName() == null )
			myCheckResults = false;
		else
			myCheckResults = true;
		
		
		System.out.println("Checked the bean, and the result is :" + myCheckResults );
		
		return myCheckResults;
		
	}
	
	public static boolean saveMyOrderIntoDB(OrderItemBean requestInputAsBean) {
		boolean dbSaveResult = FoodManagementDAO.inserItemIntoOrderDB(requestInputAsBean);
		return dbSaveResult;
	}
	
} 

