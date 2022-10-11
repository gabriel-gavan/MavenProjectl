package Curs19;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

	@Listeners(conditionalTestSkip.class)
	
public class TestClass {

	
	@Test
	public void testCase1(){
		System.out.println("Run test case 1");
		
	}
	
	@ruleazaDoarPeGermania
	@Test
	public void testCase2(){
		System.out.println("Run test case 2");
		
	}
	@Test
	public void testCase3(){
		System.out.println("Run test case 3");
		
	}
}
