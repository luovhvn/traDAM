package java;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;

import javax.swing.JInternalFrame;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;
import javax.swing.DropMode;
import java.awt.Cursor;

public class interfazui30092024 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPasswordField passwordField;
	private JTextField txtIng;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					interfazui30092024 frame = new interfazui30092024();
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
	public interfazui30092024() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Tahoma", Font.PLAIN, 12));
		passwordField.setBounds(10, 192, 234, 19);
		passwordField.setBorder(null);
		passwordField.setBackground(SystemColor.menu);
		contentPane.add(passwordField);
		
		txtIng = new JTextField();
		txtIng.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtIng.setDisabledTextColor(new Color(0, 0, 0));
		txtIng.setBounds(10, 136, 234, 19);
		txtIng.setBorder(null);
		txtIng.setColumns(10);
		txtIng.setBackground(SystemColor.menu);
		txtIng.setForeground(new Color(0, 0, 0));
		contentPane.add(txtIng);
		
		JLabel lblNewLabel = new JLabel("Contraseña");
		lblNewLabel.setBounds(10, 168, 102, 25);
		lblNewLabel.setFont(new Font("Yu Gothic Light", Font.PLAIN, 15));
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Usuario");
		lblNewLabel_1.setBounds(10, 100, 88, 39);
		lblNewLabel_1.setFont(new Font("Yu Gothic Light", Font.PLAIN, 15));
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("LOGO");
		lblNewLabel_2.setBounds(53, 21, 45, 19);
		lblNewLabel_2.setFont(new Font("Arial Black", Font.PLAIN, 13));
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("INICIAR SESIÓN");
		lblNewLabel_2_1.setBounds(10, 71, 125, 19);
		lblNewLabel_2_1.setFont(new Font("Arial Black", Font.PLAIN, 13));
		contentPane.add(lblNewLabel_2_1);
		
		JButton btnNewButton = new JButton("ENTRAR");
		btnNewButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton.setBorderPainted(false);
		btnNewButton.setBounds(10, 232, 85, 21);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				char[] Clave = passwordField.getPassword();
				String claveFinal = new String(Clave);
				
				if(txtIng.getText().equals("Luis") && claveFinal.equals("1234")) {
					dispose();
					System.out.print("Has iniciado sesión");
					
				}else {
					System.out.print("Usuario o contraseña incorrectos");
				}
			}
		});
		btnNewButton.setFont(new Font("Arial Black", Font.PLAIN, 10));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(0, 128, 255));
		contentPane.add(btnNewButton);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 156, 233, 2);
		contentPane.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(11, 212, 233, 2);
		contentPane.add(separator_1);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setBounds(10, 13, 45, 39);
		lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\Mañana.ASIR4\\Downloads\\favicon.png"));
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setBounds(273, 18, 153, 167);
		lblNewLabel_5.setIcon(new ImageIcon("C:\\Users\\Mañana.ASIR4\\Downloads\\logo.png"));
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setBounds(257, 0, 192, 263);
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\Mañana.ASIR4\\Downloads\\city.png"));
		contentPane.add(lblNewLabel_3);
		
	}
}
