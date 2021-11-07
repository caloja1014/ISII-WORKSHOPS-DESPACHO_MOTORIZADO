Feature: Calculate the base premium for the customer
	Scenario: Customer is a single young man
		Given Is male 
		And Not married 
		And is 20 years old
		When Calculate the base premium value
		Then Show 2000

	Scenario: Customer is a single young woman
		Given Is female 
		And married
		When Calculate the base premium value
		Then Show 300

	Scenario: Customer is a person
		Given Is male
		And Is 46 years old
		And Not married
		When Calculate the base premium value
		Then Show 400