package com.jkm.services;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.jkm.entity.Operator;

@Service
@Transactional(propagation=Propagation.REQUIRES_NEW, readOnly=true)
public class OperatorServiceImpl implements OperatorService{

	@Override
	public Operator findOperator(Integer operatorId) {
		Operator operator = new Operator();
		 operator.setOperatorId(operatorId);
		 operator.setFirstName("John");
		 operator.setMiddleName("Doe");
		return operator;
	}

	@Override
	public int createOperator(Operator operator) {
		return 1001;
		//call2
		//call2
		//call3
	}

	@Override
	public void updateOperator(Operator operator) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteOperator(Integer operatorId) {
		// TODO Auto-generated method stub
		
	}
	
	}
