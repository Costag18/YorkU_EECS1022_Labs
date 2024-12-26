

/**
 * Objective: practice arithmetic operations, If statements, nested If statements 
 */
public class Lab1 {
	/**
	 * Takes an integer and calculates the next integer in the Collatz mathematica
	 * sequence
	 */
	public static int collatz(int n) {
		if (n>0){
			if (n%2 == 0){
				return n/2;	
			}
			else {
				return 3*n + 1;	
			}
		}
		else {
			return -1;
		}
		
	}
	
	/**
	 * Takes an GPA and SAT score of a student and returns a string if "Accepted", "Rejected",
	 * or "ScoresTooLow"
	 */
	public static String yorkAdmit (double gpa, int sat) {
		
		if (gpa<1.8 ^ sat<900) {
			return "Reject";
		}
		else if (gpa<1.8 && sat<900) {
			return "ScoresTooLow";
		}
		else {
			return "Accept";
		}
	}
		
	/**
	 * Takes coordinates of a points (x,y) and determines to which quadrant it belongs
	 */
	public static int quadrant (double x, double y) {
		
		if (x>0.0 && y>0.0) {
			return 1;
		}
		else if (x<0.0 && y>0.0) {
			return 2;
		}
		else if (x<0.0 && y<0.0) {
			return 3;
		}
		else if (x>0.0 && y<0.0) {
			return 4;
		}
		else {
			return 0;
		}
	}
	
	/**
	 * Takes inputs of two clock times in hours and minutes and determines if there is enough
	 * time between them for lunch. This time has to be at least 45 minutes.
	 */
	public static boolean enoughLunchTime(int hour1, int min1, int hour2, int min2) {
		
	    if (hour1 > 24 || hour1 < 0 || hour2 > 24 || hour2 < 0 || min1 > 60 || min1 < 0 || min2 > 60 || min2 < 0) {
	        return false;
	    } 
	    else {
	        min1 = min1 + 60 * hour1;
	        min2 = min2 + 60 * hour2;

	        if (min2 - min1 >= 45) {
	            return true;
	        } 
	        else {
	            return false;
	        }
	    }
	}
	
	/**
	 * Takes inputs as a credit card old balance and current month additional charges and 
	 * calculates the minimum payment owed 
	 */
	public static double computePayment (double oldBalance, double charges) {
		
		double interest;
		
		if (oldBalance == 0.0){
			interest = 0;
		}
		else {
			interest = (oldBalance + charges)*0.02;
		}
		
		double newBalance = oldBalance + charges + interest;
		
		if (newBalance<50.0) {
			return newBalance;
		}
		else if (newBalance>=50.0 && newBalance<=300.0) {
			return 50.0;
		} 
		else {
			return newBalance*0.2;
		}

	}
}
