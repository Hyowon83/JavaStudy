package beep3;

import java.awt.Toolkit;

public class BeepTask3 extends Thread {
	
	@Override
	public void run() {
		Toolkit tk = Toolkit.getDefaultToolkit();
		for(int i = 0; i < 5; i++) {
			tk.beep();
			try {
				Thread.sleep(500);
			} catch(Exception e) {}
		}
	}
}
