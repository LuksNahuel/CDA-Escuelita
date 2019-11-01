package com.login;
import java.util.HashMap;
import java.util.Map;

public class DummyBase {
	private static Map<String, String> map;
	static {
		map = new HashMap<String, String>();
		map.put("lucas", "123");
	}
	
	public static Map<String, String> getMap() {
		return map;
	}
}
