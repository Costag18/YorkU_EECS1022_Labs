package lab5;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.runners.MethodSorters;


import org.junit.FixMethodOrder;
import org.junit.Rule;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.*;



@FixMethodOrder(MethodSorters.NAME_ASCENDING)
//ALREADY IMPLEMENTED; DO NOT MODIFY 
//NO NEED TO SUBMIT THIS FILE

/*
* Tests included in this class serve as documentation on how instances of a
* class work.
* 
* Be sure to also read the Lab instructions PDF carefully
* 
* Programming IDEs such as Eclipse are able to fix such compilation errors for
* you. However, you are advised to follow the guidance as specified in the
* written Lab instructions PDF to fix these compilation errors manually,
* because: 1) it helps you better understand how the intended classes and
* methods work together; and 2) you may be tested in a written test or exam
* without the assistance of IDEs.
* 
*/
public class JunitTest_RideRequestTest {

	@Rule
	public Timeout globalTimeout = Timeout.seconds(1);
	
	
	@Test
	public void test_0_0_StaticFields() {
		try {
			List<Field> fields = Arrays.asList(RideRequest.class.getDeclaredFields());

			int nStatic = 0;
			for (Field f : fields) {
				int mod = f.getModifiers();
				if (Modifier.isStatic(mod)) {
					nStatic++;
				}
			}
			assertTrue("there should be three static field", nStatic == 3);
		} catch (Exception x) {
			fail("exception occurred trying to get the fields of this class");
		}
	}
	
	
	@Test
	public void test_0_1_NumberofFields() {
		Field[] allFields = RideRequest.class.getDeclaredFields();
		assertEquals("The total number of data field should be 7", 7, allFields.length);
	}
	// Test default constructor
	@Test
	public void test_1_0() {
		RideRequest rideRequest = new RideRequest();
        RideRequest.setTaxrate(0.1); // Assuming 10% tax rate
        RideRequest.setDiscount(0.2); // Assuming 20% discount rate
        assertNotNull("RideRequest object should not be null", rideRequest);
        assertEquals("Default customer name should be empty", "", rideRequest.getCustomerName());
        assertEquals("Default ride details should be empty", "", rideRequest.getRideDetails());
        assertEquals(0.0, rideRequest.getRidePrice(), 0.0);
        assertFalse("Default hasDiscount should be false", rideRequest.isHasDiscount());
	}
	
	// Test parameterized constructor with valid input
	@Test
	public void test_1_1() {
		RideRequest request = new RideRequest("John  , Downtown   , 50.0   , Y  ");
		String errorMsg = String.format(
				"\n Test constructor failed. Returned  CustomerName (%s) " + "but correct CustomerName is (%s)",
				request.getCustomerName(), "John");
		
        assertEquals(errorMsg,"John", request.getCustomerName());
        errorMsg = String.format(
				"\n Test constructor failed. Returned  RideDetails (%s) " + "but correct RideDetails is (%s)",
				request.getRideDetails(), "Downtown");
        
        assertEquals(errorMsg, "Downtown", request.getRideDetails());
        assertEquals("Error: The constructor failed to set the ride price.",50.0, request.getRidePrice(), 0.0);
        assertTrue("Error: The constructor failed to set the ride discount.",request.isHasDiscount());
	}
	
	
	@Test
	public void test_1_2() {
		RideRequest request = new RideRequest("  Jack  , North York   , 9.99   , Y  ");
		String errorMsg = String.format(
				"\n Test constructor failed. Returned  CustomerName (%s) " + "but correct CustomerName is (%s)",
				request.getCustomerName(), "Jack");
		
        assertEquals(errorMsg,"Jack", request.getCustomerName());
        errorMsg = String.format(
				"\n Test constructor failed. Returned  RideDetails (%s) " + "but correct RideDetails is (%s)",
				request.getRideDetails(), "North York");
        
        assertEquals(errorMsg, "North York", request.getRideDetails());
        assertEquals("Error: The constructor failed to set the ride price.",9.99, request.getRidePrice(), 0.0);
        assertTrue("Error: The constructor failed to set the ride discount.",request.isHasDiscount());
	}
	
	
	// Test parameterized constructor with invalid input
	@Test
	public void test_2_0() {
		try {
			RideRequest request = new RideRequest(new String());
			fail("You should throw an exception If the input is null or empty.");
		} catch (IllegalArgumentException e) {
			// exception excepted do nothing 
		}
				
	}
	
	@Test
	public void test_2_2() {
		RideRequest request =  null;
		try {
			RideRequest request2 = new RideRequest(request);
			fail("You should throw an exception If the input is null.");
		} catch (IllegalArgumentException e) {
			// exception excepted do nothing 
		}
	}
	
	@Test
	public void test_2_3() {
		String s =  "John  , Downtown   , 50.0   , Y  , extra info";
		try {
			RideRequest request2 = new RideRequest(s);
			fail("You should throw an exception If the input is not in correct format.");
		} catch (IllegalArgumentException e) {
			// exception excepted do nothing 
		}
	}
	
	
	@Test
	public void test_2_4() {
		String s =  null;
		try {
			RideRequest request2 = new RideRequest(s);
			fail("You should throw an exception If the input is null.");
		} catch (IllegalArgumentException e) {
			// exception excepted do nothing 
		}
	}
	
