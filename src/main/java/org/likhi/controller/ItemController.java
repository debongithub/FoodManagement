package org.likhi.controller;

import java.util.List;

import org.likhi.utils.ItemUtility;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import orgi.likhi.beans.MyItem;
import orgi.likhi.beans.OrderItemBean;

@RestController

public class ItemController {

	@RequestMapping(value = "/createItems", method = RequestMethod.POST)
	public String createItems(@RequestBody OrderItemBean inputs) {

		// Verify if the inout has all necessary data
		System.out.println("My input :" + inputs);

		// Call Business Layer for actual validateion
		boolean validateFlag = ItemUtility.validateMyItem(inputs);
		
		//Once validated save data to database

		if (validateFlag) {
			ItemUtility.saveMyOrderIntoDB(inputs);
		}

		return "Your order is received.";
	}
}
