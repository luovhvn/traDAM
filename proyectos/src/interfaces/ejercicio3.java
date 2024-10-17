package interfaces;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.BoxLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ejercicio3 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ejercicio3 frame = new ejercicio3();
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
	public ejercicio3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton_2 = new JButton("Uno");
		btnNewButton_2.setBounds(10, 20, 85, 21);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_4 = new JButton("Dos");
		btnNewButton_4.setBounds(10, 51, 85, 21);
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_3 = new JButton("Tres");
		btnNewButton_3.setBounds(10, 82, 85, 21);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_1 = new JButton("Cuatro");
		btnNewButton_1.setBounds(10, 113, 85, 21);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton = new JButton("Cinco");
		btnNewButton.setBounds(10, 144, 85, 21);
		contentPane.add(btnNewButton);
	}

}
