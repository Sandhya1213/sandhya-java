package testPackage;

import org.sikuli.natives.WinUtil;
import org.sikuli.script.Screen;
import org.testng.annotations.Test;

public class TestcLASS {

	@Test
	public  void testMethod() {
		 this.getClass().getClassLoader().getResourceAsStream("org.sikuli.natives.WinUtil");
		
		 Screen s = new Screen();
		  System.out.println(s.userCapture());
		                new WinUtil();
	}

}
