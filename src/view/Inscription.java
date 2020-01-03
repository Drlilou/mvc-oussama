package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.GridLayout;
import javax.swing.border.TitledBorder;

import controle.ControllePersonne;
import model.Personne;

import javax.swing.UIManager;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Inscription extends JFrame {

	private JPanel contentPane;
	private JTextField firstnametextField;
	private JTextField lastnametextField;
	private JTextField pseudotextField;
	private JTextField mailtextField;
	private JTextField telephonetextField;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;
	ControllePersonne pc = new ControllePersonne();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Inscription frame = new Inscription(new ControllePersonne());
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Inscription(ControllePersonne pc) {
		setResizable(false);
		setTitle("inscription"
				+ "");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 566, 459);

		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);

		JMenuItem mntmNewMenuItem = new JMenuItem("s'autentifier");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				new Authentification(pc).setVisible(true);
			}
		});

		mnFile.add(mntmNewMenuItem);

		JMenu mnNewMenu = new JMenu("edit");
		menuBar.add(mnNewMenu);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);

		JLabel lblRegistrationForm = new JLabel("Inscription");
		lblRegistrationForm.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 34));
		panel.add(lblRegistrationForm);

		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.SOUTH);

		JPanel panel_2 = new JPanel();
		contentPane.add(panel_2, BorderLayout.CENTER);
		panel_2.setLayout(new BorderLayout(0, 0));

		JPanel panel_6 = new JPanel();
		panel_2.add(panel_6);
		panel_6.setLayout(new GridLayout(0, 1, 0, 0));

		JPanel panel_7 = new JPanel();
		panel_7.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "donn\u00E9e personnel", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_6.add(panel_7);
		panel_7.setLayout(new BorderLayout(0, 0));

		JPanel panel_11 = new JPanel();
		panel_7.add(panel_11, BorderLayout.CENTER);
		panel_11.setLayout(null);

		JLabel prenom = new JLabel("prénom");
		prenom.setBounds(10, 0, 70, 20);
		panel_11.add(prenom);

		JLabel lblNewLabel_1 = new JLabel("nom");
		lblNewLabel_1.setBounds(10, 31, 60, 20);
		panel_11.add(lblNewLabel_1);

		firstnametextField = new JTextField();
		firstnametextField.setBounds(114, 0, 121, 20);
		panel_11.add(firstnametextField);
		firstnametextField.setColumns(10);

		lastnametextField = new JTextField();
		lastnametextField.setBounds(114, 31, 121, 20);
		panel_11.add(lastnametextField);
		lastnametextField.setColumns(10);

		JPanel panel_8 = new JPanel();
		panel_8.setForeground(Color.BLACK);

		panel_6.add(panel_8);
		panel_8.setLayout(null);

		JLabel lblNewLabel_2 = new JLabel("Pseudo");
		lblNewLabel_2.setBounds(10, 23, 88, 27);
		panel_8.add(lblNewLabel_2);

		pseudotextField = new JTextField();
		pseudotextField.setBounds(86, 26, 256, 20);
		panel_8.add(pseudotextField);
		pseudotextField.setColumns(10);

		JPanel panel_9 = new JPanel();
		panel_9.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Contact ", TitledBorder.CENTER,
				TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_6.add(panel_9);
		panel_9.setLayout(null);

		JLabel lblEmail = new JLabel("Email");
		lblEmail.setBounds(24, 11, 47, 34);
		panel_9.add(lblEmail);

		mailtextField = new JTextField();
		mailtextField.setBounds(113, 18, 124, 20);
		panel_9.add(mailtextField);
		mailtextField.setColumns(10);

		JLabel lblTelephone = new JLabel("Telephone");
		lblTelephone.setBounds(24, 46, 65, 34);
		panel_9.add(lblTelephone);

		telephonetextField = new JTextField();
		telephonetextField.setBounds(113, 53, 124, 20);
		panel_9.add(telephonetextField);
		telephonetextField.setColumns(10);

		JLabel lblOb = new JLabel("au moin num de tel ou mail");
		lblOb.setForeground(Color.RED);
		lblOb.setBounds(329, 31, 201, 14);
		panel_9.add(lblOb);
		lblOb.setVisible(false);
		JPanel panel_10 = new JPanel();
		panel_10.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "mot de passe", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_6.add(panel_10);
		panel_10.setLayout(null);

		JLabel lblNewLabel_3 = new JLabel("Confirmation");
		lblNewLabel_3.setBounds(30, 44, 61, 35);
		panel_10.add(lblNewLabel_3);

		passwordField = new JPasswordField();
		passwordField.setBounds(111, 13, 124, 20);
		panel_10.add(passwordField);

		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(111, 51, 124, 20);
		panel_10.add(passwordField_1);

		JLabel lblNewLabel_4 = new JLabel("mot de passe");
		lblNewLabel_4.setBounds(20, 11, 81, 25);
		panel_10.add(lblNewLabel_4);

		JLabel lblPasswordDoitEtre = new JLabel("verifier(mdp deferent ou vide)");
		lblPasswordDoitEtre.setForeground(Color.RED);
		lblPasswordDoitEtre.setBounds(306, 32, 201, 14);
		panel_10.add(lblPasswordDoitEtre);
		lblPasswordDoitEtre.setVisible(false);
		JPanel panel_5 = new JPanel();
		panel_2.add(panel_5, BorderLayout.SOUTH);

		JButton btnNewButton = new JButton("submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String firstname, lastname, pseudo, email, telephone, mdp, mdpconf;
				firstname = firstnametextField.getText().trim();
				lastname = lastnametextField.getText().trim();
				pseudo = pseudotextField.getText().trim();
				email = mailtextField.getText().trim();
				telephone = telephonetextField.getText().trim();
				mdp = passwordField.getText();
				mdpconf = passwordField_1.getText();
				boolean b = isEmpty();

				if (!b) {
					Alerts.msg(null, "donneer managquant ", "Error ", Alerts.FAIL);
					if (!personel) {
						panel_8.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"),
								"vs devez presntez un nom et prenom ou pseudo", TitledBorder.RIGHT, TitledBorder.BOTTOM, null,
								new Color(255, 0, 0)));
					} else {
						panel_8.setBorder(null);
					}
					if (!contact) {
						lblOb.setVisible(true);
					} else {
						lblOb.setVisible(false);
					}
					if (!checkmdp) {
						lblPasswordDoitEtre.setVisible(true);
					} else {
						lblPasswordDoitEtre.setVisible(false);
					}
				} else {
					Personne p = new Personne(firstname, lastname, pseudo, email, telephone, mdp);

					if (pc.ajouterPerson(p)) {
						Alerts.msg(null, "User added avec succes  ", "Succes ", Alerts.SUCCESS);
						vider();
						panel_8.setBorder(null);
						lblPasswordDoitEtre.setVisible(false);
						lblOb.setVisible(false);

					} else {
						Alerts.msg(null, "User deja exist ", "error ", Alerts.FAIL);

					}

				}

			}
		});
		panel_5.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("reset");
		panel_5.add(btnNewButton_1);

		JPanel panel_3 = new JPanel();
		contentPane.add(panel_3, BorderLayout.SOUTH);

		JPanel panel_4 = new JPanel();
		contentPane.add(panel_4, BorderLayout.EAST);
	}

	private boolean isEmpty() {
		String firstname, lastname, pseudo, email, telephone, mdp, mdpconf;
		firstname = firstnametextField.getText().trim();
		lastname = lastnametextField.getText().trim();
		pseudo = pseudotextField.getText().trim();
		email = mailtextField.getText().trim();
		telephone = telephonetextField.getText().trim();
		mdp = passwordField.getText();
		mdpconf = passwordField_1.getText();

		personel = (!firstname.isEmpty() && !lastname.isEmpty()) || !pseudo.isEmpty();

		contact = !email.isEmpty() || !telephone.isEmpty();

		checkmdp = mdp.equals(mdpconf) && !mdp.isEmpty();

		return personel && contact && checkmdp;
	}

	boolean personel, contact, checkmdp;

	private void vider() {
		firstnametextField.setText("");
		lastnametextField.setText("");
		pseudotextField.setText("");
		mailtextField.setText("");
		telephonetextField.setText("");
		passwordField.setText("");
		passwordField_1.setText("");

	}
}
