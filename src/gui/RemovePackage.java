package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JList;
import java.awt.Color;

public class RemovePackage {

	private JFrame frame;
	private JTextField tripid;
	private JTextField password;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RemovePackage window = new RemovePackage();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public RemovePackage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 470, 345);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Remove Package");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(148, 21, 161, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Enter Trip ID");
		lblNewLabel_1.setBounds(33, 83, 88, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Password");
		lblNewLabel_1_1.setBounds(33, 140, 70, 14);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		tripid = new JTextField();
		tripid.setBounds(130, 80, 86, 20);
		frame.getContentPane().add(tripid);
		tripid.setColumns(10);
		
		password = new JTextField();
		password.setBounds(130, 137, 86, 20);
		frame.getContentPane().add(password);
		password.setColumns(10);
		
		JButton viewpackages = new JButton("View Your Packages");
		viewpackages.setBackground(Color.RED);
		viewpackages.setBounds(63, 259, 153, 23);
		frame.getContentPane().add(viewpackages);
		
		JButton removepackage = new JButton("Remove Package");
		removepackage.setBackground(Color.RED);
		removepackage.setBounds(252, 259, 134, 23);
		frame.getContentPane().add(removepackage);
		
		JList list = new JList();
		list.setBounds(127, 193, 197, 44);
		frame.getContentPane().add(list);
		
		JLabel lblNewLabel_2 = new JLabel("Your Packages");
		lblNewLabel_2.setBounds(33, 194, 91, 14);
		frame.getContentPane().add(lblNewLabel_2);
	}
}
