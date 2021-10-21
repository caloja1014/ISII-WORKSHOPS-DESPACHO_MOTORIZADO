package ec.edu.espol.workshops;

import java.util.Locale;
import java.util.Scanner;

public class Main {
	
	public static void main(String args[]) {
		Scanner scanObj = new Scanner(System.in,"utf-8");
		System.out.println("Enter your age");
		int age = scanObj.nextInt();
		
		System.out.println("Enter your sex M for Male and F for Female");
		scanObj.nextLine();
		String sex = scanObj.nextLine().toUpperCase(Locale.getDefault());
		Sex s = sex.equals("M") ? Sex.MALE : Sex.FEMALE;
		
		System.out.println("Are you married or not? (Y)/(N)");
		String isMarried = scanObj.nextLine().toUpperCase(Locale.getDefault());
		MaritalStatus marrSt = isMarried.equals("Y") ? MaritalStatus.MARRIED : MaritalStatus.NOTMARRIED;
		
		CarInsurance ci = new CarInsurance(s,marrSt,age);
		ci.setPremiumIns();
		
		int premium = ci.getBasePremium();
		System.out.println("The value of your premium is "+premium);
		scanObj.close();
	}
}
