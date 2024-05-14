package com.liveasy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.liveasy.entities.Payload;
import com.liveasy.services.loadServices;

@RestController
public class MyController {
	
	@Autowired
	private loadServices LoadServices;
	
	//add loads
	@PostMapping("/load")
	public Payload addLoad(@RequestBody Payload payload) {
		return this.LoadServices.addLoad(payload);
		
	}
	
	


	//get loads
	
	@GetMapping("/load/{shipperId}")
	public Payload getLoads(@PathVariable long shipperId){
		 return  LoadServices.getLoads(shipperId);
		 
		}
	
	
	


	
	//update load by loadId
	@PutMapping("/load/name/{loadId}")
	public Payload updateLoad(@RequestBody Payload payload) {
		return this.LoadServices.updateLoad(payload);
		
	}
	
	
	//get by loadid
	@GetMapping("/load/id/{loadId}")
	public Payload getLoadId(@PathVariable   long loadId) {
	return this.LoadServices.getLoadId(loadId);
	}
	
	
	
	//delete load by loadId
	@DeleteMapping("/load/loadId/{loadId}")
	public ResponseEntity<HttpStatus> deleteLoad(@PathVariable String loadId){
		try {
			this.LoadServices.deleteLoad(Long.parseLong(loadId));
			return  new ResponseEntity<>(HttpStatus.OK);
			
		}catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	

}
