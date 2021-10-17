package ec.edu.espol.workshops;

enum Sex{
	MALE,
	FEMALE
}
enum MaritalStatus{
	MARRIED,
	NOTMARRIED
}

public class CarInsurance {
	private int basePremium;
	private Sex sex;
	private MaritalStatus maritalStatus;
	
	public CarInsurance () {
		this.basePremium=500;
	}	
}
