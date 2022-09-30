package org.likhi.controller;

import java.util.List;

import org.likhi.utils.ItemUtility;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import orgi.likhi.beans.MyItem;

@RestController
public class ItemController {
	@Autowired
	private ItemUtility topicService;
	@RequestMapping("/topics")
	public List<MyItem> getAlltopics() {
		return topicService.getAlltopics();
		}
	@RequestMapping(value="/createItems",method = RequestMethod.POST)
	public List<MyItem> createItems() {
		return topicService.getAlltopics();
		}
	}
