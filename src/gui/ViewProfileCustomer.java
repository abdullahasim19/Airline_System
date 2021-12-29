package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JTextField;

import classes.Customer;
import classes.GUI;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class ViewProfileCustomer {

	private JFrame frame;
	private JTextField userName;
	private JTextField fullName;
	private JTextField Gender;
	private JTextField DOB;
	private JTextField Contact;
	private JTextField Address;

	Customer customer;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewProfileCustomer window = new ViewProfileCustomer();
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
	public ViewProfileCustomer() {
		initialize();
	}
	public ViewProfileCustomer(Customer c) {
		customer=c;
		initialize();
	}
	

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.GRAY);
		frame.setBounds(100, 100, 648, 567);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Your Profile");
		lblNewLabel.setIcon(new ImageIcon(ViewProfileCustomer.class.getResource("/imgs/profile.png")));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 50));
		lblNewLabel.setBounds(95, 11, 443, 134);
		frame.getContentPane().add(lblNewLabel);
		
		userName = new JTextField();
		userName.setEditable(false);
		userName.setEnabled(false);
		userName.setBounds(95, 244, 141, 20);
		frame.getContentPane().add(userName);
		userName.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("User Name");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1.setBounds(120, 213, 109, 20);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Full Name");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1_1.setBounds(383, 213, 126, 20);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Gender");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1_2.setBounds(138, 304, 66, 20);
		frame.getContentPane().add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("DOB");
		lblNewLabel_1_2_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1_2_1.setBounds(428, 304, 66, 20);
		frame.getContentPane().add(lblNewLabel_1_2_1);
		
		JLabel lblNewLabel_1_2_2 = new JLabel("Contact");
		lblNewLabel_1_2_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1_2_2.setBounds(138, 395, 82, 20);
		frame.getContentPane().add(lblNewLabel_1_2_2);
		
		fullName = new JTextField();
		fullName.setEnabled(false);
		fullName.setColumns(10);
		fullName.setBounds(371, 244, 141, 20);
		frame.getContentPane().add(fullName);
		
		JLabel lblNewLabel_1_2_2_1 = new JLabel("Address");
		lblNewLabel_1_2_2_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1_2_2_1.setBounds(412, 395, 82, 20);
		frame.getContentPane().add(lblNewLabel_1_2_2_1);
		
		Gender = new JTextField();
		Gender.setEnabled(false);
		Gender.setColumns(10);
		Gender.setBounds(95, 345, 141, 20);
		frame.getContentPane().add(Gender);
		
		DOB = new JTextField();
		DOB.setEnabled(false);
		DOB.setColumns(10);
		DOB.setBounds(371, 345, 141, 20);
		frame.getContentPane().add(DOB);
		
		Contact = new JTextField();
		Contact.setEnabled(false);
		Contact.setColumns(10);
		Contact.setBounds(95, 434, 141, 20);
		frame.getContentPane().add(Contact);
		
		Address = new JTextField();
		Address.setEnabled(false);
		Address.setColumns(10);
		Address.setBounds(371, 434, 141, 20);
		frame.getContentPane().add(Address);
		
		JButton Back = new JButton("Back");
		Back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frame.dispose();
				
			}
		});
		Back.setFont(new Font("Tahoma", Font.BOLD, 14));
		Back.setBounds(253, 494, 89, 23);
		frame.getContentPane().add(Back);
		
		GUI g=new GUI();
		g.viewDetails(userName, fullName, Gender, DOB, Contact, Address, customer.getUsername());
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
