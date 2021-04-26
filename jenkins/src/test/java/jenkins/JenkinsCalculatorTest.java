package jenkins;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class JenkinsCalculatorTest {
	
	private JenkinsCalculator jenkinsCalculator;

	@Before
	public void setup() {
		jenkinsCalculator = new JenkinsCalculator();
	}

	@Test
	public void test_addNumbers() {
		Assert.assertEquals(10,jenkinsCalculator.addNumbers(5, 5));
	}
	
	@Test
	public void test_subtractNumbers() {
		Assert.assertEquals(0,jenkinsCalculator.subtractNumbers(5, 5));
	}

}

