package com.jkm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.jkm.entity.CityInfo;
import com.jkm.services.ReferenceService;


@RestController
public class ReferenceDataController {
	
	 @Autowired
	 ReferenceService referenceService;
	 
	 
	 @RequestMapping(value="/reference/city", method=RequestMethod.GET)
	 @ResponseBody
	 public ResponseEntity<List<CityInfo>> getCities() {
		 List<CityInfo> cities = referenceService.getCities();
		 return new ResponseEntity<List<CityInfo>>(cities, HttpStatus.OK);
	 }
	 	 
}
