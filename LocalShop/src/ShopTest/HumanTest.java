package ShopTest;

import static org.junit.Assert.assertEquals;

import org.junit.*;
import org.junit.Test;

import ShopModels.Human;

public class HumanTest {

	// global var
	private Human human; 
	
	
	// Before each method runs
	@Before
	public void setUp() throws Exception {
		 human  = new Human();
	}
	
	@Test
	public void twoPlus() {
		     assertEquals(4, human.twoPlus(2, 2));
	}
	
	@Test
	public void humanNotNull() {
		Assert.assertTrue("Not Null", !human.equals(null));
	}
//	@Test
//	public void revealGenderWomenTest() {
//		
//		assertEquals('W', human.revealGender('W'));
//	}
//	
//	@Test
//	public void revealGenderManTest() {
//		
//		assertEquals('M', human.revealGender('M'));
//	}
//	
//	
	
	
	
	
	
}
