import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Lab2Test {

	@Test
	void testgetCalories1() {
		double calories = Lab2.getCalories(1, 25, 70.0, 170.0, false);
		assertEquals("Failed getCalories 1",1642.5,calories,0.0001);
	}
	@Test
	void testgetCalories2() {
		double calories = Lab2.getCalories(2, 35,60.0, 160.0, false);
		assertEquals("Failed getCalories 2",1264.0,calories,0.0001);
	}
	@Test
	void testgetCalories3() {
		double calories = Lab2.getCalories(1, 25, 70.0, 170.0, true);
		assertEquals("Failed getCalories 3",1971.0,calories,0.0001);
	}
	@Test
	void testgetCalories4() {
		double calories = Lab2.getCalories(2, 35,-52.6, 145.3, true);
		assertEquals("Failed getCalories 4",-1,calories,0.0001);
	}
	@Test
	void testgetCalories5() {
		double calories = Lab2.getCalories(3, 35,52.6, 145.3, true);
		assertEquals("Failed getCalories 5",-1,calories,0.0001);
	}
	@Test
	void testgetCalories6() {
		double calories = Lab2.getCalories(1, 50, 65.0, -167.0, true);
		assertEquals("Failed getCalories 6",-1,calories,0.0001);
	}
	@Test
	void testgetCalories7() {
		double calories = Lab2.getCalories(1, 0, 65.0, -150, true);
		assertEquals("Failed getCalories 7",-1,calories,0.0001);
	}
	
	@Test
	void computeTax1() {
		double tax = Lab2.computeTax(50000.0);
		assertEquals("Failed computeTax 1",9237.5,tax,0.0001);
	}
	@Test
	void computeTax2() {
		double tax = Lab2.computeTax(6000.0);
		assertEquals("Failed computeTax 2",600.0, tax,0.0001);
	}
	@Test
	void computeTax3() {
		double tax = Lab2.computeTax(120000.0);
		assertEquals("Failed computeTax 3", 28227.0,tax,0.0001);
	}
	@Test
	void computeTax4() {
		double tax = Lab2.computeTax(-15000.0);
		assertEquals("Failed computeTax 4",-1.0,tax,0.0001);
	}
	@Test
	void computeTax5() {
		double tax = Lab2.computeTax(7150.0);
		assertEquals("Failed computeTax 5", 715.0,tax,0.0001);
	}
	@Test
	void computeTax6() {
		double tax = Lab2.computeTax(29050.0);
		assertEquals("Failed computeTax 6",4000.0,tax,0.0001);
	}
	@Test
	void computeTax7() {
		double tax = Lab2.computeTax(27500.0);
		assertEquals("Failed computeTax 7",3767.50,tax,0.0001);
	}
	@Test
	void validDate1() {
		boolean valid = Lab2.validDate(31, 2, 2022);
		assertEquals("Failed validDate 1", false, valid);
	}
	@Test
	void validDate2() {
		boolean valid = Lab2.validDate(31, 3, 1765);
		assertEquals("Failed validDate 2", true, valid);
	}
	@Test
	void validDate3() {
		boolean valid = Lab2.validDate(29, 2, 1600);
		assertEquals("Failed validDate 3", true, valid);
	}
	@Test
	void validDate4() {
		boolean valid = Lab2.validDate(29, 2, 2022);
		assertEquals("Failed validDate 4", false, valid);
	}
	@Test
	void validDate5() {
		boolean valid = Lab2.validDate(0, 2, 2022);
		assertEquals("Failed validDate 5", false, valid);
	}
	@Test
	void validDate6() {
		boolean valid = Lab2.validDate(29, 0, 2022);
		assertEquals("Failed validDate6", false, valid);
	}
	@Test
	void validDate7() {
		boolean valid = Lab2.validDate(12, 10, 876);
		assertEquals("Failed validDate6", false, valid);
	}
}
