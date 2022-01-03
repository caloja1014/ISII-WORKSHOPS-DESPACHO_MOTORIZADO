package ec.edu.espol.workshops;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BranchCoverageTest {

    @Test
	public void test1(){
		Sex s= Sex.MALE;
		MaritalStatus marritalSt = MaritalStatus.MARRIED;
		CarInsurance insurance = new CarInsurance(s,marritalSt,45);
		insurance.setPremiumIns();
		
		int premium = insurance.getBasePremium();
		assertEquals(premium,400);
	}
	
	@Test
	public void test2(){
		Sex s= Sex.MALE;
		MaritalStatus marritalSt = MaritalStatus.MARRIED;
		CarInsurance insurance = new CarInsurance(s,marritalSt,35);
		insurance.setPremiumIns();
		
		int premium = insurance.getBasePremium();
		assertEquals(premium,300);
	}
	
	@Test
	public void test3(){
		Sex s= Sex.MALE;
		MaritalStatus marritalSt = MaritalStatus.NOTMARRIED;
		CarInsurance insurance = new CarInsurance(s,marritalSt,24);
		insurance.setPremiumIns();
		
		int premium = insurance.getBasePremium();
		assertEquals(premium,2000);
	}
	
	@Test
	public void test4(){
		Sex s= Sex.FEMALE;
		MaritalStatus marritalSt = MaritalStatus.NOTMARRIED;
		int age =85;
		CarInsurance insurance = new CarInsurance(s,marritalSt,age);
		insurance.setPremiumIns();
		
		int premium = insurance.getBasePremium();
		assertEquals(premium,-1);
	}
}
