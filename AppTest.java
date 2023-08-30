package App;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import sly.com.App;

public class AppTest {
	
	@Test
	
	public void testAddition() {
        App calculator = new App();
        int result = calculator.add(2, 3);
        assertEquals(result, 5, "Expected result is 5");

	}

}
