package com.jkm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.jkm.entity.QuoteRequest;
import com.jkm.entity.QuoteResponse;
import com.jkm.services.QuoteService;


@RestController
//@ComponentScan("com.jkm.services")
public class QuoteController {
	
	 @Autowired
	 QuoteService quoteService;
	
	 
	 /**
	  * 
	  * @param quoteRequest
	  * @return
	  */
	 @RequestMapping(value="/quote", method=RequestMethod.POST)
	 @ResponseBody
	 public List<QuoteResponse> getQuote(@RequestBody QuoteRequest quoteRequest) {
		 List<QuoteResponse> quoteList = quoteService.getQuoteRecords(quoteRequest);
		 return quoteList;
	 }
	 
	 
	 /**
	  * 
	  * @return
	  */
	 @RequestMapping(value="/test", method=RequestMethod.GET)
	 @ResponseBody
	 public QuoteRequest test() {
		 QuoteRequest getQuotePOJO2 = new QuoteRequest();
		 return getQuotePOJO2;
	 }
	 
}
