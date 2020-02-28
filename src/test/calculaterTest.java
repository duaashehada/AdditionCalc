package test;
import code.Calculater;

import org.junit.Assert;
import org.junit.Test;



public class calculaterTest {

	@Test
	void testsum_BothNumbersArePositive_ShouldReturnPositiveNumber() {
		int a = 10 ; 
		int b = 20 ; 
		 Calculater calc = new Calculater(); 
		
		int result = calc.add(a, b);
		
		  Assert.assertTrue(result > 0 ); 
	}

}
