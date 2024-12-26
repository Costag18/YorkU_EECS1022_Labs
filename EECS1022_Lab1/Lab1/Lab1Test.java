
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Lab1Test {

	@Test
	void testCollatzNeg() {
		int num = Lab1.collatz(-10);
		assertEquals("Failed collatz of 7",-1,num);
	}
	@Test
	void testCollatz7() {
		int num = Lab1.collatz(7);
		assertEquals("Failed collatz of 7",22,num);
	}
	@Test
	void testCollatz22() {
		int num = Lab1.collatz(22);
		assertEquals("Failed collatz of 22",11,num);
	}
	@Test
	void testCollatz67() {
		int num = Lab1.collatz(67);
		assertEquals("Failed collatz of 67",202,num);
	}
	@Test
	void testYorkAdmit1() {
		String decision = Lab1.yorkAdmit(1.5,1000);
		assertEquals("Failed yorkAdmit of 1.5 and 1000","Reject",decision);
	}
	@Test
	void testYorkAdmit2() {
		String decision = Lab1.yorkAdmit(2.3,600);
		assertEquals("Failed yorkAdmit of 2.3 and 600","Reject",decision);
	}
	@Test
	void testYorkAdmit3() {
		String decision = Lab1.yorkAdmit(2.0,1200);
		assertEquals("Failed yorkAdmit of 2.0 and 1200","Accept",decision);
	}
	@Test
	void testYorkAdmit4() {
		String decision = Lab1.yorkAdmit(1.4,700);
		assertEquals("Failed yorkAdmit of 1.4 and 700","ScoresTooLow",decision);
	}
	@Test
	void testQuadrant0() {
		int qdrt = Lab1.quadrant(0.0, 3.14);
		assertEquals("Failed quadrant of (0,3)",0,qdrt);
	}
	@Test
	void testQuadrant00() {
		int qdrt = Lab1.quadrant(12.4, 0.0);
		assertEquals("Failed quadrant of (12.4, 17.8)",0,qdrt);
	}
	@Test
	void testQuadrant1() {
		int qdrt = Lab1.quadrant(12.4, 17.8);
		assertEquals("Failed quadrant of (12.4, 17.8)",1,qdrt);
	}
	@Test
	void testQuadrant2() {
		int qdrt = Lab1.quadrant(-2.3, 3.5);
		assertEquals("Failed quadrant of (-2.3, 3.5)",2,qdrt);
	}
	@Test
	void testQuadrant3() {
		int qdrt = Lab1.quadrant(-15.2, -3.1);
		assertEquals("Failed quadrant of (-15.2, -3.1)",3,qdrt);
	}
	@Test
	void testQuadrant4() {
		int qdrt = Lab1.quadrant(4.5, -42.0);
		assertEquals("Failed quadrant of (4.5, -42.0)",4,qdrt);
	}
	@Test
	void testEnoughLunchTime1() {
		boolean elt = Lab1.enoughLunchTime (11, 00, 11, 59);
		assertEquals("Failed enoughLunchTime of (11, 00, 11, 59)",true,elt);
	}
	@Test
	void testEnoughLunchTime2() {
		boolean elt = Lab1.enoughLunchTime (12, 30, 13, 0);
		assertEquals("Failed quadrant of (12, 30, 13, 00)",false,elt);
	}
	@Test
	void testEnoughLunchTime3() {
		boolean elt = Lab1.enoughLunchTime (12, 30, 13, 15);
		assertEquals("Failed enoughLunchTime of (12, 30, 13, 15)",true,elt);
	}
	@Test
	void testEnoughLunchTime4() {
		boolean elt = Lab1.enoughLunchTime (14, 20, 17, 2);
		assertEquals("Failed enoughLunchTime of (14, 20, 17, 02)",true,elt);
	}
	@Test
	void testEnoughLunchTime5() {
		boolean elt = Lab1.enoughLunchTime (12, 30, 9, 30);
		assertEquals("Failed enoughLunchTime of (12, 30, 9, 30)",false,elt);
	}
	@Test
	void testEnoughLunchTime6() {
		boolean elt = Lab1.enoughLunchTime (12, 0, 11, 55);
		assertEquals("Failed enoughLunchTime of (12, 00, 11, 55))",false,elt);
	}
	@Test
	void testEnoughLunchTimeInvInput() {
		boolean elt = Lab1.enoughLunchTime (24, 0, 11, 60);
		assertEquals("Failed enoughLunchTime of (24, 0, 11, 60))",false,elt);
	}
	@Test
	void testComputePayment1() {
		double pay = Lab1.computePayment(0.0,40.0);
		assertEquals("Failed computePayment of (0.0,40.0))",40.0,pay,0.0000001);
	}
	@Test
	void testComputePayment2() {
		double pay = Lab1.computePayment (100.0,55.0);
		assertEquals("Failed computePayment of (100.0,55.0))",50.0,pay,0.0000001);
	}
	@Test
	void testComputePayment3() {
		double pay = Lab1.computePayment (220.0,345.0);
		assertEquals("Failed computePayment of (220.0,345.0)",115.26,pay,0.0000001);
	}
	@Test
	void testComputePayment4() {
		double pay = Lab1.computePayment (0.0,400.0);
		assertEquals("Failed computePayment of (0.0,400.0)",80.0,pay,0.0000001);
	}
}
