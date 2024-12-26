///////////////////////////////////////////////////////////////////////////
//Full Name : Constantinos Giannaras
//Yorku Email : costag@my.yorku.ca
//Date : 2024-01-29
//Authenticity Declaration :
//I declare this submission is the result of my own work and has not been
//shared with any other student or 3rd party content provider.This submitted
//piece of work is entirely of my own creation.
//////////////////////////////

public class Lab3 {

	public static String printStars(int n) {
	    String s = "";
	    for (int i = 1; i <= n; i++) {
	        for (int j = 1; j <= n; j++) {
	            if (j < i) {
	                s += "-";
	            } else {
	                s += "*";
	            }
	        }
	        if (i<n) {
	        	s += "\n";
	        }
	    }
	    return s;
	}
	
	public static String expand (int num, int d) {
		
		if (num<=0 || d<=0) {
			return "Invalid";
		} else {
			String s = "";
		    String n = Integer.toString(num);
		    for (int i=0; i<d; i++) {
		    	if(d-i-1 < 1) {
		    		s += n.charAt(i);
		    	} else {
		    		s += n.charAt(i) +"*"+ (int)Math.pow(10,d-i-1);
		    	}
	
		    	if(i < d-1) {
		    		s += " + ";
		    	}
		    }
			return s;	
		}
	}
	
	public static String getSeqStat(int ft, int d, int n) {
		String s = "";
		int sum = 0;
		int product = 1;
		s += "{";
		for (int i=1; i<=n; i++) {
			s += "[<";
			for(int j=0; j<i; j++) {
				s += ft + d*j;
				sum += ft + d*j;
				product *= ft + d*j;
				if (j<i-1) {
					s += ", ";
				}
			}
			s += ">: " + sum + ", " + product + "]";
			sum = 0;
			product = 1;
			if (i<n) {
				s += "; ";
			}
		}
		s += "}";
		return s;
	}
	
	public static String seqInterleaving(int ft1, int d1, int n1, int ft2, int d2, int n2) {
		int place1 = 0;
		int place2 = 0;
		String s = "<";
		for(int i = 1; i<= n1 + n2; i++) {
			if (place2>=n2 || i%2 >0 && place1<n1) {
				s += ft1 + d1*place1;
				place1++;
			} else if (place1>=n1 || i%2 ==0 && place2<n2){
				s += ft2 + d2*place2;
				place2++;
			}
			if (i<n1 + n2 ) {
				s += ", ";
			}
		}
		s += ">";
		return s;
	}	
	
}
