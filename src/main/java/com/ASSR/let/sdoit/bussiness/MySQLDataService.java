package com.ASSR.let.sdoit.bussiness;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("MySQLDataService1")
public class MySQLDataService implements DataService{

	@Override
	public int[] retriveData() {
		// TODO Auto-generated method stub
		return new int[] {5,7,6,8,45,34,65,78};
	}

}
