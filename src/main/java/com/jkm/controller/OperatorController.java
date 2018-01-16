package com.jkm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.jkm.entity.Operator;
import com.jkm.services.OperatorService;


@RestController
public class OperatorController {
	
	 @Autowired
	 OperatorService operatorService;
	 
	 
	 @RequestMapping(value="/operator/{operatorId}", method=RequestMethod.GET)
	 @ResponseBody
	 public ResponseEntity<Operator> getOperator(@PathVariable("operatorId") int operatorId) {
		 Operator operator = operatorService.findOperator(operatorId);
		 return new ResponseEntity<Operator>(operator, HttpStatus.OK);
	 }
	 
	 
	 @RequestMapping(value="/operator", method=RequestMethod.POST)
	 @ResponseBody
	 public ResponseEntity<Integer> createOperator(@RequestBody Operator operator, UriComponentsBuilder ucBuilder) {
		 int id = operatorService.createOperator(operator);
		 return new ResponseEntity<Integer>(id, HttpStatus.CREATED);
	 }
	 
	 
	 @RequestMapping(value="/operator", method=RequestMethod.PUT)
	 @ResponseBody
	 public ResponseEntity<Void> updateOperator(@RequestBody Operator operator, UriComponentsBuilder ucBuilder) {
		 operatorService.updateOperator(operator);
		 return new ResponseEntity<Void>(HttpStatus.OK);
	 }
	 
	 
	 @RequestMapping(value="/operator/{operatorId}", method=RequestMethod.DELETE)
	 @ResponseBody
	 public ResponseEntity<Void> deleteOperator(@PathVariable("operatorId") int operatorId) {
		 operatorService.deleteOperator(operatorId);
		 return new ResponseEntity<Void>(HttpStatus.OK);
	 }
	 
}
