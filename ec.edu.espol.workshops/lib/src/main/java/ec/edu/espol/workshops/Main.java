package ec.edu.espol.workshops;

import java.util.Locale;
import java.util.Scanner;

/**
 * 
 * @author Jaime
 *  
 */
public class Main { 
	
	public static void main(String args[]) {
		Scanner scanObj = new Scanner(System.in,"utf-8");
		for (int i=0; i<3;i++) {
			System.out.println("Enter your age");
			int age = scanObj.nextInt();
			System.out.println("Enter your sex M for Male and F for Female");
			scanObj.nextLine();
			String sex = scanObj.nextLine().toUpperCase(Locale.getDefault());
			Sex s = sex.equals("M") ? Sex.MALE : Sex.FEMALE;
			
			System.out.println("Are you married or not? (Y)/(N)");
			String isMarried = scanObj.nextLine().toUpperCase(Locale.getDefault());
			MaritalStatus marrSt = "Y".equals(isMarried) ? MaritalStatus.MARRIED : MaritalStatus.NOTMARRIED;
			
			CarInsurance ci = new CarInsurance(s,marrSt,age);
			ci.setPremiumIns();
			
			int premium = ci.getBasePremium();
			System.out.println("The value of your premium is "+premium);
			
			switch (i) {
			case 0:
				Main.test1(ci);
				break;
			case 1:
				Main.test2(ci);
				break;
			case 2:
				Main.test3(ci);
				break;
			}
		}
		scanObj.close();
	}
	/*
	 * Age: 20
	 * Sex: Malej
	 * Martial Status: Not Married
	 */
	public static void test1(CarInsurance ci) {
		System.out.println("Test 1");
		boolean value=ci.getBasePremium()==2000;
		if (value) {
			System.out.println("Test 1 passed...");
		}
		else {
			System.out.println("Test 1 not passed...");
		}
		
	} 
	/*
	 * Age: Not Care
	 * Sex: Female
	 * Martial Status: Married
	 */
	public static void test2(CarInsurance ci) {
		System.out.println("Test 2");
		boolean value=ci.getBasePremium()==300;
		if (value) {
			System.out.println("Test 1 passed...");
		}
		else {
			System.out.println("Test 1 not passed...");
		}
	} 
	/*
	 * Age: 46
	 * Sex: No Care
	 * Martial Status: Not Care
	 */
	public static void test3(CarInsurance ci) {
		System.out.println("Test 3");
		boolean value=ci.getBasePremium()==400;
		if (value) {
			System.out.println("Test 1 passed...");
		}
		else {
			System.out.println("Test 1 not passed...");
		}
	} 
}
