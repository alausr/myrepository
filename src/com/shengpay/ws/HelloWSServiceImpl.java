package com.shengpay.ws;

import javax.jws.WebService;
import javax.xml.ws.ServiceMode;

@WebService
public class HelloWSServiceImpl implements HelloWS{

	@Override
	public String sayHello(String name) {
		return null;
	}

}
