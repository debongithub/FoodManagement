package org.likhi.utils;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import orgi.likhi.beans.MyItem;
@Service
public class ItemUtility {
	private List<MyItem> topics= Arrays.asList(
			new MyItem("1", "Dosa", " Dosa Batter"),
			new MyItem("2", "Idli", " dli batter"),
			new MyItem("3", "Pavbaji", "Bun with Aloo curry"));
	
	public List<MyItem> getAlltopics(){
		return topics;
	}
} 