	@Test
	public void test_2_5() {
		RideRequest request = new RideRequest("  Jack  , North York   , 9.99   , N  ");
		request.setCustomerName("Bob");
        request.setRideDetails("Airport");
        request.setRidePrice(39.39);
        request.setHasDiscount(true);
		RideRequest copyRequest = new RideRequest(request); 
		String errorMsg = String.format(
				"\n Test copy constructor failed. Returned  CustomerName (%s) " + "but correct CustomerName is (%s)",
				copyRequest.getCustomerName(), "Bob");
		
        assertEquals(errorMsg,"Bob", request.getCustomerName());
        errorMsg = String.format(
				"\n Test copy constructor failed. Returned  RideDetails (%s) " + "but correct RideDetails is (%s)",
				copyRequest.getRideDetails(), "Airport");
        
        assertEquals(errorMsg, "Airport", copyRequest.getRideDetails());
        assertEquals("Error: The constructor failed to set the ride price.",39.39, copyRequest.getRidePrice(), 0.0);
        assertTrue("Error: The constructor failed to set the ride discount.",copyRequest.isHasDiscount());
		
		
	}
	
	
	@Test
	public void test_3_0() {
		RideRequest request = new RideRequest("John  , Downtown   , 50.0   , Y  ");
		request.setCustomerName("Alice");
        assertEquals("Set Customer Name method failed to update the customer name.", "Alice", request.getCustomerName());
		
	}

	@Test
	public void test_3_1() {
		RideRequest request = new RideRequest("John  , Scarborough   , 50.0   , Y  ");
		request.setCustomerName("Very Long Customer Name Exceeding Limit");
        
        assertEquals("Set Customer Name method failed. Customer name should be truncated to 10 chars", "Very Long ", request.getCustomerName());
	}
	@Test
	public void test_3_2() {
		RideRequest request = new RideRequest("John  , Scarborough   , 50.0   , Y  ");
		request.setCustomerName(null);
        
        assertEquals("Set Customer Name method failed.", "", request.getCustomerName());
	}
	
	
	@Test
	public void test_4_0() {
		RideRequest request = new RideRequest("John  , Scarborough   , 35.0   , N  ");
		request.setRideDetails("  Airport        ");
		assertEquals("Set Ride Details method failed. ", "Airport", request.getRideDetails());
	}
	
	@Test
	public void test_4_1() {
		RideRequest request = new RideRequest("John  , Scarborough   , 35.0   , N  ");
		request.setRideDetails( null);
		assertEquals("Set Ride Details method failed. ", "", request.getRideDetails());
	}
	
	@Test
	public void test_5_0() {
		RideRequest request = new RideRequest("John  , Scarborough   , 35.0   , N  ");
		request.setHasDiscount(true);
		assertTrue("Set  has Discount failed, should be true", request.isHasDiscount());
		
	}
	
	@Test
	public void test_5_1() {
		RideRequest request = new RideRequest("  Kate  , Woodbine   , 35.25   , Y  ");
		request.setHasDiscount(false);
		assertFalse("Set  has Discount failed, should be False", request.isHasDiscount());
		
	}
	
	
	@Test
	public void test_6_0() {
		RideRequest request = new RideRequest("  Kate  , Woodbine   , 35.25   , Y  ");
		RideRequest.setTaxrate(0.1); // Assuming 10% tax rate 
        assertEquals("Error:set Tax rate failed",0.1, RideRequest.getTaxrate(), 0.001);
        
		
	}
	
	@Test
	public void test_6_1() {
		RideRequest request = new RideRequest("  Kate  , Woodbine   , 35.25   , Y  ");	
        RideRequest.setDiscount(0.2); // Assuming 20% discount rate      
        
        assertEquals("Error:set Discount  failed",0.2, RideRequest.getDiscount(), 0.001);
		
	}
	
	
	@Test
	public void test_7_0() {
		RideRequest request = new RideRequest("  Kate  , Woodbine   , 35.25   , Y  ");
		RideRequest.setTaxrate(0.1); // Assuming 10% tax rate 
		RideRequest.setDiscount(0.2); // Assuming 20% discount rate  
		String expectedOutput = " 1. Kate      |Woodbine                 |38.78       |        31.02";
		assertEquals("toString method failed", expectedOutput, request.toString());
	}
	
	@Test
	public void test_7_1() {
		RideRequest request = new RideRequest("  Susan  ,Mississauga   , 7.99   , Y  ");
		RideRequest.setTaxrate(0.1); // Assuming 10% tax rate 
		RideRequest.setDiscount(0.2); // Assuming 20% discount rate  
		String expectedOutput = " 2. Susan     |Mississauga              |8.79        |         7.03";
		assertEquals("toString method failed", expectedOutput, request.toString());
	}
	
	
	@Test
	public void test_7_2() {
		RideRequest request = new RideRequest("  Jack  , North York   , 9.99   , Y  ");
		RideRequest.setTaxrate(0.15); // Assuming 15% tax rate 
		RideRequest.setDiscount(0.25); // Assuming 25% discount rate  
		String expectedOutput = " 3. Jack      |North York               |11.49       |         8.62";
		assertEquals("toString method failed", expectedOutput, request.toString());
	}
	
	
	@Test
	public void test_7_3() {
		RideRequest request = new RideRequest("  Jack  , North York   , 9.99   , N  ");
		RideRequest.setTaxrate(0.15); // Assuming 15% tax rate 
		RideRequest.setDiscount(0.25); // Assuming 25% discount rate  
		String expectedOutput = " 4. Jack      |North York               |11.49       |";
		assertEquals("toString method failed", expectedOutput, request.toString());
	}
	
	@Test
	public void test_7_4() {
		RideRequest request = new RideRequest("  Susan  ,Mississauga   , 7.99   , N  ");
		RideRequest.setTaxrate(0.1); // Assuming 10% tax rate 
		RideRequest.setDiscount(0.2); // Assuming 20% discount rate  
		String expectedOutput = " 5. Susan     |Mississauga              |8.79        |";
		assertEquals("toString method failed", expectedOutput, request.toString());
	}
}
