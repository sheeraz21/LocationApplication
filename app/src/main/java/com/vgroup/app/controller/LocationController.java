package com.vgroup.app.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.util.UriComponentsBuilder;

import com.vgroup.app.entity.LocationInfo;
import com.vgroup.app.services.LocationServices;


@Controller
@RequestMapping("app/v1/")
@CrossOrigin(origins = "*")
public class LocationController {
	
	
	@Autowired
	LocationServices   location;
	
	@PostMapping("location/post")
	public ResponseEntity<String> addLocation(@Valid @RequestBody LocationInfo locationInfo, UriComponentsBuilder builder) {
                boolean flag = location.addLocation(locationInfo);
                HttpHeaders headers = new HttpHeaders();
                if (flag == true) {
                	 
                     headers.setLocation(builder.path("/location/{id}").buildAndExpand(locationInfo.getLocationId()).toUri());
                }
               
                return new ResponseEntity<String>(headers, HttpStatus.CREATED);
	}
	
	
	
	@GetMapping("location/")
	public ResponseEntity<List<LocationInfo>> getLocation() {
		List<LocationInfo> list = location.getAllDetails();
		return new ResponseEntity<List<LocationInfo>>(list, HttpStatus.OK);
	}
}
