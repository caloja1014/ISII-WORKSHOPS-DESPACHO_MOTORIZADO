package ec.edu.espol.workshops;


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
	private int age;
	
	/**
	 * 
	 * @param sex
	 * @param maritalStatus
	 * @param age
	 * @apiNote Constructs with the params and base Premium of $500
	 */
	public CarInsurance(Sex sex, MaritalStatus maritalStatus, int age) {
		
		this.sex = sex;
		this.maritalStatus = maritalStatus;
		this.age = age;
		this.basePremium = 600;
		
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
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return this.age;
	}
	
	/**
	 * @author Jaime
	 * @apiNote Sets the premium according to person's features.
	 */
	public void setPremiumIns() {
		if (this.age>=80) 
			this.basePremium = -1;
		else {
			if(this.sex.equals(Sex.MALE) && 
				this.maritalStatus.equals(MaritalStatus.NOTMARRIED) &&
				this.age < 25){	
				this.basePremium += 1500;
	
			}if(this.sex.equals(Sex.FEMALE) || 
					this.maritalStatus.equals(MaritalStatus.MARRIED)) {
				this.basePremium -= 200;
			
			}if(this.age >= 45 && this.age<65)
				this.basePremium -=100;

		}
	}	
	
}
