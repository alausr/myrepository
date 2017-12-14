package com.shengpay.ws;

import javax.xml.ws.Endpoint;

public class MainServer {

	public static void main(String[] args) {

		String address = "http://localhost:1234/sayHello";
		HelloWSServiceImpl service = new HelloWSServiceImpl();
		Endpoint.publish(address, service);
		System.out.println("服务发布成功");
	}

}
