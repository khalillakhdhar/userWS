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

Integer.parseInt(a);	

	}

	@Override
	public boolean verifmdp(String password) {
		// TODO Auto-generated method stub
		return password.length()>5;
	}

	@Override
	public boolean verifmail(String email) {
		// TODO Auto-generated method stub
		//test.gmail@ **
		//test@gmail.com 
		//test.com
		
		if(email.contains("@"))
		{
if(email.indexOf("@")==email.length()-1)
{
	return false;
}
else 
	return true;
		}
		else 
			return false;

	
	}
	

}
