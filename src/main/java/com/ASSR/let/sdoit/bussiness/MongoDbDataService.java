package com.ASSR.let.sdoit.bussiness;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MongoDbDataService implements DataService{

	@Override
	public int[] retriveData() {
		// TODO Auto-generated method stub
		return new int[] {1,9,7,8,10};
	}

	@Override
	public void info() {
		// TODO Auto-generated method stub
		
	}
	

}
