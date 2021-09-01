package com.example.demo.testing;


import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import com.example.demo.entities.ValidateUser;
public class UserTest {
	public ValidateUser validation;
	@Rule
public ExpectedException exception= ExpectedException.none();
@Before
public void initalize()
{
	validation=new ValidateUser();
	
}
@Test
public void testNotempty()
{
	assertTrue(validation.verifchaine("test"));
	
}
@Test
public void verifage()
{
assertTrue(validation.verifage(23));	
}
@Test
public void verifEmail()
{
assertTrue(validation.verifmail("test@gmail.com"));	

}
@Test
public void verifconvert()
{
exception.expect(NumberFormatException.class);
validation.conversible("21a");

}
}
