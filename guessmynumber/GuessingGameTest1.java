
import edu.gatech.cc.jcrasher.runtime.FilteringTestCase;

import junit.framework.*;

public class GuessingGameTest1 extends FilteringTestCase {

	public GuessingGameTest1(String pName) {
		super(pName);
	}

	public static void main(String[] args) {
		junit.textui.TestRunner.run(GuessingGameTest1.class);
	}

	public static Test suite() {
		return new TestSuite(GuessingGameTest1.class);
	}

	/**
	 * Executed before each testX().
	 * Resets static fields of each user class (except this).
	 */
	protected void setUp() {
		edu.gatech.cc.jcrasher.runtime.reinit.ClassRegistry.resetClasses();	//re-initialize static fields of previously loaded classes
		//my setUp() code goes here..
	}

	/**
	 * Executed after each testX()
	 */
	protected void tearDown() {
		//my tearDown() code goes here..
	}



	/********** Generated testcases **********/

	public void test0() throws Throwable {
		try {
			GuessingGame g1 = new GuessingGame();
		}
		catch (Exception e) {dispatchException(e);}
	}

	public void test1() throws Throwable {
		try {
			java.lang.String[] s1 = (java.lang.String[])null;
			GuessingGame.main(s1);
		}
		catch (Exception e) {dispatchException(e);}
	}

	public void test2() throws Throwable {
		try {
			java.lang.String[] s1 = new java.lang.String[]{};
			GuessingGame.main(s1);
		}
		catch (Exception e) {dispatchException(e);}
	}

	public void test3() throws Throwable {
		try {
			java.lang.String[] s1 = new java.lang.String[]{" "};
			GuessingGame.main(s1);
		}
		catch (Exception e) {dispatchException(e);}
	}

	public void test4() throws Throwable {
		try {
			java.lang.String[] s1 = new java.lang.String[]{"$", "%"};
			GuessingGame.main(s1);
		}
		catch (Exception e) {dispatchException(e);}
	}

	public void test5() throws Throwable {
		try {
			int i1 = -1;
			int i2 = -1;
			int i3 = -1;
			GuessingGame.determineGuess(i1, i2, i3);
		}
		catch (Exception e) {dispatchException(e);}
	}

	public void test6() throws Throwable {
		try {
			int i1 = -1;
			int i2 = -1;
			int i3 = 0;
			GuessingGame.determineGuess(i1, i2, i3);
		}
		catch (Exception e) {dispatchException(e);}
	}

	public void test7() throws Throwable {
		try {
			int i1 = -1;
			int i2 = -1;
			int i3 = 1;
			GuessingGame.determineGuess(i1, i2, i3);
		}
		catch (Exception e) {dispatchException(e);}
	}

	public void test8() throws Throwable {
		try {
			int i1 = -1;
			int i2 = 0;
			int i3 = -1;
			GuessingGame.determineGuess(i1, i2, i3);
		}
		catch (Exception e) {dispatchException(e);}
	}

	public void test9() throws Throwable {
		try {
			int i1 = -1;
			int i2 = 0;
			int i3 = 0;
			GuessingGame.determineGuess(i1, i2, i3);
		}
		catch (Exception e) {dispatchException(e);}
	}

	public void test10() throws Throwable {
		try {
			int i1 = -1;
			int i2 = 0;
			int i3 = 1;
			GuessingGame.determineGuess(i1, i2, i3);
		}
		catch (Exception e) {dispatchException(e);}
	}

	public void test11() throws Throwable {
		try {
			int i1 = -1;
			int i2 = 1;
			int i3 = -1;
			GuessingGame.determineGuess(i1, i2, i3);
		}
		catch (Exception e) {dispatchException(e);}
	}

	public void test12() throws Throwable {
		try {
			int i1 = -1;
			int i2 = 1;
			int i3 = 0;
			GuessingGame.determineGuess(i1, i2, i3);
		}
		catch (Exception e) {dispatchException(e);}
	}

	public void test13() throws Throwable {
		try {
			int i1 = -1;
			int i2 = 1;
			int i3 = 1;
			GuessingGame.determineGuess(i1, i2, i3);
		}
		catch (Exception e) {dispatchException(e);}
	}

	public void test14() throws Throwable {
		try {
			int i1 = 0;
			int i2 = -1;
			int i3 = -1;
			GuessingGame.determineGuess(i1, i2, i3);
		}
		catch (Exception e) {dispatchException(e);}
	}

