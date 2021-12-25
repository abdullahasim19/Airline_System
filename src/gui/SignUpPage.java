package gui;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import com.toedter.calendar.JDateChooser;

import classes.Admin;
import classes.Customer;
import classes.Person;
import classes.database;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.text.SimpleDateFormat;

public class SignUpPage {

	private JFrame frame;
	private JTextField fname;
	private JTextField username;
	private JTextField contact;
	private JTextField address;
	private JPasswordField pass1;
	private JPasswordField pass2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SignUpPage window = new SignUpPage();
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
	public SignUpPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(192, 192, 192));
		frame.setBounds(100, 100, 720, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Sign up");
		lblNewLabel.setIcon(new ImageIcon(SignUpPage.class.getResource("/imgs/signup.png")));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 55));
		lblNewLabel.setBounds(196, 11, 324, 95);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel FullName = new JLabel("Full Name");
		FullName.setFont(new Font("Tahoma", Font.BOLD, 18));
		FullName.setBounds(126, 129, 105, 38);
		frame.getContentPane().add(FullName);
		
		JLabel uname = new JLabel("Username");
		uname.setFont(new Font("Tahoma", Font.BOLD, 18));
		uname.setBounds(126, 178, 105, 38);
		frame.getContentPane().add(uname);
		
		JLabel lblGender = new JLabel("Gender");
		lblGender.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblGender.setBounds(126, 227, 105, 38);
		frame.getContentPane().add(lblGender);
		
		JLabel lblDateOfBirth = new JLabel("Date of Birth");
		lblDateOfBirth.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblDateOfBirth.setBounds(126, 276, 124, 38);
		frame.getContentPane().add(lblDateOfBirth);
		
		JLabel lblContact = new JLabel("Contact");
		lblContact.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblContact.setBounds(126, 325, 105, 38);
		frame.getContentPane().add(lblContact);
		
		JLabel lblAddress = new JLabel("Address");
		lblAddress.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblAddress.setBounds(126, 361, 105, 38);
		frame.getContentPane().add(lblAddress);
		
		fname = new JTextField();
		fname.setBounds(317, 141, 257, 20);
		frame.getContentPane().add(fname);
		fname.setColumns(10);
		
		username = new JTextField();
		username.setColumns(10);
		username.setBounds(317, 190, 257, 20);
		frame.getContentPane().add(username);
		
		contact = new JTextField();
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
		contact.setBounds(317, 337, 257, 20);
		frame.getContentPane().add(contact);
		
		address = new JTextField();
		address.setColumns(10);
		address.setBounds(317, 368, 257, 110);
		frame.getContentPane().add(address);
		
		JLabel lblAddress_1 = new JLabel("Password");
		lblAddress_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblAddress_1.setBounds(126, 498, 105, 38);
		frame.getContentPane().add(lblAddress_1);
		
		JLabel lblConfirmPassword = new JLabel("Confirm Password");
		lblConfirmPassword.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblConfirmPassword.setBounds(126, 547, 177, 38);
		frame.getContentPane().add(lblConfirmPassword);
		
		pass1 = new JPasswordField();
		pass1.setBounds(317, 507, 257, 26);
		frame.getContentPane().add(pass1);
		
		pass2 = new JPasswordField();
		pass2.setBounds(317, 547, 257, 27);
		frame.getContentPane().add(pass2);
		
		JRadioButton Male = new JRadioButton("Male");
		Male.setFont(new Font("Tahoma", Font.BOLD, 14));
		Male.setBounds(317, 227, 68, 23);
		frame.getContentPane().add(Male);
		
		JRadioButton Female = new JRadioButton("Female");
		Female.setFont(new Font("Tahoma", Font.BOLD, 14));
		Female.setBounds(410, 227, 89, 23);
		frame.getContentPane().add(Female);
		
		JDateChooser date = new JDateChooser();
		date.setBounds(317, 276, 257, 20);
		frame.getContentPane().add(date);
		
		JButton SignUpbtn = new JButton("Sign Up");
		SignUpbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				if(username.getText().equals("") || pass1.getPassword().toString().equals("") || pass2.getPassword().toString().equals(""))
				{
					JOptionPane.showMessageDialog(null, "Information missing","Error", JOptionPane.ERROR_MESSAGE);
					return;
				}
				else if (pass1.getPassword().toString().equals(pass2.getPassword().toString()))
				{
					JOptionPane.showMessageDialog(null, "Both password field must be same","Error", JOptionPane.ERROR_MESSAGE);
				}
				
				
				
				String gender;
				
				if(Female.isSelected())
				{
					gender="F";
					
				}
				else
				{
					gender="M";
				}
				
				
				//System.out.println(password.getPassword().toString());
				
				Customer p=new Customer();
				p.setUsername(username.getText());
				p.setPassword(String.valueOf(pass1.getPassword()));
				
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
				String d = sdf.format(date.getDate());
				p.setDob(d);
				p.setAddress(address.getText());
				p.setFullname(fname.getText());
				p.setGender(gender);
				p.setContact(contact.getText());
				//System.out.println("hello\n");
				
				try {
					database db=new database();
					
					db.signUp(p);
				
					JOptionPane.showMessageDialog(null, "Sucessfully created","Done", JOptionPane.INFORMATION_MESSAGE);
					frame.dispose();
					
						
					
					
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					
					e1.printStackTrace();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					JOptionPane.showMessageDialog(null, "Username may already exist","Error", JOptionPane.ERROR_MESSAGE);
					
					e1.printStackTrace();
				} 
				
				
				
				frame.dispose();
			
			}
		});
		SignUpbtn.setFont(new Font("Tahoma", Font.BOLD, 18));
		SignUpbtn.setBounds(450, 612, 124, 38);
		frame.getContentPane().add(SignUpbtn);
		
		JButton Cancel = new JButton("Cancel");
		Cancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frame.dispose();
			}
		});
		Cancel.setFont(new Font("Tahoma", Font.BOLD, 18));
		Cancel.setBounds(167, 612, 124, 38);
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
