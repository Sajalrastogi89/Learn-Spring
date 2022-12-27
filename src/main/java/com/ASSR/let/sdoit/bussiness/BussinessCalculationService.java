package com.ASSR.let.sdoit.bussiness;

import java.util.Arrays;

import org.springframework.stereotype.Component;
@Component
public class BussinessCalculationService {
	DataService dataService;
public int findMax() {
	return Arrays.stream(dataService.retriveData()).max().orElse(0);
}
}
