package ShopTest;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;


import ShopModels.Human;

// Add Run with for Suite
// SuiteClsses to add Test classes
@RunWith(Suite.class)
@SuiteClasses({
	HumanTest.class,
	PersonTest.class
})

public class HumanSuite {
	
	

}
