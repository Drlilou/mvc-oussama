package main;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import view.Authentification;

public class Main {
	public static void main(String[] args) {
		try {
			// Set cross-platform Java L&F (also called "Metal")
			// Set System L&F
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (UnsupportedLookAndFeelException e) {
			// handle exception
		} catch (ClassNotFoundException e) {
			// handle exception
		} catch (InstantiationException e) {
			// handle exception
		} catch (IllegalAccessException e) {
			// handle exception
		}
		Authentification f = new Authentification();
		f.setVisible(true);
		;
	}

}
