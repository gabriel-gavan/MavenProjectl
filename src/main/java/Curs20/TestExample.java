package Curs20;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.junit.BeforeClass;
import org.testng.annotations.Test;

public class TestExample {

	@Test(invocationCount = 4, priority = -10)
	public void runMultipleTimes() {
		System.out.println("Testng print");
	}
	
	@RunMultipleTimes(times = 4)
	@Test
	public void testAnnotation() {
		System.out.println("Annotation test print");
	}
	
	@BeforeClass
	public void setUp() throws IllegalAccessException,  IllegalArgumentException, InvocationTargetException{
		
		TestExample testobj = new TestExample();
		for (Method method: testobj.getClass().getDeclaredMethods()) {
			if(method.isAnnotationPresent(RunMultipleTimes.class)) {
				RunMultipleTimes annotation = method.getAnnotation(RunMultipleTimes.class);
				for (int i = 0; i< annotation.times();i++) {
					method.invoke(testobj);
				}
			}
		}
	}
}
