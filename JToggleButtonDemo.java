import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JToggleButton;

class JToggleButtonDemo {

	JLabel lblOutput;
	JToggleButton btnOnOff;
	JFrame win;

	JToggleButtonDemo() {
		// JFrame Customization
		win = new JFrame("Using JToggleButton");
		win.setLayout(new FlowLayout());
		win.setSize(300, 80);
		win.setLocationRelativeTo(null);
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// JToggleButton and JLabel Customization
		lblOutput = new JLabel("State : OFF");
		btnOnOff = new JToggleButton("On / Off", false);
		
		// Add item listener for JToggleButton.
		btnOnOff.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent ie) {
				if (btnOnOff.isSelected()) {
					lblOutput.setText("State : ON");
				} else {
					lblOutput.setText("State : OFF");
				}

			}
		});

		// Add toggle button and label to the content pane.
		win.add(btnOnOff);
		win.add(lblOutput);
		
		win.setVisible(true);
	}

	public static void main(String args[]) {
		new JToggleButtonDemo();
	}
}