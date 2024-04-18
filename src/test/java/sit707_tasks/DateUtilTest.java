package sit707_tasks;

import java.util.Random;

import org.junit.Assert;
import org.junit.Test;


/**
 * @author Ahsan Habib
 */
public class DateUtilTest {
	
	@Test
	public void testStudentIdentity() {
		String studentId = "219339639";
		Assert.assertNotNull("Student ID is null", studentId);
	}

	@Test
	public void testStudentName() {
		String studentName = "Su Myat Thiri";
		Assert.assertNotNull("Student name is null", studentName);
	}

	@Test
	public void testMaxJanuary31ShouldIncrementToFebruary1() {
		// January max boundary area: max+1
		DateUtil date = new DateUtil(31, 1, 2024);
        System.out.println("january31ShouldIncrementToFebruary1 > " + date);
        date.increment();
        System.out.println(date);
        Assert.assertEquals(2, date.getMonth());
        Assert.assertEquals(1, date.getDay());
	}
	
	@Test
	public void testMaxJanuary31ShouldDecrementToJanuary30() {
		// January max boundary area: max-1
		DateUtil date = new DateUtil(31, 1, 2024);
        System.out.println("january31ShouldDecrementToJanuary30 > " + date);
        date.decrement();
        System.out.println(date);
        Assert.assertEquals(30, date.getDay());
        Assert.assertEquals(1, date.getMonth());
	}
	
	@Test
	public void testNominalJanuary() {
		int rand_day_1_to_31 = 1 + new Random().nextInt(31);
        DateUtil date = new DateUtil(rand_day_1_to_31, 1, 2024);
        System.out.println("testJanuaryNominal > " + date);
        date.increment();
        System.out.println(date);
	}
	
	/*
	 * Complete below test cases.
	 */
	
	@Test
	public void testMaxJanuary1ShouldIncrementToJanuary2() {
		DateUtil date = new DateUtil(1, 1, 2024);
		date.increment(); 
		Assert.assertEquals(2, date.getDay()); 
		Assert.assertEquals(1, date.getMonth());
		Assert.assertEquals(2024, date.getYear());
	}
	
	@Test
	public void testMinJanuary1ShouldDecrementToDecember31() {
		DateUtil date = new DateUtil(1, 1, 2024);
		date.decrement();
		Assert.assertEquals(31, date.getDay());
		Assert.assertEquals(12, date.getMonth());
		Assert.assertEquals(2023, date.getYear());
	}
	
	/*
	 * Write tests for rest months of year 2024.
	 */
	
	@Test
	public void testMaxFebruary1ShouldIncrementToFebruary2() {
		DateUtil date = new DateUtil(1, 2, 2024);
		date.increment();
		Assert.assertEquals(2, date.getDay());
		Assert.assertEquals(2, date.getMonth());
		Assert.assertEquals(2024, date.getYear());
	}
	
	@Test
	public void testMaxMarch1ShouldIncrementToMarch2() {
		DateUtil date = new DateUtil(1, 3, 2024);
		date.increment();
		Assert.assertEquals(2, date.getDay());
		Assert.assertEquals(3, date.getMonth());
		Assert.assertEquals(2024, date.getYear());
	}
	
	@Test
	public void testMaxApril1ShouldIncrementToApril2() {
		DateUtil date = new DateUtil(1, 4, 2024);
		date.increment();
		Assert.assertEquals(2, date.getDay());
		Assert.assertEquals(4, date.getMonth());
		Assert.assertEquals(2024, date.getYear());
	}
	
	@Test
	public void testMaxMay1ShouldIncrementToMay2() {
		DateUtil date = new DateUtil(1, 5, 2024);
		date.increment();
		Assert.assertEquals(2, date.getDay());
		Assert.assertEquals(5, date.getMonth());
		Assert.assertEquals(2024, date.getYear());
	}
	
