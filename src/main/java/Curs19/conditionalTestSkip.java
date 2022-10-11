package Curs19;

import java.lang.reflect.Method;

import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ITestResult;
import org.testng.SkipException;



public class conditionalTestSkip implements IInvokedMethodListener{
	public static String country = "RO";
	@Override
	public void beforeInvocation(IInvokedMethod method, ITestResult testResult) {
		Method metoda = testResult.getMethod().getConstructorOrMethod().getMethod();
		
			
		if (metoda == null) {
			return;
		}
		if (metoda.isAnnotationPresent(ruleazaDoarPeGermania.class) && !country.equals("DE")) {
			throw new SkipException("Metoda asta trebuie sa ruleze doar pe Germania!");
		}
		return;
		}
	
	
}

