/**
* Example JUnit testing class for Circle1 (and Circle)
*
* - must have your classpath set to include the JUnit jarfiles
* - to run the test do:
*     java org.junit.runner.JUnitCore Circle1Test
* - note that the commented out main is another way to run tests
* - note that normally you would not have print statements in
*   a JUnit testing class; they are here just so you see what is
*   happening. You should not have them in your test cases.
**/

import org.junit.*;

public class Circle2Test
{
    // Data you need for each test case
    private Circle1 circle1;
    private Circle1 circle2;
    private Circle1 circle3;
   
// 
// Stuff you want to do before each test case
//
@Before
public void setup()
{
   System.out.println("\nTest starting...");
   circle1 = new Circle1(2,3,4);
   circle2 = new Circle1(2,3,5);
   circle3 = new Circle1(100,50,10);
}

//
// Stuff you want to do after each test case
//	
@After
public void teardown()
{
   System.out.println("\nTest finished.");
}

//
// Test a simple positive move
//	
@Test
public void simpleMove()
{
   Point p;
   System.out.println("Running test simpleMove");
   p = circle1.moveBy(1,1);
   Assert.assertTrue(p.x == 3 && p.y == 4);
}

// 
// Test a simple negative move
//	
@Test
public void simpleMoveNeg()
{
   Point p;
   System.out.println("Running test simpleMoveNeg");
   p = circle1.moveBy(-1,-1);
   Assert.assertTrue(p.x == 1 && p.y == 2);
}

// 
// Test scalePositive
//	
@Test
public void scalePositive()
{
   System.out.println("Running test scalePositive");
   Assert.assertTrue(circle1.scale(10) == 40);
}

// 
// Test a scaleNegative
//	
@Test
public void scaleNegative()
{
   System.out.println("Running test scaleNegative");
   Assert.assertTrue(circle2.scale(0.5) == 2.5);
}

// 
// Test intersect
//
@Test
public void intersect()
{
	System.out.println("Running test intersect");
	System.out.println(circle1.intersects(circle2));
	Assert.assertTrue(circle1.intersects(circle2));
}

// 
// Test noIntersect
//	
@Test
public void noIntersect() 
{
	System.out.println("Running test noIntersect");
	Assert.assertFalse(circle1.intersects(circle3));
}

/*** NOT USED
public static void main(String args[])
{
   try {
      org.junit.runner.JUnitCore.runClasses(
               java.lang.Class.forName("Circle1Test"));
   } catch (Exception e) {
      System.out.println("Exception: " + e);
   }
}
***/

}
