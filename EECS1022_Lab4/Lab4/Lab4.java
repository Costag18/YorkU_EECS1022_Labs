

public class Lab4 {
	public static int longestSeq (int[] array) {
		int oldcount = 0;
		int count = 0;
		if (array.length >0) {
			oldcount =1;
			count =1;
			for ( int i = 1; i<=array.length -1 ; i++){
				if (array[i-1] == array[i]-1) {
					count += 1;
				} else {
					if (count>oldcount) {
						oldcount = count;
					}
					count =1;
				}
			}
		}
		return Math.max(oldcount, count);

	}

	public static String countArray (int[] array) {
		String output = "";
		int countSize = 0;
		int[][] count = new int[2][array.length];
		boolean wasInCount = false;
		for (int i=0; i<array.length; i++) {
			if (array[i]%2==0 && array[i]>=2 && array[i]<100) {
				wasInCount=false;
				for (int j=0; j<count[0].length; j++) {
					if (count[0][j]==array[i]) {
						count[1][j]+=1; //increment reccuring count
						wasInCount=true;
					}
				}
				if(wasInCount==false) { //make new count slot
					count[0][countSize]=array[i];
					count[1][countSize]=1;
					countSize++;
				}
			}
		}
		for (int k=0; k<countSize; k++) {
			output += count [0][k] + ": " + count[1][k];
			if (k<countSize-1) {
				output += "\n";
			}
		}
		return output;
	}
	
	public static boolean validString (String str1, String str2) {
		if (str1.length() < str2.length()) {//str1 is shorter than str2
	        return false;
	    }
	    int str2Index = 0;
	    // Iterate through each character in str1
	    for (int i = 0; i < str1.length(); i++) {
	        if (str2Index < str2.length() && str1.charAt(i) == str2.charAt(str2Index)) {
	            str2Index++;
	        }
	    }
	    return str2Index == str2.length();
	}
	
	public static String arrayResult(int[][] array) {
	 	int sum = 0;
	    int product = 0;
	    for (int i = 0; i < array.length; i++) {
	        for (int j = 0; j < array[i].length; j++) {
	            if ((i + j) % 2 == 0) {
	                sum += array[i][j];
	            } else {
	            	if (product == 0) {
	            		product = 1;
	            	}
	                product *= array[i][j];
	            }
	        }
	    }
	    return "Sum:" + sum + ", Product:" + product;
	}
	
	public static boolean magicSquare(int[][] array) {
	 	int n = array.length;
	 	int mainDiagonalSum = 0;
	    int antiDiagonalSum = 0;
	    // Calculate the expected sum (magic sum)
	    int expectedSum = n * (n * n + 1) / 2;
	    // Check rows and columns
	    for (int i = 0; i < n; i++) {
	        int rowSum = 0;
	        int colSum = 0;

	        for (int j = 0; j < n; j++) {
	            rowSum += array[i][j];
	            colSum += array[j][i];
	        }
	        if (rowSum != expectedSum || colSum != expectedSum) {
	            return false;
	        }
	    }
	    for (int i = 0; i < n; i++) {
	        mainDiagonalSum += array[i][i];
	        antiDiagonalSum += array[i][n - 1 - i];
	    }
	    return mainDiagonalSum == expectedSum && antiDiagonalSum == expectedSum;
	}
	
}
