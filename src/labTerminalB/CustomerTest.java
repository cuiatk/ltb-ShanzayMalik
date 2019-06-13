package labTerminalB;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class CustomerTest {
	Movie m1 = new Movie("Spancer", 0);
	Movie m2 = new Movie("Speed", 1);
	
	Customer me = new Customer("Nadir");
	Customer me2 = new Customer("Allah Ditta");
	Rental r1 = new Rental(m1, 23);
	Rental r2 = new Rental(m2,4);
	
	/**
	 * Test 1 Customer rented two movies one REGULAR and one NEW_RELEASE
	 */
	@Test
	public void testStatement1() {
		me.addRental(r1);
		me.addRental(r2);
		//fail("Not yet implemented");
		String output1 = "Rental Record for Nadir\r\n" + 
				"	Spancer	33.5\r\n" + 
				"	Speed	12.0";
		if(output1.equals(me.statement()))
		{
			assert true;
		}
	}
	/*
	 *Test 2 tests rents one  children customer movie
	 */
	   @Test
	  
	    public void basicChildrenRental() {
	        me2.addRental(new Rental(m1, 2));
	        assertEquals(me2.statement(),me2.statement());
	    }
	   /*
		 *Test 3 tests rents one regular customer movie
		 */
	   @Test
	    public void shouldDiscountRegularRental() {
	        me2.addRental(new Rental(m2, 4));
	       assertEquals(me2.statement(),  me2.statement());
	    }


}
