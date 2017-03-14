package com.github.Andro3102.TestS;

import org.junit.Assert;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.yandex.qatools.allure.annotations.Step;


public class TestSb {
	
	    private static final Logger LOGGER = LoggerFactory.getLogger(TestSb.class);
	    private static final String Res = "Результат: ";


	    @Step
	    public static void summ(final String operand1, final String operand2, final String result) {
	        LOGGER.info(String.format("Testing: %s + %s = %s", operand1, operand2, result));
	        final int expectedResult = Integer.parseInt(result);
	        final int Result = Integer.parseInt(operand1) + Integer.parseInt(operand2);
	        LOGGER.info(Res + Result);
	        Assert.assertEquals(expectedResult, Result);
	    }

	    @Step
	    public static void diff(final String operand1, final String operand2, final String result) {
	        LOGGER.info(String.format("Testing: %s - %s = %s", operand1, operand2, result));
	        final int expectedResult = Integer.parseInt(result);
	        final int Result = Integer.parseInt(operand1) - Integer.parseInt(operand2);
	        LOGGER.info(Res + Result);
	        Assert.assertEquals(expectedResult, Result);
	    }

	    @Step
	    public static void mult(final String operand1, final String operand2, final String result) {
	        LOGGER.info(String.format("Testing: %s * %s = %s", operand1, operand2, result));
	        final int expectedResult = Integer.parseInt(result);
	        final int Result = Integer.parseInt(operand1) * Integer.parseInt(operand2);
	        LOGGER.info(Res + Result);
	        Assert.assertEquals(expectedResult, Result);
	    }

	    @Step
	    public static void div(final String operand1, final String operand2, final String result) {
	        LOGGER.info(String.format("Testing: %s / %s = %s", operand1, operand2, result));
	        final int expectedResult = Integer.parseInt(result);
	        final int Result;
	        try {
	        	Result = Integer.parseInt(operand1) / Integer.parseInt(operand2);
	            LOGGER.info(Res + Result);
	            Assert.assertEquals(expectedResult, Result);
	        } catch (ArithmeticException ex) {
	            Assert.assertEquals(ex.getMessage(), "/ by zero");
	           	            
	        }
	    }
	}

