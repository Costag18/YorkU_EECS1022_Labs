///////////////////////////////////////////////////////////////////////////
//Full Name : Constantinos Giannaras
//Yorku Email : costag@my.yorku.ca
//Date : 2024-01-24
//Authenticity Declaration :
//I declare this submission is the result of my own work and has not been
//shared with any other student or 3rd party content provider.This submitted
//piece of work is entirely of my own creation.
//////////////////////////////

/**
 * Objective: practice  If statements, nested If statements, Demorgan's Law, Data Comparison 
 *
 */
public class Lab2 {
	/**
	 * Takes an integer as the gender of a person, integer age, double weigh, 
	 * double height, and a boolean athlete 
	 * and calculates the needed daily calories for that person as a double.
	 */
	public static double getCalories(int gender,int age,double weight, double height, boolean athlete) 
	 {
		if (gender != 1 && gender != 2 || age <= 0 || weight <= 0 || height <= 0) {
            return -1.0;
        }
		double calories;
        if (gender == 1) {  // Male
            calories = 10.0 * weight + 6.25 * height - 5.0 * age + 5.0;
            if (athlete) {
                calories *= (1.20);
            }
        } 
        else {  // Female
            calories = 10.0 * weight + 6.25 * height - 5.0 * age - 161.0;
            if (athlete) {
                calories *= (1.15);
            }
        }
        return calories;
	 }

		
	/**
	 * Takes a salary as a double and calculates the tax owed for this salary
	 * returns a double value. 
	 * if the salary is an invalid amount it returns -1.
	 */
	public static double computeTax(double income) {
	    if (income >= 70350.0) {
	        return 14325.0 + (income - 70350.0) * 0.28;
	    } else if (income >= 29050.0) {
	        return 4000.0 + (income - 29050.0) * 0.25;
	    } else if (income >= 7150.0) {
	        return 715.0 + (income - 7150.0) * 0.15;
	    } else if (income >= 0.0) {
	        return income * 0.1;
	    } else {
	        return -1.0;
	    }
	}
	
	/**
	 * Takes a date as three integers:day, month, and year.
	 * The method returns a true if he date is valid and false otherwise.
	 * The method checks if the month is valid, and the year is after the year 1000.
	 * It checks if the day is valid according to the month. If the month is february, 
	 * it checks if the year is a leap year
	 */
	public static boolean validDate(int day, int month, int year) {
		
	    boolean isMonthValid = (month >= 1 && month <= 12);
	    boolean isYearValid = (year >= 1000);
	    boolean isLeapYear = (year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0));

	    int daysInMonth = 0;
	    switch (month) {
	        case 1, 3, 5, 7, 8, 10, 12:
	            daysInMonth = 31;
	            break;
	        case 4, 6, 9, 11:
	            daysInMonth = 30;
	            break;
	        case 2:
	            daysInMonth = isLeapYear ? 29 : 28;
	            break;
	    }
	    boolean isDayValid = (day >= 1 && day <= daysInMonth);
	    return isMonthValid && isYearValid && isDayValid;
	}

}