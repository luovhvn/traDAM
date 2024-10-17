package interfaces;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ejercicio2 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ejercicio2 frame = new ejercicio2();
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
	public ejercicio2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton_2 = new JButton("Uno");
		btnNewButton_2.setBounds(5, 5, 85, 131);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_4 = new JButton("Dos");
		btnNewButton_4.setBounds(90, 5, 85, 131);
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_3 = new JButton("Tres");
		btnNewButton_3.setBounds(175, 5, 85, 131);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_1 = new JButton("Cuatro");
		btnNewButton_1.setBounds(5, 132, 85, 131);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton = new JButton("Cinco");
		btnNewButton.setBounds(90, 132, 85, 131);
		contentPane.add(btnNewButton);
	}

}
