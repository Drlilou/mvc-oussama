package view;

import java.awt.Component;
import javax.swing.JOptionPane;

public class Alerts {
	public static int SUCCESS = JOptionPane.INFORMATION_MESSAGE;
	public static int FAIL = JOptionPane.ERROR_MESSAGE;

	public static void msg(Component c, String message, String title, int messageType) {
		JOptionPane.showMessageDialog(c, message, title, messageType);
	}

}
