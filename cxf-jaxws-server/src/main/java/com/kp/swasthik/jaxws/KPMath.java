package com.kp.swasthik.jaxws;

import javax.jws.WebMethod;
import javax.jws.WebService;

import org.springframework.stereotype.Component;

@Component
@WebService
public class KPMath {

	@WebMethod
	public int add(int a , int b) {
		return a+b;
	}
}
