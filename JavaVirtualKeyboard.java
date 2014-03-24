import java.awt.AWTException;
import java.awt.Color;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JToggleButton;

public class JavaVirtualKeyboard implements ActionListener, ItemListener {

	// Require Components Declarations
	private JFrame frame;
	private ImageIcon OXUS20;
	private JLabel OXUSlbl;
	private Robot robot;
	private JPanel rightPanel, leftPanel;
	private JToggleButton scrlk;
	private JToggleButton togglebuttons[];
	private JButton rightBtn[], leftBtn[];
	private String toggleBtnNames[] = { "Caps              ",
			"Shift                  ", "Shift               ", "Ctrl    ",
			"Alt     ", "Alt     ", "Ctrl    ", "Fn " };

	private String rightNames[] = { "Home  ", "PgUp  ", "End      ", "PgDn  ",
			"Insert  ", "Pause", "PrtScn" };

	private String leftNames[] = { "Esc          ", "F1 ", "F2 ", "F3 ", "F4 ",
			"F5 ", "F6 ", "F7 ", "F8 ", "F9 ", "F10", "F11", "F12", "~`", "!1",
			"@2", "#3", "$4", "%5", "^6", "&7", "*8", "( 9", ") 0", "- _",
			"+ = ", "Bksp", "Tab           ", "q", "w", "e", "r", "t", "y",
			"u", "i", "o", "p", "{ [", "} ]", "| \\ ", "Del  ", "a", "s", "d",
			"f", "g", "h", "j", "k", "l", " : ; ", " \" ' ",
			" Enter                      ", "z", "x", "c", "v", "b", "n", "m",
			"< ,", "> .", "?/ ", "↑  ", "Windows",
			"                                           ", "←  ", "↓  ", "→  " };

