package sikuli;

import org.sikuli.natives.WinUtil;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class Sikuli_Example {
	
	public static void main(String[] args) {
		  Screen s = new Screen(0);
		  System.out.println(s.userCapture());
		                new WinUtil();
	}
	
	
}