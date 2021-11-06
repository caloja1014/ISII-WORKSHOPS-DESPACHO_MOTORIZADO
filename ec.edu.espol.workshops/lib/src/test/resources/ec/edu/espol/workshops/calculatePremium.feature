Feature: Calculate the base premium for the customer
	Scenario: Customer is a single young man.
		Given: Is male AND Not married AND is 20 years old.
		When: Calculate the base premium value.
		Then: Show 2000.

Feature: Calculate the base premium for the customer
	Scenario: Customer is a single young woman.
		Given: Is female AND married.
		When: Calculate the base premium value.
		Then: Show 300.

Feature: Calculate the base premium for the customer
	Scenario: Customer is a person.
		Given: Is 46 years old.
		When: Calculate the base premium value.
		Then: Show 400.