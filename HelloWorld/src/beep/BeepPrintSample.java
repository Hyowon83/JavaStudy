package beep;

import java.awt.Toolkit;

public class BeepPrintSample {

	public static void main(String[] args) {
		for(int i = 0; i < 5; i++) {
			Toolkit tk = Toolkit.getDefaultToolkit();
			tk.beep();
			try {
				Thread.sleep(500);
			} catch(Exception e) {}
		}
		for(int i = 0; i < 5; i++) {
			System.out.println("띵");
			try {
				Thread.sleep(500);
			} catch(Exception e) {}
		}

	}
}
