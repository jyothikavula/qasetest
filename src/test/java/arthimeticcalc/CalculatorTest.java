package arthimeticcalc;

 import static org.junit.jupiter.api.Assertions.*;

 import org.junit.jupiter.api.Test;


public class CalculatorTest {
	
	

	@Test
	public void testAdd() {
	//Calculator Calculator=new Calculator();//
	int result= Calculator.add(3,4);
	assertEquals(7,result);
	}
	
    @Test
    public void testSubtract() {
    	//Calculator Calculator=new Calculator();//
    	int result= Calculator.subtract(5, 2);
    	assertEquals(3,result);
    }

	@Test
	public void testMultiply() {
		//Calculator Calculator=new Calculator();//
		int result = Calculator.multiply(2, 6);
		assertEquals(12,result);	
	}
	
	@Test
	public void testDivide() {
	//Calculator Calculator = new Calculator();//
	int result = Calculator.divide(8, 2);
	assertEquals(4,result);
	}
   @Test
   public void testDivideByZero() {
	 //  Calculator Calculator = new Calculator();//
	  assertThrows(ArithmeticException.class,() -> Calculator.divide(4,0));
	  
   }
   
}
