package gui;
import java.awt.EventQueue;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JPasswordField;
import javax.swing.JButton;

public class Booking {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Booking window = new Booking();
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
	public Booking() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 467, 347);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		DefaultListModel<String>l1=new DefaultListModel<>();
		l1.addElement("Karachi");
		l1.addElement("Lahore");
		
		JList list = new JList();
		list.setBounds(288, 81, 136, 95);
		list.setModel(l1);
		frame.getContentPane().add(list);
		
		JLabel lblNewLabel = new JLabel("Available Trips");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(298, 56, 136, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Book Trip");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_1.setBounds(144, 0, 95, 32);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Select Number of People");
		lblNewLabel_2.setBounds(10, 82, 161, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(170, 79, 30, 20);
		frame.getContentPane().add(spinner);
		
		JLabel lblNewLabel_3 = new JLabel("Select Time");
		lblNewLabel_3.setBounds(10, 122, 78, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Select Date");
		lblNewLabel_4.setBounds(10, 147, 65, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		textField = new JTextField();
		textField.setBounds(85, 119, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(85, 144, 86, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Choose Payment Method");
		lblNewLabel_5.setBounds(10, 186, 190, 14);
		frame.getContentPane().add(lblNewLabel_5);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Cash");
		rdbtnNewRadioButton.setBounds(6, 207, 95, 23);
		frame.getContentPane().add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Credit");
		rdbtnNewRadioButton_1.setBounds(116, 207, 109, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_1);
		
		JLabel lblNewLabel_6 = new JLabel("Enter Password to Confirm");
		lblNewLabel_6.setBounds(10, 244, 161, 14);
		frame.getContentPane().add(lblNewLabel_6);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(181, 241, 102, 20);
		frame.getContentPane().add(passwordField);
		
		JButton btnNewButton = new JButton("Book Trip");
		btnNewButton.setBounds(191, 274, 89, 23);
		frame.getContentPane().add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// more code needed
				frame.dispose();
				
			}
		});
		
		
		
		
		
		
	}
	
	
	
	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		frame.setVisible(b);
	}

	public void pack() {
		// TODO Auto-generated method stub
		frame.pack();
	}

	public void setLocationRelativeTo(Object object) {
		// TODO Auto-generated method stub
		frame.setLocationRelativeTo(null);
	}

	public void setExtendedState(int maximizedBoth) {
		// TODO Auto-generated method stub
		frame.setExtendedState(JFrame.NORMAL);
	}
}
