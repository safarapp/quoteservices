package com.jkm.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.jkm.entity.CityInfo;

@Service
@Transactional(propagation = Propagation.REQUIRES_NEW, readOnly = true)
public class ReferenceService {

	public List<CityInfo> getCities() {
		List<CityInfo> cityList = new ArrayList<CityInfo>();
		CityInfo city1 = new CityInfo(1, 1, "Delhi", "Delhi", "110045");
		CityInfo city2 = new CityInfo(2, 2, "Agra", "Uttar Pradesh", "230045");
		cityList.add(city1);
		cityList.add(city2);
		return cityList;
	}
}
