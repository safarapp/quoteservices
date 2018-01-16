package com.jkm.repo;

import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.stereotype.Repository;

import com.jkm.dbconfig.JdbcConnection;
import com.jkm.entity.QuoteRequest;
import com.jkm.entity.QuoteResponse;

@Repository
public class QuoteServiceDAOImpl extends JdbcConnection implements QuoteSeviceDAO {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public List<QuoteResponse> getQuoteRecords(QuoteRequest getQuotePOJO) {
		String sql=
		"SELECT OP.BUSINESS_NM AS businessName, VR.RATE_PER_KM AS ratePerKm  FROM jkm.vehicle_service_origin org, jkm.vehicle_service_destination des,"
		+ "jkm.vehicle_info VI,jkm.operator_info OP,jkm.vehicle_rate_detail VR "
		+ "where org.STATE_ID= "+getQuotePOJO.getFrom()
		+ "AND des.STATE_ID="+getQuotePOJO.getTo()
		+ "AND VI.VEHICLE_ID = org.VEHICLE_ID AND VI.VEHICLE_STATUS_ID='1'" 
		+ "AND VI.OPERATOR_ACCT_ID = OP.OPERATOR_ID and VR.VEHICLE_ID = VI.VEHICLE_ID";
		
//		"SELECT OP.BUSINESS_NM AS businessName, VR.RATE_PER_KM AS ratePerKm "
//		+ "FROM operator_info OP, vehicle_rate_detail VR, vehicle_info VI "
//		+ "WHERE  VR.VEHICLE_ID = VI.VEHICLE_ID and VI.OPERATOR_ACCT_ID = OP.OPERATOR_ID";
		List<QuoteResponse> resp  = getJdbcTemplate().query(sql, new BeanPropertyRowMapper(QuoteResponse.class));
		System.out.println(resp);
		return resp;
	}

	@Override
	public void createQuoteRecord(QuoteRequest getQuotePOJO) {
		// TODO Auto-generated method stub
	}

}
