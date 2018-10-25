import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

public class test {

	public static void main(String[] args) throws AWTException, InterruptedException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ALT);
		//Thread.sleep(1000);
		r.keyRelease(KeyEvent.VK_F4);
		
		
	

	}

}
