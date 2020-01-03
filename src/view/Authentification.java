package view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.TrayIcon.MessageType;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import javax.swing.JSplitPane;
import javax.swing.border.TitledBorder;
import javax.swing.text.Document;

import controle.ControllePersonne;
import model.Personne;

import javax.swing.UIManager;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;

public class Authentification extends JFrame implements ActionListener {
	ControllePersonne pc;

	public Authentification() {
		this(new ControllePersonne());
		
	}

	public Authentification(ControllePersonne pc) {
		this.pc = pc;
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 630, 344);
		setResizable(false);
		setTitle("authentification");

		JPanel panel_1 = new JPanel();
		getContentPane().add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new BorderLayout(0, 0));

		JPanel panel_2 = new JPanel();
		panel_1.add(panel_2, BorderLayout.CENTER);
		panel_2.setLayout(new GridLayout(0, 1, 0, 0));

		JPanel panel_3 = new JPanel();
		panel_2.add(panel_3);
		panel_3.setLayout(null);

		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new TitledBorder(UIManager.getBorder("ToolBar.border"), "Inscription", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(255, 0, 0)));
		panel_4.setBounds(222, 69, 371, 204);
		panel_3.add(panel_4);
		panel_4.setLayout(null);
		panel_4.setOpaque(false);
		JLabel lblNewLabel = new JLabel("nom d'utilisateur");
		lblNewLabel.setBounds(6, 36, 112, 14);
		panel_4.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("mot de passe");
		lblNewLabel_1.setForeground(Color.DARK_GRAY);
		lblNewLabel_1.setBounds(6, 64, 89, 14);
		panel_4.add(lblNewLabel_1);

		username = new JTextField();
		username.setBounds(141, 33, 153, 20);
		panel_4.add(username);
		username.setColumns(10);

		passwordField = new JPasswordField();
		passwordField.setBounds(141, 61, 153, 20);
		panel_4.add(passwordField);

		JButton btnNewButton = new JButton("valider");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String pseudo = username.getText().trim(), password = passwordField.getText();
				if (!pseudo.isEmpty() && !password.isEmpty()) {
					Personne peron = new Personne(pseudo, password);
					if (pc.existPersonne(peron)) {
						Alerts.msg(null, "User Exist ", "Succes ", Alerts.SUCCESS);
						vider();
					} else {
						Alerts.msg(null, "User n'exist pas ", "Error ", Alerts.FAIL);
					}

				} else {
					Alerts.msg(null, "pseudo  or mot de passe vide ", "Error ", Alerts.FAIL);

				}
			}
		});
		btnNewButton.setBounds(136, 124, 89, 23);
		panel_4.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("vider");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				vider();
			}
		});
		btnNewButton_1.setBounds(235, 124, 89, 23);
		panel_4.add(btnNewButton_1);

		JLabel lblAlreadyHaveA = new JLabel("déjà  a un compts");
		lblAlreadyHaveA.setBounds(151, 92, 112, 14);
		panel_4.add(lblAlreadyHaveA);

		JLabel lblClickMe = new JLabel("clique ici");
		lblClickMe.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				dispose();
				new Inscription(pc).setVisible(true);
			}
		});
		lblClickMe.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		lblClickMe.setBounds(264, 92, 60, 14);
		panel_4.add(lblClickMe);

		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(Authentification.class.getResource("/img/login-rounded.png")));
		lblNewLabel_2.setBounds(10, 26, 651, 261);
		panel_3.add(lblNewLabel_2);

	}

	private void vider() {
		username.setText("");
		passwordField.setText("");
	}

	/**
		 * 
		 */
	private static final long serialVersionUID = 1L;

	@Override
	public void actionPerformed(ActionEvent ae) {
		String userName = username.getText();
		String password = passwordField.getText();
		if (userName.trim().equals("admin") && password.trim().equals("admin")) {
			System.out.println("11");
		} else {
			System.out.println("12");
		}
	}



	JButton submit, cancel;
	private JTextField username;
	private JPasswordField passwordField;

}