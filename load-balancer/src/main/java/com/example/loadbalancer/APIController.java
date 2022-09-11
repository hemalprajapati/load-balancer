package com.example.loadbalancer;

import java.util.Map;

import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Value;
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

//Rest Controller which handles request

@RestController
@RequestMapping("/api")
public class APIController {

	@Value("${server.port}")
	private String port;

	@PostMapping("/post-data")
	public Map<String, Object> postData(@RequestBody Map<String, Object> payload) {
		payload.put("Port", port);
		return payload;


	}

	@GetMapping("/get-data")
	@ResponseBody
	public ResponseEntity<Object> postData() {

		return new ResponseEntity<>("get data from : " + port, HttpStatus.OK);
	}
}
