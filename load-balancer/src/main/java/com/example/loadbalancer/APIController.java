package com.example.loadbalancer;


import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")	
public class APIController {

	@PostMapping("/post-data")
	@ResponseBody
	public ResponseEntity<Object> postData(@RequestBody String payload) {
		
		try {
	        new JSONObject(payload);
	    } catch (JSONException e) {
	    	return new ResponseEntity<>("Invalid JSON", HttpStatus.BAD_REQUEST);
	    }
		
		
		return new ResponseEntity<>(payload, HttpStatus.OK);
	}
	
	
	@GetMapping("/get-data")
	@ResponseBody
	public ResponseEntity<Object> postData() {
		
		
		return new ResponseEntity<>("get data from 9000", HttpStatus.OK);
	}
}
