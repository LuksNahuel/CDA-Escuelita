package com.login;

import java.util.Map;

import org.springframework.stereotype.Service;

import com.login.DummyBase;

@Service
public class DummyService {
	
	Map<String, String> dB = DummyBase.getMap();
	
	public void registroUsuario(User user) {
		dB.put(user.getUsername(), user.getPassword());
	}
	
	public boolean existeUsuario(User user) {
		return dB.containsKey(user.getUsername());
	}
	
	public boolean loginUsuario(User user) {
		return dB.get(user.getUsername()).equals(user.getPassword());
	}
}