	public JavaVirtualKeyboard() {

		// JFrame Settings and Customization
		frame = new JFrame("JAVA Virtual Keyboard by OXUS20");

		frame.setAlwaysOnTop(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(932, 225);
		frame.setLocationRelativeTo(null);
		frame.setLayout(null);
		frame.setFocusableWindowState(false);

		// OXUS image Settings and Customization
		OXUS20 = new ImageIcon(getClass().getResource("oxus.PNG"));
		OXUSlbl = new JLabel(OXUS20);
		frame.add(OXUSlbl).setBounds(756, 127, 168, 60);

		// Calls left panel and right panel from methods
		frame.add(bigPanel());
		frame.add(smallPanel());

		frame.setVisible(true);

	}

	// adding right buttons in JPanel
	private JPanel smallPanel() {
		rightPanel = new JPanel();

		rightBtn = new JButton[rightNames.length];

		for (int i = 0; i < rightNames.length; i++) {
			rightBtn[i] = new JButton(rightNames[i]);
			rightBtn[i].setBackground(Color.BLACK);
			rightBtn[i].setForeground(Color.WHITE);
			rightBtn[i].addActionListener(this);
			rightPanel.add(rightBtn[i]);
		}

		scrlk = new JToggleButton("ScrLk");
		scrlk.setBackground(Color.black);
		scrlk.setForeground(Color.white);
		scrlk.addItemListener(this);
		rightPanel.add(scrlk);

		rightPanel.setBounds(764, 0, 153, 125);
		return rightPanel;
	}

	// adding left buttons in JPanel
	private JPanel bigPanel() {
		leftPanel = new JPanel();

		togglebuttons = new JToggleButton[toggleBtnNames.length];
		for (int i = 0; i < toggleBtnNames.length; i++) {
			togglebuttons[i] = new JToggleButton(toggleBtnNames[i]);
			togglebuttons[i].setBackground(Color.BLACK);
			togglebuttons[i].setForeground(Color.WHITE);
			togglebuttons[i].addItemListener(this);
		}

		leftBtn = new JButton[leftNames.length];
		for (int i = 0; i < leftNames.length; i++) {
			leftBtn[i] = new JButton(leftNames[i]);
			leftBtn[i].setBackground(Color.BLACK);
			leftBtn[i].setForeground(Color.WHITE);
			leftBtn[i].addActionListener(this);

			leftPanel.add(leftBtn[i]);

			switch (i) {
			case 41:
				leftPanel.add(togglebuttons[0]);
				break;

			case 53:
				leftPanel.add(togglebuttons[1]);
				break;

			case 64:
				leftPanel.add(togglebuttons[2]);
				leftPanel.add(togglebuttons[3]);
				break;

			case 65:
				leftPanel.add(togglebuttons[4]);
				break;

			case 66:
				leftPanel.add(togglebuttons[5]);
				leftPanel.add(togglebuttons[6]);
				break;

			case 69:
				leftPanel.add(togglebuttons[7]);
				break;
			}
			leftPanel.setBounds(0, 0, 764, 187);
		}
		return leftPanel;
	}

	// Adding Action to our program
	public void actionPerformed(ActionEvent e) {
		try {
			robot = new Robot();

			if (e.getSource() == leftBtn[0])
				robot.keyPress(KeyEvent.VK_ESCAPE);

			if (e.getSource() == leftBtn[1])
				robot.keyPress(KeyEvent.VK_F1);

			if (e.getSource() == leftBtn[2])
				robot.keyPress(KeyEvent.VK_F2);

			if (e.getSource() == leftBtn[3])
				robot.keyPress(KeyEvent.VK_F3);

			if (e.getSource() == leftBtn[4])
				robot.keyPress(KeyEvent.VK_F4);

			if (e.getSource() == leftBtn[5])
				robot.keyPress(KeyEvent.VK_F5);

			if (e.getSource() == leftBtn[6])
				robot.keyPress(KeyEvent.VK_F6);

			if (e.getSource() == leftBtn[7])
				robot.keyPress(KeyEvent.VK_F7);

			if (e.getSource() == leftBtn[8])
				robot.keyPress(KeyEvent.VK_F8);

			if (e.getSource() == leftBtn[9])
				robot.keyPress(KeyEvent.VK_F9);

			if (e.getSource() == leftBtn[10])
				robot.keyPress(KeyEvent.VK_F10);

			if (e.getSource() == leftBtn[11])
				robot.keyPress(KeyEvent.VK_F11);

			if (e.getSource() == leftBtn[12])
				robot.keyPress(KeyEvent.VK_F12);

			if (e.getSource() == leftBtn[13])
				robot.keyPress(KeyEvent.VK_BACK_QUOTE);

			if (e.getSource() == leftBtn[14])
				robot.keyPress(KeyEvent.VK_1);

			if (e.getSource() == leftBtn[15])
				robot.keyPress(KeyEvent.VK_2);

			if (e.getSource() == leftBtn[16])
				robot.keyPress(KeyEvent.VK_3);

			if (e.getSource() == leftBtn[17])
				robot.keyPress(KeyEvent.VK_4);

			if (e.getSource() == leftBtn[18])
				robot.keyPress(KeyEvent.VK_5);

			if (e.getSource() == leftBtn[19])
				robot.keyPress(KeyEvent.VK_6);

			if (e.getSource() == leftBtn[20])
				robot.keyPress(KeyEvent.VK_7);

			if (e.getSource() == leftBtn[21])
				robot.keyPress(KeyEvent.VK_8);

			if (e.getSource() == leftBtn[22])
				robot.keyPress(KeyEvent.VK_9);

			if (e.getSource() == leftBtn[23])
				robot.keyPress(KeyEvent.VK_0);

			if (e.getSource() == leftBtn[24])
				robot.keyPress(KeyEvent.VK_MINUS);

			if (e.getSource() == leftBtn[25])
				robot.keyPress(KeyEvent.VK_EQUALS);

			if (e.getSource() == leftBtn[26])
				robot.keyPress(KeyEvent.VK_BACK_SPACE);

			if (e.getSource() == leftBtn[27])
				robot.keyPress(KeyEvent.VK_TAB);

			if (e.getSource() == leftBtn[28])
				robot.keyPress(KeyEvent.VK_Q);

			if (e.getSource() == leftBtn[29])
				robot.keyPress(KeyEvent.VK_W);

			if (e.getSource() == leftBtn[30])
				robot.keyPress(KeyEvent.VK_E);

			if (e.getSource() == leftBtn[31])
				robot.keyPress(KeyEvent.VK_R);

			if (e.getSource() == leftBtn[32])
				robot.keyPress(KeyEvent.VK_T);

			if (e.getSource() == leftBtn[33])
				robot.keyPress(KeyEvent.VK_Y);

			if (e.getSource() == leftBtn[34])
				robot.keyPress(KeyEvent.VK_U);

			if (e.getSource() == leftBtn[35])
				robot.keyPress(KeyEvent.VK_I);

			if (e.getSource() == leftBtn[36])
				robot.keyPress(KeyEvent.VK_O);

			if (e.getSource() == leftBtn[37])
				robot.keyPress(KeyEvent.VK_P);

			if (e.getSource() == leftBtn[38])
				robot.keyPress(KeyEvent.VK_OPEN_BRACKET);

			if (e.getSource() == leftBtn[39])
				robot.keyPress(KeyEvent.VK_CLOSE_BRACKET);

			if (e.getSource() == leftBtn[40])
				robot.keyPress(KeyEvent.VK_BACK_SLASH);

			if (e.getSource() == leftBtn[41])
				robot.keyPress(KeyEvent.VK_DELETE);

			if (e.getSource() == leftBtn[42])
				robot.keyPress(KeyEvent.VK_A);

			if (e.getSource() == leftBtn[43])
				robot.keyPress(KeyEvent.VK_S);

			if (e.getSource() == leftBtn[44])
				robot.keyPress(KeyEvent.VK_D);

			if (e.getSource() == leftBtn[45])
				robot.keyPress(KeyEvent.VK_F);

			if (e.getSource() == leftBtn[46])
				robot.keyPress(KeyEvent.VK_G);

			if (e.getSource() == leftBtn[47])
				robot.keyPress(KeyEvent.VK_H);

			if (e.getSource() == leftBtn[48])
				robot.keyPress(KeyEvent.VK_J);

			if (e.getSource() == leftBtn[49])
				robot.keyPress(KeyEvent.VK_K);

			if (e.getSource() == leftBtn[50])
				robot.keyPress(KeyEvent.VK_L);

			if (e.getSource() == leftBtn[51])
				robot.keyPress(KeyEvent.VK_SEMICOLON);

			if (e.getSource() == leftBtn[52])
				robot.keyPress(KeyEvent.VK_QUOTE);

			if (e.getSource() == leftBtn[53])
				robot.keyPress(KeyEvent.VK_ENTER);

			if (e.getSource() == leftBtn[54])
				robot.keyPress(KeyEvent.VK_Z);

			if (e.getSource() == leftBtn[55])
				robot.keyPress(KeyEvent.VK_X);

			if (e.getSource() == leftBtn[56])
				robot.keyPress(KeyEvent.VK_C);

			if (e.getSource() == leftBtn[57])
				robot.keyPress(KeyEvent.VK_V);

			if (e.getSource() == leftBtn[58])
				robot.keyPress(KeyEvent.VK_B);

			if (e.getSource() == leftBtn[59])
				robot.keyPress(KeyEvent.VK_N);

			if (e.getSource() == leftBtn[60])
				robot.keyPress(KeyEvent.VK_M);

			if (e.getSource() == leftBtn[61])
				robot.keyPress(KeyEvent.VK_COMMA);

			if (e.getSource() == leftBtn[62])
				robot.keyPress(KeyEvent.VK_PERIOD);

			if (e.getSource() == leftBtn[63])
				robot.keyPress(KeyEvent.VK_SLASH);

			if (e.getSource() == leftBtn[64])
				robot.keyPress(KeyEvent.VK_UP);

			if (e.getSource() == leftBtn[65]) {
				robot.keyPress(KeyEvent.VK_WINDOWS);
				robot.keyRelease(KeyEvent.VK_WINDOWS);
			}

			if (e.getSource() == leftBtn[66])
				robot.keyPress(KeyEvent.VK_SPACE);

			if (e.getSource() == leftBtn[67])
				robot.keyPress(KeyEvent.VK_LEFT);

			if (e.getSource() == leftBtn[68])
				robot.keyPress(KeyEvent.VK_DOWN);

			if (e.getSource() == leftBtn[69])
				robot.keyPress(KeyEvent.VK_RIGHT);

			if (e.getSource() == rightBtn[0])
				robot.keyPress(KeyEvent.VK_HOME);

			if (e.getSource() == rightBtn[1])
				robot.keyPress(KeyEvent.VK_PAGE_UP);

			if (e.getSource() == rightBtn[2])
				robot.keyPress(KeyEvent.VK_END);

			if (e.getSource() == rightBtn[3])
				robot.keyPress(KeyEvent.VK_PAGE_DOWN);

			if (e.getSource() == rightBtn[4])
				robot.keyPress(KeyEvent.VK_INSERT);

			if (e.getSource() == rightBtn[5])
				robot.keyPress(KeyEvent.VK_PAUSE);

			if (e.getSource() == rightBtn[6])
				robot.keyPress(KeyEvent.VK_PRINTSCREEN);

		} catch (AWTException e1) {
			e1.printStackTrace();
		}
	}

	public void itemStateChanged(ItemEvent ev) {
		try {
			robot = new Robot();

			if (ev.getStateChange() == ItemEvent.SELECTED
					&& ev.getSource() == togglebuttons[0]) {
				convertToUpperCase();
				togglebuttons[0].setForeground(Color.BLACK);
				Toolkit.getDefaultToolkit().setLockingKeyState(
						KeyEvent.VK_CAPS_LOCK, true);
			} else if (ev.getStateChange() == ItemEvent.DESELECTED
					&& ev.getSource() == togglebuttons[0]) {
				convertToLowerCase();
				togglebuttons[0].setForeground(Color.WHITE);
				Toolkit.getDefaultToolkit().setLockingKeyState(
						KeyEvent.VK_CAPS_LOCK, false);
			}
			if (ev.getStateChange() == ItemEvent.SELECTED
					&& ev.getSource() == togglebuttons[1]) {
				robot.keyPress(KeyEvent.VK_SHIFT);
				togglebuttons[1].setForeground(Color.BLACK);
			} else if (ev.getStateChange() == ItemEvent.DESELECTED
					&& ev.getSource() == togglebuttons[1]) {
				robot.keyRelease(KeyEvent.VK_SHIFT);
				togglebuttons[1].setForeground(Color.WHITE);
			}

			if (ev.getStateChange() == ItemEvent.SELECTED
					&& ev.getSource() == togglebuttons[2]) {
				robot.keyPress(KeyEvent.VK_SHIFT);
				togglebuttons[2].setForeground(Color.BLACK);
			}

			else if (ev.getStateChange() == ItemEvent.DESELECTED
					&& ev.getSource() == togglebuttons[2]) {
				robot.keyRelease(KeyEvent.VK_SHIFT);
				togglebuttons[2].setForeground(Color.WHITE);
			}

			if (ev.getStateChange() == ItemEvent.SELECTED
					&& ev.getSource() == togglebuttons[3]) {
				robot.keyPress(KeyEvent.VK_CONTROL);
				togglebuttons[3].setForeground(Color.BLACK);
			}

			else if (ev.getStateChange() == ItemEvent.DESELECTED
					&& ev.getSource() == togglebuttons[3]) {
				robot.keyRelease(KeyEvent.VK_CONTROL);
				togglebuttons[3].setForeground(Color.WHITE);
			}

			if (ev.getStateChange() == ItemEvent.SELECTED
					&& ev.getSource() == togglebuttons[4]) {
				robot.keyPress(KeyEvent.VK_ALT);
				togglebuttons[4].setForeground(Color.BLACK);
			} else if (ev.getStateChange() == ItemEvent.DESELECTED
					&& ev.getSource() == togglebuttons[4]) {
				robot.keyRelease(KeyEvent.VK_ALT);
				togglebuttons[4].setForeground(Color.WHITE);
			}

			if (ev.getStateChange() == ItemEvent.SELECTED
					&& ev.getSource() == togglebuttons[5]) {
				robot.keyPress(KeyEvent.VK_ALT);
				togglebuttons[5].setForeground(Color.BLACK);
			} else if ((ev.getStateChange() == ItemEvent.DESELECTED && ev
					.getSource() == togglebuttons[5])) {
				robot.keyRelease(KeyEvent.VK_ALT);
				togglebuttons[5].setForeground(Color.WHITE);
			}

			if (ev.getStateChange() == ItemEvent.SELECTED
					&& ev.getSource() == togglebuttons[6]) {
				robot.keyPress(KeyEvent.VK_CONTROL);
				togglebuttons[6].setForeground(Color.BLACK);
			}

			else if (ev.getStateChange() == ItemEvent.DESELECTED
					&& ev.getSource() == togglebuttons[6]) {
				robot.keyRelease(KeyEvent.VK_CONTROL);
				togglebuttons[6].setForeground(Color.WHITE);
			}

			if (ev.getStateChange() == ItemEvent.SELECTED
					&& ev.getSource() == scrlk) {
				Toolkit.getDefaultToolkit().setLockingKeyState(
						KeyEvent.VK_SCROLL_LOCK, true);
				scrlk.setForeground(Color.BLACK);
			} else if (ev.getStateChange() == ItemEvent.DESELECTED
					&& ev.getSource() == scrlk) {
				Toolkit.getDefaultToolkit().setLockingKeyState(
						KeyEvent.VK_SCROLL_LOCK, false);
				scrlk.setForeground(Color.WHITE);
			}

		} catch (AWTException e1) {
			e1.printStackTrace();
		}
	}

	// Convert lower case to upper case method
	public void convertToUpperCase() {
		for (int i = 28; i < leftNames.length - 32; i++) {
			leftBtn[i].setText(leftNames[i].toUpperCase());
			leftBtn[27].setText("Tab      ");
		}

		for (int i = 42; i < leftNames.length - 19; i++) {
			leftBtn[i].setText(leftNames[i].toUpperCase());
			togglebuttons[0].setText("Caps         ");
		}

		for (int i = 54; i < leftNames.length - 9; i++) {
			leftBtn[i].setText(leftNames[i].toUpperCase());
			togglebuttons[1].setText("Shift                ");
		}
	}

	// Convert upper case to lower case method
	public void convertToLowerCase() {
		for (int i = 28; i < leftNames.length - 32; i++) {
			leftBtn[i].setText(leftNames[i].toLowerCase());
			leftBtn[27].setText("Tab           ");
		}

		for (int i = 42; i < leftNames.length - 19; i++) {
			leftBtn[i].setText(leftNames[i].toLowerCase());
			togglebuttons[0].setText("Caps              ");
		}

		for (int i = 54; i < leftNames.length - 9; i++) {
			leftBtn[i].setText(leftNames[i].toLowerCase());
			togglebuttons[1].setText("Shift                  ");
		}
	}

	public static void main(String[] args) {
		new JavaVirtualKeyboard();
	}
}