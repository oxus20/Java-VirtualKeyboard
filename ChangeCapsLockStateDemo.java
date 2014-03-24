import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JToggleButton;

class ChangeCapsLockStateDemo {

	JLabel lblOutput;
	JToggleButton btnOnOff;
	JFrame win;

	ChangeCapsLockStateDemo() {
		// JFrame Customization
		win = new JFrame("Change Caps Lock State");
		win.setLayout(new FlowLayout());
		win.setSize(300, 80);
		win.setLocationRelativeTo(null);
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// JToggleButton and JLabel Customization
		lblOutput = new JLabel("CapsLock : OFF");
		Toolkit.getDefaultToolkit().setLockingKeyState(
				KeyEvent.VK_CAPS_LOCK, false);
		btnOnOff = new JToggleButton("On / Off", false);
		
		// Add item listener for JToggleButton.
		btnOnOff.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent ie) {
				if (btnOnOff.isSelected()) {
					lblOutput.setText("CapsLock : ON");
					Toolkit.getDefaultToolkit().setLockingKeyState(
							KeyEvent.VK_CAPS_LOCK, true);
				} else {
					lblOutput.setText("CapsLock : OFF");
					Toolkit.getDefaultToolkit().setLockingKeyState(
							KeyEvent.VK_CAPS_LOCK, false);
				}

			}
		});

		// Add toggle button and label to the content pane.
		win.add(btnOnOff);
		win.add(lblOutput);
		
		win.setVisible(true);
	}

	public static void main(String args[]) {
		new ChangeCapsLockStateDemo();
	}
}