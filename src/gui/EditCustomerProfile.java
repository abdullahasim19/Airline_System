package gui;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import com.toedter.calendar.JDateChooser;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class EditCustomerProfile {

	private JFrame frame;
	private JTextField fname;
	private JTextField contact;
	private JTextField address;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EditCustomerProfile window = new EditCustomerProfile();
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
	public EditCustomerProfile() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(192, 192, 192));
		frame.setBounds(100, 100, 720, 620);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Edit Profile");
		lblNewLabel.setIcon(new ImageIcon(SignUpPage.class.getResource("/imgs/signup.png")));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 55));
		lblNewLabel.setBounds(162, 11, 412, 95);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel FullName = new JLabel("Full Name");
		FullName.setFont(new Font("Tahoma", Font.BOLD, 18));
		FullName.setBounds(126, 129, 105, 38);
		frame.getContentPane().add(FullName);
		
		JLabel lblGender = new JLabel("Gender");
		lblGender.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblGender.setBounds(126, 201, 105, 38);
		frame.getContentPane().add(lblGender);
		
		JLabel lblDateOfBirth = new JLabel("Date of Birth");
		lblDateOfBirth.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblDateOfBirth.setBounds(126, 265, 124, 38);
		frame.getContentPane().add(lblDateOfBirth);
		
		JLabel lblContact = new JLabel("Contact");
		lblContact.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblContact.setBounds(126, 314, 105, 38);
		frame.getContentPane().add(lblContact);
		
		JLabel lblAddress = new JLabel("Address");
		lblAddress.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblAddress.setBounds(126, 361, 105, 38);
		frame.getContentPane().add(lblAddress);
		
		fname = new JTextField();
		fname.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				fname.setEnabled(true);
				
			}
		});
		fname.setEnabled(false);
		fname.setBounds(317, 141, 257, 20);
		frame.getContentPane().add(fname);
		fname.setColumns(10);
		
		contact = new JTextField();
		contact.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				contact.setEnabled(true);
			}
		});
		contact.setEnabled(false);
		contact.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if(!Character.isDigit(e.getKeyChar()))
				{
					e.consume();
				}
			
			}
			
		});
		contact.setColumns(10);
		contact.setBounds(317, 326, 257, 20);
		frame.getContentPane().add(contact);
		
		address = new JTextField();
		address.setEnabled(false);
		address.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				address.setEnabled(true);
			}
		});
		address.setColumns(10);
		address.setBounds(317, 368, 257, 110);
		frame.getContentPane().add(address);
		
		JRadioButton Male = new JRadioButton("Male");
		Male.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Male.setEnabled(true);
			}
		});
		Male.setEnabled(false);
		Male.setFont(new Font("Tahoma", Font.BOLD, 14));
		Male.setBounds(317, 210, 68, 23);
		frame.getContentPane().add(Male);
		
		JRadioButton Female = new JRadioButton("Female");
		Female.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Female.setEnabled(true);
			}
		});
		Female.setEnabled(false);
		Female.setFont(new Font("Tahoma", Font.BOLD, 14));
		Female.setBounds(407, 210, 89, 23);
		frame.getContentPane().add(Female);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(317, 276, 257, 20);
		frame.getContentPane().add(dateChooser);
		//dateChooser.setEnabled(false);
		
		JButton Confirm = new JButton("Confirm");
		Confirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// more code is required
				frame.dispose();
			}
		});
		Confirm.setFont(new Font("Tahoma", Font.BOLD, 18));
		Confirm.setBounds(434, 519, 124, 32);
		frame.getContentPane().add(Confirm);
		
		JButton Cancel = new JButton("Cancel");
		Cancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
		Cancel.setFont(new Font("Tahoma", Font.BOLD, 18));
		Cancel.setBounds(145, 519, 105, 32);
		frame.getContentPane().add(Cancel);
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
