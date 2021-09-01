package com.example.demo.entities;

public class ValidateUser implements UserInter {

	@Override
	public boolean verifchaine(String ch) {
		// TODO Auto-generated method stub
		return !ch.isEmpty();
	}

	@Override
	public boolean verifage(int age) {
		// TODO Auto-generated method stub
		return age >18;
	}

	@Override
	public void conversible(String a) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean verifmdp(String password) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean verifmail(String email) {
		// TODO Auto-generated method stub
		return false;
	}

}
