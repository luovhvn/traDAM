package java;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class interfazgridlayout01102024 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					interfazgridlayout01102024 frame = new interfazgridlayout01102024();
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
	public interfazgridlayout01102024() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton_3 = new JButton("Uno");
		btnNewButton_3.setBounds(5, 5, 85, 126);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_2 = new JButton("Dos");
		btnNewButton_2.setBounds(90, 5, 85, 126);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_4 = new JButton("Tres");
		btnNewButton_4.setBounds(175, 5, 85, 126);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_3_1 = new JButton("Cuatro");
		btnNewButton_3_1.setBounds(5, 127, 85, 126);
		contentPane.add(btnNewButton_3_1);
		
		JButton btnNewButton_3_2 = new JButton("Cinco");
		btnNewButton_3_2.setBounds(90, 127, 85, 126);
		contentPane.add(btnNewButton_3_2);
	}
}
