package ec.edu.espol.workshops;

import ejemploS.MaritalStatus;
import ejemploS.Sex;

enum Sex {
	MALE, FEMALE
}

enum MaritalStatus {
	MARRIED, NOTMARRIED
}

public class CarInsurance {
	private int basePremium;
	private Sex sex;
	private MaritalStatus maritalStatus;

	public CarInsurance() {
		this.basePremium = 500;
	}

	public int getBasePremium() {
		return basePremium;
	}

	public void setBasePremium(int basePremium) {
		this.basePremium = basePremium;
	}

	public Sex getSex() {
		return sex;
	}

	public void setSex(Sex sex) {
		this.sex = sex;
	}

	public MaritalStatus getMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(MaritalStatus maritalStatus) {
		this.maritalStatus = maritalStatus;
	}
}
