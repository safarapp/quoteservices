package com.jkm.entity;

import javax.persistence.Entity;

@Entity
public class QuoteResponse {

	public String ratePerKm;
	public String businessName;
	public String busType;
	
	public String getRatePerKm() {
		return ratePerKm;
	}
	public void setRatePerKm(String ratePerKm) {
		this.ratePerKm = ratePerKm;
	}
	public String getBusinessName() {
		return businessName;
	}
	public void setBusinessName(String businessName) {
		this.businessName = businessName;
	}
	public String getBusType() {
		return busType;
	}
	public void setBusType(String busType) {
		this.busType = busType;
	}

	



}
