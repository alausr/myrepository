package com.shengpay.ws;

import java.util.Map;
import java.util.concurrent.ConcurrentSkipListMap;

public class ConcurrentSkipListMapDemo {

	public static void main(String[] args) {
		
		Map<Integer,Integer> map = new ConcurrentSkipListMap<Integer,Integer>();
		for (int i = 0; i < 10; i++) {
			map.put(i, i);
		}
		
		System.out.println(map);
	}
}
