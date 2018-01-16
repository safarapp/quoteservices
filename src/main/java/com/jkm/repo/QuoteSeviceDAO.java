package com.jkm.repo;

import java.util.List;

import com.jkm.entity.QuoteRequest;
import com.jkm.entity.QuoteResponse;

public interface QuoteSeviceDAO {
	
	public List<QuoteResponse> getQuoteRecords(QuoteRequest getQuotePOJO);
	
	/**
	 * 
	 * @param getQuotePOJO
	 */
	public void createQuoteRecord(QuoteRequest getQuotePOJO);

}
