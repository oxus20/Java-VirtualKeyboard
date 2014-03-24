import java.awt.AWTException;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JTextArea;

public class RobotDemo extends JFrame {
	public RobotDemo() {
		// JFrame with TextArea Settings
		setTitle("OXUS20 Robot Demo");
		setSize(400, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);

		JTextArea txtOXUS = new JTextArea();
		txtOXUS.setFont(new Font("Verdana", Font.BOLD, 20));
		add(txtOXUS, BorderLayout.CENTER);
		
		setVisible(true);
	}

	public static void main(String[] args) {
		new RobotDemo();

		// Store Keystrokes "OXUS20" in an array
		int keyInput[] = { KeyEvent.VK_O, KeyEvent.VK_X, KeyEvent.VK_U,
				KeyEvent.VK_S, KeyEvent.VK_2, KeyEvent.VK_0 };
		try {
			Robot robot = new Robot();
			
			// press the shift key
			robot.keyPress(KeyEvent.VK_SHIFT);
			
			// This types the word 'OXUS20' in the TextArea
			for (int i = 0; i < keyInput.length; i++) {
				if (i > 0) {
					robot.keyRelease(KeyEvent.VK_SHIFT);
				}
				robot.keyPress(keyInput[i]);
				
				// pause typing for one second
				robot.delay(1000);
			}
		} catch (AWTException e) {
			System.err.println("Exception is happening!");
		}
	}
}