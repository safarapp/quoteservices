package com.jkm.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.jkm.entity.QuoteRequest;
import com.jkm.entity.QuoteResponse;
import com.jkm.repo.QuoteSeviceDAO;

@Service
@Transactional(propagation=Propagation.REQUIRES_NEW, readOnly=true)
public class QuotesServiceImpl implements QuoteService {

	@Autowired
	QuoteSeviceDAO quoteServiceDAO;

	/**
	 * 
	 */
	public List<QuoteResponse> getQuoteRecords(QuoteRequest quoteRequest) {
		return quoteServiceDAO.getQuoteRecords(quoteRequest);
	}

	/**
	 * 
	 * @param quoteRequest
	 */
	public void createQuote(QuoteRequest quoteRequest) {
		quoteServiceDAO.createQuoteRecord(quoteRequest);
	}

}
