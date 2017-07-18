package com.teamshort.viberbot.database.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
	public class WebController {
		@Autowired
		RoomRepository repository;
		
		@RequestMapping("/save")
		public String process(){
			repository.save(new Room("001", "Smith"));
			repository.save(new Room("002", "Johnson"));
			return "Done";
		}
		
	
		@RequestMapping("/findall")
		public String findAll(){
			String result = "<html>";
			
			for(Room cust : repository.findAll()){
				result += "<div>" + cust.toString() + "</div>";
			}
			
			return result + "</html>";
		}
		
		@RequestMapping("/findbyid")
		public String findById(@RequestParam("id") long id){
			String result = "";
			result = repository.findOne(id).toString();
			return result;
		}
		
		@RequestMapping("/findbyname")
		public String fetchDataByName(@RequestParam("name") String name){
			String result = "<html>";
			
			for(Room cust: repository.findByName(name)){
				result += "<div>" + cust.toString() + "</div>"; 
			}
			
			return result + "</html>";
		}
	
}