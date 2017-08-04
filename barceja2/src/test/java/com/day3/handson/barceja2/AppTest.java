package com.day3.handson.barceja2;

import java.util.Scanner;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    
 
	public static Integer ctr= 0;
    public void testFib() {
	    Fibonacci fib = new Fibonacci();
		fib.acceptChoice("1");
		fib.increaseFib(0,1);
		System.out.print("branch");
		System.out.print("branchOut1");
		System.out.print("branchOut2");
    
    }

}
