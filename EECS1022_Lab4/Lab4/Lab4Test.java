
import static org.junit.jupiter.api.Assertions.*;

import org.junit.FixMethodOrder;
import org.junit.jupiter.api.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

class Lab4Test {

	@Test
	void longestSeq1() {
		int[] a = {7,9,10,-3,-2,-1,12,25};
		assertEquals(3, Lab4.longestSeq(a),"Failed longestSeq1");
	}
	@Test
	void longestSeq2() {
		int[] a = {};
		assertEquals(0, Lab4.longestSeq(a),"Failed longestSeq2");
	}
	@Test
	void longestSeq3() {
		int[] a = {7,9,16,-3,-8,-6,12,40};
		assertEquals(1, Lab4.longestSeq(a),"Failed longestSeq3");
	}
	@Test
	void longestSeq4() {
		int[] a = {4,10,15,-3,-8,-7,25};
		assertEquals(2, Lab4.longestSeq(a),"Failed longestSeq4");
	}
	@Test
	void longestSeq5() {
		int[] a = {7,9,76,-3,-2,-9,4,5,6,7,11,12};
		assertEquals(4, Lab4.longestSeq(a),"Failed longestSeq5");
	}
	@Test
	void longestSeq6() {
		int[] a = {7,9,15,-3,-2,-1,0,1,5,6,7,8,12,13};
		assertEquals(5, Lab4.longestSeq(a),"Failed longestSeq6");
	}

	@Test
	void countArray1() {
		int [] a = {2,10,10,98,3,146};
		String expected = "2: 1\n10: 2\n98: 1";
		assertEquals(expected, Lab4.countArray(a),"Failed countArray1");
	}
	@Test
	void countArray2() {
		int [] a = {};
		String expected = "";
		assertEquals(expected, Lab4.countArray(a),"Failed countArray2");
	}
	@Test
	void countArray3() {
		int [] a = {6,12,6,6,18,45};
		String expected = "6: 3\n12: 1\n18: 1";
		assertEquals(expected, Lab4.countArray(a),"Failed countArray3");
	}
	@Test
	void countArray4() {
		int [] a = {7,13,9,9,19,45};
		String expected = "";
		assertEquals(expected, Lab4.countArray(a),"Failed countArray3");
	}
	@Test
	void validString1() {
		assertEquals(true, Lab4.validString("heeaaaaaloloae", "hello"),"Failed validString1");
	}
	@Test
	void validString2() {
		assertEquals(false, Lab4.validString("hleolao", "hello"),"Failed validString2");
	}
	@Test
	void validString3() {
		assertEquals(true, Lab4.validString("I Love Jaiouav a much!", "Java"),"Failed validString3");
	}
	@Test
	void validString4() {
		assertEquals(false, Lab4.validString("certeedinnnadn", "certain"),"Failed validString4");
	}

	@Test
	void arrayResult1() {
		int[][] a = {{8,1,6},{3,5,7},{4,9,2}};
		assertEquals("Sum:25, Product:189", Lab4.arrayResult(a),"Failed arrayResult1");
	}
	@Test
	void arrayResult2() {
		int[][] a = {{8}};
		assertEquals("Sum:8, Product:0", Lab4.arrayResult(a),"Failed arrayResult2");
	}

	@Test
	void magicSquare1() {
		int[][] a = { {8, 1, 6},
					  {3, 5, 7},
					  {4, 9, 2} };
		assertEquals(true, Lab4.magicSquare(a),"Failed magicSquare1");
	}
	@Test
	void magicSquare2() {
		int[][] a = { {8, 10, 6},
					  {3, 5, 4},
					  {4, 9, 2} };
		assertEquals(false, Lab4.magicSquare(a),"Failed magicSquare2");
	}
	@Test
	void magicSquare3() {
		int[][] a = {{1}};
		assertEquals(true, Lab4.magicSquare(a),"Failed magicSquare3");
	}
	@Test
	void magicSquare4() {
		int[][] a = { {3, 16, 2, 13},
					  {6,  9, 7, 12},
					  {10, 5, 11, 8},
					  {15, 4, 14, 1} };
		assertEquals(false, Lab4.magicSquare(a),"Failed magicSquare4");
	}

}
