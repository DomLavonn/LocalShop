package ShopTest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;

import ShopModels.Human;


@RunWith(Parameterized.class)
public class HumanTestParam {
	
	    // var 
	    private char o;
	    private char t;
	    
	    //constructor
	    public HumanTestParam(char o, char t) {
			this.o = o;
			this.t = t;		
		}    
	    
    // Object will be placed in params in method
	// Sets up test data
	    @Parameterized.Parameters
	public static Object[] testObj() {
		return new Object[] {
				new Object[] {'M', 'M'},
				new Object[] {'W', 'W'}
		};
	}
	
	@Test
	public void revealGenderTest() {
		var human = new Human();
		assertEquals(t, human.revealGender(o, t));
	}
}
