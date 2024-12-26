
import java.util.Scanner;

public class Lab3Console {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 
		
		//test printStars()
//		System.out.println(Lab3.printStars(1));		
//		System.out.println("***\n-**\n--*");
		//test highlight()
//		System.out.println(Lab3.expand(6,1));	
//		
//		//test getSeqStat()
//		System.out.println(Lab5.getSeqStat(1,2,3));	
//		
//		//test seqInterleaving()
		System.out.println(Lab3.seqInterleaving(1,2,3,1,2,3));	
	}	
}
