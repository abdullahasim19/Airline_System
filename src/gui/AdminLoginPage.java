package gui;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JTextField;

import classes.Admin;
import classes.Person;
import classes.database;

import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;


public class AdminLoginPage {

	private JFrame frame;
	private JTextField userrname;
	private JPasswordField password;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminLoginPage window = new AdminLoginPage();
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
	public AdminLoginPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(102, 205, 170));
		frame.setBounds(100, 100, 836, 599);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Admin Login");
		lblNewLabel.setIcon(new ImageIcon(AdminLoginPage.class.getResource("/imgs/adminlg.png")));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 55));
		lblNewLabel.setBounds(186, 40, 490, 158);
		frame.getContentPane().add(lblNewLabel);
		
		userrname = new JTextField();
		userrname.setBounds(389, 270, 264, 30);
		frame.getContentPane().add(userrname);
		userrname.setColumns(10);
		
		password = new JPasswordField();
		password.setBounds(389, 353, 264, 30);
		frame.getContentPane().add(password);
		
		JLabel lblNewLabel_1 = new JLabel("Username");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel_1.setBounds(186, 263, 170, 37);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Password");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel_1_1.setBounds(186, 346, 170, 37);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JButton loginbtn = new JButton("Login");
		loginbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				Person p=new Admin();
				p.setUsername(userrname.getText());
				p.setPassword(password.getPassword().toString());
				
				try {
					database d=new database();
					
					boolean b = d.login(p);
					
					if(b)
					{
						AdminMainPage ap = new AdminMainPage();
						ap.setVisible(true);
						frame.dispose();
					}
					else
					{
						JOptionPane.showMessageDialog(null, "Invalid username or password","Error", JOptionPane.ERROR_MESSAGE);
					}
					
					
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} 
				
				
				
			}
		});
		loginbtn.setIcon(new ImageIcon(AdminLoginPage.class.getResource("/imgs/login.png")));
		loginbtn.setFont(new Font("Tahoma", Font.BOLD, 20));
		loginbtn.setBounds(510, 450, 164, 57);
		frame.getContentPane().add(loginbtn);
		
		JButton Cancel = new JButton("Cancel");
		Cancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				FrontPage fp =new FrontPage();
				fp.setVisible(true);
				frame.dispose();
			}
		});
		Cancel.setIcon(new ImageIcon(AdminLoginPage.class.getResource("/imgs/close.png")));
		Cancel.setFont(new Font("Tahoma", Font.BOLD, 20));
		Cancel.setBounds(192, 450, 164, 57);
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