	public void test15() throws Throwable {
		try {
			int i1 = 0;
			int i2 = -1;
			int i3 = 0;
			GuessingGame.determineGuess(i1, i2, i3);
		}
		catch (Exception e) {dispatchException(e);}
	}

	public void test16() throws Throwable {
		try {
			int i1 = 0;
			int i2 = -1;
			int i3 = 1;
			GuessingGame.determineGuess(i1, i2, i3);
		}
		catch (Exception e) {dispatchException(e);}
	}

	public void test17() throws Throwable {
		try {
			int i1 = 0;
			int i2 = 0;
			int i3 = -1;
			GuessingGame.determineGuess(i1, i2, i3);
		}
		catch (Exception e) {dispatchException(e);}
	}

	public void test18() throws Throwable {
		try {
			int i1 = 0;
			int i2 = 0;
			int i3 = 0;
			GuessingGame.determineGuess(i1, i2, i3);
		}
		catch (Exception e) {dispatchException(e);}
	}

	public void test19() throws Throwable {
		try {
			int i1 = 0;
			int i2 = 0;
			int i3 = 1;
			GuessingGame.determineGuess(i1, i2, i3);
		}
		catch (Exception e) {dispatchException(e);}
	}

	public void test20() throws Throwable {
		try {
			int i1 = 0;
			int i2 = 1;
			int i3 = -1;
			GuessingGame.determineGuess(i1, i2, i3);
		}
		catch (Exception e) {dispatchException(e);}
	}

	public void test21() throws Throwable {
		try {
			int i1 = 0;
			int i2 = 1;
			int i3 = 0;
			GuessingGame.determineGuess(i1, i2, i3);
		}
		catch (Exception e) {dispatchException(e);}
	}

	public void test22() throws Throwable {
		try {
			int i1 = 0;
			int i2 = 1;
			int i3 = 1;
			GuessingGame.determineGuess(i1, i2, i3);
		}
		catch (Exception e) {dispatchException(e);}
	}

	public void test23() throws Throwable {
		try {
			int i1 = 1;
			int i2 = -1;
			int i3 = -1;
			GuessingGame.determineGuess(i1, i2, i3);
		}
		catch (Exception e) {dispatchException(e);}
	}

	public void test24() throws Throwable {
		try {
			int i1 = 1;
			int i2 = -1;
			int i3 = 0;
			GuessingGame.determineGuess(i1, i2, i3);
		}
		catch (Exception e) {dispatchException(e);}
	}

	public void test25() throws Throwable {
		try {
			int i1 = 1;
			int i2 = -1;
			int i3 = 1;
			GuessingGame.determineGuess(i1, i2, i3);
		}
		catch (Exception e) {dispatchException(e);}
	}

	public void test26() throws Throwable {
		try {
			int i1 = 1;
			int i2 = 0;
			int i3 = -1;
			GuessingGame.determineGuess(i1, i2, i3);
		}
		catch (Exception e) {dispatchException(e);}
	}

	public void test27() throws Throwable {
		try {
			int i1 = 1;
			int i2 = 0;
			int i3 = 0;
			GuessingGame.determineGuess(i1, i2, i3);
		}
		catch (Exception e) {dispatchException(e);}
	}

	public void test28() throws Throwable {
		try {
			int i1 = 1;
			int i2 = 0;
			int i3 = 1;
			GuessingGame.determineGuess(i1, i2, i3);
		}
		catch (Exception e) {dispatchException(e);}
	}

	public void test29() throws Throwable {
		try {
			int i1 = 1;
			int i2 = 1;
			int i3 = -1;
			GuessingGame.determineGuess(i1, i2, i3);
		}
		catch (Exception e) {dispatchException(e);}
	}

	public void test30() throws Throwable {
		try {
			int i1 = 1;
			int i2 = 1;
			int i3 = 0;
			GuessingGame.determineGuess(i1, i2, i3);
		}
		catch (Exception e) {dispatchException(e);}
	}

	public void test31() throws Throwable {
		try {
			int i1 = 1;
			int i2 = 1;
			int i3 = 1;
			GuessingGame.determineGuess(i1, i2, i3);
		}
		catch (Exception e) {dispatchException(e);}
	}
}