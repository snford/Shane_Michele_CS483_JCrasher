
import junit.framework.*;

public class GuessingGameTest extends TestCase {

	public GuessingGameTest(String pName) {
		super(pName);
	}

	public static void main(String[] args) {
		junit.textui.TestRunner.run(GuessingGameTest.class);
	}

	public static Test suite() {
		TestSuite suite= new TestSuite();
		suite.addTestSuite(GuessingGameTest1.class);

		return suite;
	}

}