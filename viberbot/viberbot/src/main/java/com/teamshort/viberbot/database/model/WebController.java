package com.teamshort.viberbot.database.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
	public class WebController {
		@Autowired
		RoomRepository repository;
		
		@RequestMapping("/save")
		public String process(){
			repository.save(new Room(1, "001", "Smith"));
			repository.save(new Room(2, "002", "Johnson"));
			return "Done";
		}
		
	
}