	@Test
	public void testMaxJune1ShouldIncrementToJune2() {
		DateUtil date = new DateUtil(1, 6, 2024);
		date.increment();
		Assert.assertEquals(2, date.getDay());
		Assert.assertEquals(6, date.getMonth());
		Assert.assertEquals(2024, date.getYear());
	}
	
	@Test
	public void testMaxJuly1ShouldIncrementToJuly2() {
		DateUtil date = new DateUtil(1, 7, 2024);
		date.increment();
		Assert.assertEquals(2, date.getDay());
		Assert.assertEquals(7, date.getMonth());
		Assert.assertEquals(2024, date.getYear());
	}
	
	@Test
	public void testMaxAugust1ShouldIncrementToAugust2() {
		DateUtil date = new DateUtil(1, 8, 2024);
		date.increment();
		Assert.assertEquals(2, date.getDay());
		Assert.assertEquals(8, date.getMonth());
		Assert.assertEquals(2024, date.getYear());
	}
	
	@Test
	public void testMaxSeptember1ShouldIncrementToSeptember2() {
		DateUtil date = new DateUtil(1, 9, 2024);
		date.increment();
		Assert.assertEquals(2, date.getDay());
		Assert.assertEquals(9, date.getMonth());
		Assert.assertEquals(2024, date.getYear());
	}
	
	@Test
	public void testMaxOctober1ShouldIncrementToOctober2() {
		DateUtil date = new DateUtil(1, 10, 2024);
		date.increment();
		Assert.assertEquals(2, date.getDay());
		Assert.assertEquals(10, date.getMonth());
		Assert.assertEquals(2024, date.getYear());
	}
	
	@Test
	public void testMaxNovember1ShouldIncrementToNovember2() {
		DateUtil date = new DateUtil(1, 11, 2024);
		date.increment();
		Assert.assertEquals(2, date.getDay());
		Assert.assertEquals(11, date.getMonth());
		Assert.assertEquals(2024, date.getYear());
	}
	
	@Test
	public void testMaxDecember1ShouldIncrementToDecember2() {
		DateUtil date = new DateUtil(1, 12, 2024);
		date.increment();
		Assert.assertEquals(2, date.getDay());
		Assert.assertEquals(12, date.getMonth());
		Assert.assertEquals(2024, date.getYear());
	}
	
	// Test for the orange table
	@Test
	public void testCase1B() {
		DateUtil date = new DateUtil(1, 6, 1994);
		date.increment();
		Assert.assertEquals(2, date.getDay());
		Assert.assertEquals(6, date.getMonth());
		Assert.assertEquals(1994, date.getYear());
	}
	
	@Test
	public void testCase2B() {
		DateUtil date = new DateUtil(2, 6, 1994);
		date.increment();
		Assert.assertEquals(3, date.getDay());
		Assert.assertEquals(6, date.getMonth());
		Assert.assertEquals(1994, date.getYear());
	}
	
	@Test
	public void testCase13B() {
		DateUtil date = new DateUtil(15, 6, 1994);
		date.increment();
		Assert.assertEquals(16, date.getDay());
		Assert.assertEquals(6, date.getMonth());
		Assert.assertEquals(1994, date.getYear());
	}
	
	// Test cases for February with leap year condition
	
	@Test
	public void testFebruaryWithLeapYear29ShouldIncrementToMarch1() {
		DateUtil date = new DateUtil(29, 2, 2024);
		date.increment();
		Assert.assertEquals(1, date.getDay());
		Assert.assertEquals(3, date.getMonth());
		Assert.assertEquals(2024, date.getYear());
	}
	
	@Test
	public void testFebruaryWithLeapYear29ShouldDecrementToFebruary28() {
		DateUtil date = new DateUtil(29, 2, 2024);
		date.decrement();
		Assert.assertEquals(28, date.getDay());
		Assert.assertEquals(2, date.getMonth());
		Assert.assertEquals(2024, date.getYear());
	}
}
