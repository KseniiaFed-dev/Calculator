//Testing CI/CD
package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void testAdd() {
        assertEquals(5, Calculator.calculate(2, 3, '+'), 0.001);
    }

   @Test
   public void testSubstract(){
        assertEquals(-1, Calculator.calculate(2, 3, '-'), 0.001);
   }

   @Test
   public void testMultiply(){
        assertEquals(6, Calculator.calculate(2, 3, '*'), 0.001);
   }

   @Test
   public void testDivide(){
        assertEquals(2, Calculator.calculate(6, 3, '/'), 0.001);
   }
  
   @Test(expected = IllegalArgumentException.class)
   public void testInvalidOperator() {
       Calculator.calculate(2, 3, '%');
   }
  
   @Test(expected = ArithmeticException.class)
   public void testDivideByZero() {
       Calculator.calculate(2, 0, '/');
   }
  }
