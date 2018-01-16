package com.jkm.services;

import com.jkm.entity.Operator;

public interface OperatorService {
	
	public  Operator findOperator(Integer operatorId);
	
	public  int createOperator(Operator operator);
	
	public  void updateOperator(Operator operator);
	
	public  void deleteOperator(Integer operatorId);

}
