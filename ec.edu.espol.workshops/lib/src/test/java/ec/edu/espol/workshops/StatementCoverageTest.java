package ec.edu.espol.workshops;
import org.junit.Test;
import java.io.*;

import static org.junit.Assert.assertEquals;
public class StatementCoverageTest {

	
	@Test
	public void test001(){
		Sex s= Sex.MALE;
		MaritalStatus marrSt = MaritalStatus.MARRIED;
		int age =45;
		CarInsurance ci = new CarInsurance(s,marrSt,age);
		ci.setPremiumIns();
		
		int premium = ci.getBasePremium();
		assertEquals(200,premium);
	}
	
	@Test
	public void test002(){
		Sex s= Sex.MALE;
		MaritalStatus marrSt = MaritalStatus.MARRIED;
		int age =35;
		CarInsurance ci = new CarInsurance(s,marrSt,age);
		ci.setPremiumIns();
		
		int premium = ci.getBasePremium();
		assertEquals(premium,300);
	}
	
	@Test
	public void test003(){
		Sex s= Sex.MALE;
		MaritalStatus marrSt = MaritalStatus.NOTMARRIED;
		int age =24;
		CarInsurance ci = new CarInsurance(s,marrSt,age);
		ci.setPremiumIns();
		
		int premium = ci.getBasePremium();
		assertEquals(premium,2000);
	}
	
	@Test
	public void test004(){
		Sex s= Sex.FEMALE;
		MaritalStatus marrSt = MaritalStatus.NOTMARRIED;
		int age =85;
		CarInsurance ci = new CarInsurance(s,marrSt,age);
		ci.setPremiumIns();
		
		int premium = ci.getBasePremium();
		assertEquals(premium,-1);
	}
}
