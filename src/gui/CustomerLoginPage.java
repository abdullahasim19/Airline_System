package gui;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import classes.Customer;
import classes.GUI;
import java.awt.Color;

public class CustomerLoginPage {

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
					CustomerLoginPage window = new CustomerLoginPage();
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
	public CustomerLoginPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(210, 180, 140));
		frame.setBounds(100, 100, 809, 585);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		JLabel lblNewLabel = new JLabel("Customer Login");
		lblNewLabel.setIcon(new ImageIcon(AdminLoginPage.class.getResource("/imgs/adminlg.png")));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 55));
		lblNewLabel.setBounds(129, 47, 628, 158);
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
				
				if(userrname.getText().equals("") || password.getPassword().toString().equals(""))
				{
					JOptionPane.showMessageDialog(null, "Information missing","Error", JOptionPane.ERROR_MESSAGE);
					return;
				}
				
				//System.out.println(password.getPassword().toString());
				
				Customer p=new Customer();
				p.setUsername(userrname.getText());
				p.setPassword(String.valueOf(password.getPassword()));
				
				//System.out.println("hello\n");
				
				GUI g=new GUI();
				boolean b = g.userLoginButton(p);
				
				if(b)
				{
					CustomerMainPage ap = new CustomerMainPage(p);
					//ap.setCustomer((Customer) p);
					ap.setVisible(true);
					frame.dispose();
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Invalid username or password","Error", JOptionPane.ERROR_MESSAGE);
				}
				
				
				
			}
		});
		
		loginbtn.setIcon(new ImageIcon(AdminLoginPage.class.getResource("/imgs/login.png")));
		loginbtn.setFont(new Font("Tahoma", Font.BOLD, 20));
		loginbtn.setBounds(590, 450, 164, 57);
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
		Cancel.setBounds(76, 450, 164, 57);
		frame.getContentPane().add(Cancel);
		
		JButton SignUp = new JButton("Sign up");
		SignUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SignUpPage sp=new SignUpPage();
				
				sp.setVisible(true);
			}
		});
		SignUp.setIcon(new ImageIcon(CustomerLoginPage.class.getResource("/imgs/signup.png")));
		SignUp.setFont(new Font("Tahoma", Font.BOLD, 20));
		SignUp.setBounds(332, 450, 164, 57);
		frame.getContentPane().add(SignUp);
	}
	
	
	
	public void setVisible(boolean b) {
	
		frame.setVisible(b);
	}

	public void pack() {
	
		frame.pack();
	}

	public void setLocationRelativeTo(Object object) {
		
		frame.setLocationRelativeTo(null);
	}

	public void setExtendedState(int maximizedBoth) {
		
		frame.setExtendedState(JFrame.NORMAL);
	}

}
