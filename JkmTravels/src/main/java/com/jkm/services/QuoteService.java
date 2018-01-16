package com.jkm.services;

import java.util.List;

import com.jkm.entity.QuoteRequest;
import com.jkm.entity.QuoteResponse;

public interface QuoteService {
	
	public  List<QuoteResponse>  getQuoteRecords(QuoteRequest getQuotePOJO);

}
