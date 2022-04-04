package ch.zhaw.iwi.devops.demo;

import org.junit.jupiter.api.Test;

import spark.utils.Assert;

public class FizzBuzzCalculatorTest {

    @Test
    public void testFizzBuzzCalculator1() {
        FizzBuzzCalculator calculator = new FizzBuzzCalculator();
        calculator.convert(1);
    }
    @Test
public void fizzBuzzConverter1() {
FizzBuzzConverter fizzBuzz = new FizzBuzzConverter();
Assert.assertEquals("1", fizzBuzz.convert(1));
}
}
