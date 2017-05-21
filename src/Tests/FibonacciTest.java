package Tests;

import static org.junit.Assert.*;
import  recursion.Fibonnaci;
import org.junit.Test;
import java.lang.*;

public class FibonacciTest {
Fibonnaci fib = new Fibonnaci();
	@Test
	public void test() {
		assertEquals(fib.fib(-5),Math.round(Math.pow(1.61803, -5.0)/Math.sqrt(5)));
		assertEquals(fib.fib(15),Math.round(Math.pow(1.61803, 15.0)/Math.sqrt(5)));
	}

}
