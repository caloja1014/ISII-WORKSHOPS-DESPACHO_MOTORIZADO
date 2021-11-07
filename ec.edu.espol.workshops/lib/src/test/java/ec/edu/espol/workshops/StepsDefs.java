package ec.edu.espol.workshops;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.And;

import static org.junit.Assert.*;


public class StepsDefs {
	private int actualAnswer;
	private CarInsurance carInsurance = new CarInsurance();
	
	@Given("Is male") 
	public void isMale() {
		carInsurance.setSex(Sex.MALE);
	}
	
	@And("Not married")
	public void notMarried() {
		carInsurance.setMaritalStatus(MaritalStatus.NOTMARRIED);
	}
	
	@And("is 20 years old")
	public void twentyYearsOld() {
		carInsurance.setAge(20);
	}
	
	@When("Calculate the base premium value")
	public void calculateBasePremium() {
		carInsurance.setPremiumIns();
		actualAnswer = carInsurance.getBasePremium();
	}
	
	@Then("Show 2000")
	public void show2000() {
		assertEquals(2000,actualAnswer);
	}
	@Then("Show 300")
	public void show300() {
		assertEquals(300,actualAnswer);
	}
	@Then("Show 400")
	public void show400() {
		assertEquals(400,actualAnswer);
	}
	
	@Given("Is female") 
	public void isFemale() {
		carInsurance.setSex(Sex.FEMALE);
	}
	
	@And("married")
	public void married() {
		carInsurance.setMaritalStatus(MaritalStatus.MARRIED);
	}
	
	@And("Is 46 years old")
	public void randomAge() {
		carInsurance.setAge(46);
	}
	
	
	
	
}
